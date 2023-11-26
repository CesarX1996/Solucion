package Clases;

public class DetalleVenta {

    private String nomProducto;
    private int cantidad;
    private double precio;
    private double subTotal;
    private String codVenta;

    public DetalleVenta() {
    }

    public DetalleVenta(String nomProducto, int cantidad, double precio, double subTotal, String codVenta) {
        this.nomProducto = nomProducto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subTotal = subTotal;
        this.codVenta = codVenta;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public String getCodVenta() {
        return codVenta;
    }

    public void setCodVenta(String codVenta) {
        this.codVenta = codVenta;
    }

}
