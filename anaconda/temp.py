import cv2
import tensorflow as tf
from tensorflow.keras.applications.mobilenet_v2 import preprocess_input, decode_predictions
import numpy as np

# Cargar el modelo MobileNetV2 preentrenado en ImageNet
model = tf.keras.applications.MobileNetV2(weights='imagenet')

# Función para clasificar la imagen
def classify_image(img):
    img = cv2.resize(img, (224, 224))
    img = np.expand_dims(img, axis=0)
    img = preprocess_input(img)

    predictions = model.predict(img)
    decoded_predictions = decode_predictions(predictions, top=1)[0]

    label = decoded_predictions[0][1]
    probability = decoded_predictions[0][2]
    return label, probability

# Función principal para clasificar en tiempo real desde la cámara web
def real_time_classification():
    cap = cv2.VideoCapture(0)

    while True:
        ret, frame = cap.read()
        if not ret:
            print("Error al capturar el cuadro de la cámara")
            break

        # Clasificar la imagen y mostrar resultados
        label, probability = classify_image(frame)
        cv2.putText(frame, f"{label} ({probability:.2f})", (10, 30), cv2.FONT_HERSHEY_SIMPLEX, 1, (0, 255, 0), 2)
        cv2.imshow('Clasificación en Tiempo Real', frame)

        # Salir del bucle cuando se presiona la tecla 'q'
        if cv2.waitKey(1) & 0xFF == ord('q'):
            break

    cap.release()
    cv2.destroyAllWindows()

# Llamar a la función principal para clasificar en tiempo real
real_time_classification()