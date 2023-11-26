package Clases;

public class Persona {

    private int codigo;
    private String nombre;
    private int DNI;

    public Persona() {
    }

    public Persona(int codigo, String nombre, int DNI) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

}
