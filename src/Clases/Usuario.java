package Clases;

public class Usuario extends Persona {

    private String contraseña;
    private String rol;

    public Usuario() {
    }

    public Usuario(int codigo, String nombre, int DNI, String contraseña, String rol) {
        super(codigo, nombre, DNI);
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

}
