package Clases;

public class Categoria {

    private int codigo;
    private String nombre;

    public Categoria() {
    }

    public Categoria(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getIdCategoria() {
        return codigo;
    }

    public void setIdCategoria(int idCategoria) {
        this.codigo = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return String.format(nombre);
    }
}
