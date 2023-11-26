package Clases;

import java.util.Date;

public class Venta {

    private String codigo;
    private Cliente cliente;
    private Usuario vendedor;
    private double importeTotal;
    private String fechaVenta;

    public Venta() {
    }

    public Venta(String codigo, Cliente cliente, Usuario vendedor, double importeTotal, String fechaVenta) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.importeTotal = importeTotal;
        this.fechaVenta = fechaVenta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Usuario vendedor) {
        this.vendedor = vendedor;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

}
