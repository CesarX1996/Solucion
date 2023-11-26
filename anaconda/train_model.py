# train_model.py

import tensorflow as tf
from tensorflow.keras.preprocessing.image import ImageDataGenerator
from tensorflow.keras.applications.mobilenet_v2 import MobileNetV2
from tensorflow.keras import layers, models
from PIL import Image

def train_model(train_data_dir):

    # Configuración de generadores de datos
    train_datagen = ImageDataGenerator(
        rescale=1./255,
        shear_range=0.2,
        zoom_range=0.2,
        horizontal_flip=True,
        validation_split=0.2
    )

    
    train_generator = train_datagen.flow_from_directory(
    train_data_dir,
    target_size=(224, 224),
    batch_size=32,
    class_mode='categorical',
    subset='training'
    )

    for img_path in train_generator.filepaths:
     try:
        Image.open(img_path)
     except Exception as e:
        print(f"Error al abrir la imagen {img_path}: {e}")
    validation_generator = train_datagen.flow_from_directory(
    train_data_dir,
    target_size=(224, 224),
    batch_size=32,
    class_mode='categorical',
    subset='validation'
   )

    for img_path in validation_generator.filepaths:
     try:
        Image.open(img_path)
     except Exception as e:
        print(f"Error al abrir la imagen de validación {img_path}: {e}")

    # Crear el modelo base MobileNetV2
    base_model = MobileNetV2(weights='imagenet', include_top=False, input_shape=(224, 224, 3))

    # Congelar las capas del modelo base
    for layer in base_model.layers:
        layer.trainable = False

    # Construir el modelo completo agregando capas personalizadas
    model = models.Sequential([
        base_model,
        layers.GlobalAveragePooling2D(),
        layers.Dense(128, activation='relu'),
        layers.Dropout(0.5),
        layers.Dense(3, activation='softmax')  # 3 clases: manzana, platano, mandarina
    ])

    # Compilar el modelo
    model.compile(optimizer='adam', loss='categorical_crossentropy', metrics=['accuracy'])

    # Entrenar el modelo
    model.fit(train_generator, epochs=10, validation_data=validation_generator)

    # Guardar el modelo y los pesos
    model.save('model_saved.h5')  # Guarda el modelo en un archivo llamado 'model_saved.h5'
    model.save_weights('weights_saved.h5')  # Guarda los pesos en un archivo llamado 'weights_saved.h5'

if __name__ == "__main__":
    train_data_dir = 'D:/imagnees'  # Ajusta la ruta a tu directorio de imágenes
    train_model(train_data_dir)