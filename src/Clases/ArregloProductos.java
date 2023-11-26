package Clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ArregloProductos {

    public final ArrayList<Producto> inventario = new ArrayList<>();
    private final ArrayList<Categoria> categorias = new ArrayList<>();
    public int contador = 0;
    int contadorfila = 0;

    public void guardarPro(Producto nuevoPro) {
        inventario.add(nuevoPro);
    }

    public void eliminarPro(int posicion) {
        inventario.remove(posicion);
    }

    public void modificarPro(JTable tblProductos, JTextField txtNombreProducto, JTextField txtIDProducto, JTextField txtPrecioProducto, JTextField txtStockProducto, JComboBox cbCtgProducto) {
        int fila = tblProductos.getSelectedRow();
        int columna = tblProductos.getSelectedColumn();
        if (contador == 0) {
            String nombreProd = (String) tblProductos.getValueAt(fila, 1);
            Producto encontrado = obtenerPro(nombreProd);
            txtNombreProducto.setText(encontrado.getNombre());
            txtIDProducto.setText(String.valueOf(encontrado.getCodigo()));
            cbCtgProducto.setSelectedItem(encontrado.getCategoria().getNombre());
            txtPrecioProducto.setText(String.valueOf(encontrado.getPrecio()));
            txtStockProducto.setText(String.valueOf(encontrado.getStock()));
            contador++;
        } else {
            inventario.get(fila).setCodigo(Integer.parseInt(txtIDProducto.getText()));
            inventario.get(fila).setNombre(txtNombreProducto.getText());
            inventario.get(fila).setCategoria(obtenerCtg(String.valueOf(cbCtgProducto.getSelectedItem())));
            inventario.get(fila).setPrecio(Double.parseDouble(txtPrecioProducto.getText()));
            inventario.get(fila).setStock(Integer.parseInt(txtStockProducto.getText()));
            contador = 0;
            ActualizarTablaPro(tblProductos);
            txtIDProducto.setText("");
            txtNombreProducto.setText("");
            txtPrecioProducto.setText("");
            txtStockProducto.setText("");
            cbCtgProducto.setSelectedIndex(-1);
            txtIDProducto.requestFocus();
        }
    }

    public void ActualizarTablaPro(JTable tblProductos) {
        DefaultTableModel dtm = (DefaultTableModel) tblProductos.getModel();
        Object nf[] = {};

        for (int i = (contadorfila - 1); i >= 0; i--) {
            dtm.removeRow(i);
        }
        contadorfila = 0;
        Producto p;
        for (Object obj : inventario) {
            p = (Producto) obj;
            dtm.addRow(nf);
            tblProductos.setValueAt(p.getCodigo(), contadorfila, 0);
            tblProductos.setValueAt(p.getNombre(), contadorfila, 1);
            tblProductos.setValueAt(p.getCategoria().getNombre(), contadorfila, 2);
            tblProductos.setValueAt(p.getPrecio(), contadorfila, 3);
            tblProductos.setValueAt(p.getStock(), contadorfila, 4);
            contadorfila++;
        }
    }

    public void ActualizarTablaProVenta(JTable tblProductos, String nombreProducto) {
        DefaultTableModel dtm = (DefaultTableModel) tblProductos.getModel();
        Object nf[] = {};

        for (int i = (contadorfila - 1); i >= 0; i--) {
            dtm.removeRow(i);
        }
        contadorfila = 0;
        Producto p;
        for (Object obj : inventario) {
            p = (Producto) obj;
            if (p.getNombre().contains(nombreProducto)) {
                dtm.addRow(nf);
                tblProductos.setValueAt(p.getNombre(), contadorfila, 0);
                contadorfila++;
            }
        }
    }

    public Producto obtenerPro(String nombre) {
        Producto encontrado = new Producto();
        boolean existe = false;
        for (int i = 0; i < inventario.size(); i++) {
            if (nombre.equalsIgnoreCase(inventario.get(i).getNombre())) {
                encontrado = inventario.get(i);
                existe = true;
                break;
            }
        }
        if (existe) {
            return encontrado;
        } else {
            return null;
        }
    }

    public void llenarCbCategoria(JComboBox cbCtgProducto) {
        for (int i = 0; i < categorias.size(); i++) {
            cbCtgProducto.addItem(String.valueOf(categorias.get(i)));
        }
    }

    public void seleccionarProducto(JTable tblProductoVenta, JTextField txtNombre, JTextField txtCategoria, JTextField txtPrecio, JTextField txtStock) {
        int fila = tblProductoVenta.getSelectedRow();
        String nombreProd = (String) tblProductoVenta.getValueAt(fila, 0);
        Producto encontrado = obtenerPro(nombreProd);
        txtNombre.setText(encontrado.getNombre());
        txtPrecio.setText(String.valueOf(encontrado.getPrecio()));
        txtStock.setText(String.valueOf(encontrado.getStock()));
        txtCategoria.setText(encontrado.getCategoria().toString());
    }

    public void actualizarStockAgregar(JTextField txtNombrePV, JTextField txtCantidadPV) {
        Producto encontrado = obtenerPro(txtNombrePV.getText());
        int nuevoStock = 0;
        nuevoStock = encontrado.getStock() - Integer.parseInt(txtCantidadPV.getText());
        for (int i = 0; i < inventario.size(); i++) {
            if (encontrado.getNombre().equals(inventario.get(i).getNombre())) {
                inventario.get(i).setStock(nuevoStock);
            }
        }
    }

    public void actualizarStockEliminar(int fila, JTable tblProdVta) {
        Producto encontrado = obtenerPro((String) tblProdVta.getValueAt(fila, 0));
        int nuevoStock = 0;
        nuevoStock = encontrado.getStock() + (int) tblProdVta.getValueAt(fila, 1);
        for (int i = 0; i < inventario.size(); i++) {
            if (encontrado.getNombre().equals(inventario.get(i).getNombre())) {
                inventario.get(i).setStock(nuevoStock);
            }
        }
    }

    public void LeerProductos() {
        File file = new File("Productos.txt");
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String linea = scan.nextLine();
                Scanner delimitar = new Scanner(linea);
                delimitar.useDelimiter("\\s*,\\s*");
                Producto p = new Producto(
                        Integer.parseInt(delimitar.next()),
                        delimitar.next(),
                        Double.parseDouble(delimitar.next()),
                        Integer.parseInt(delimitar.next()),
                        obtenerCtg(delimitar.next()));
                if (p.getCategoria() != null) {
                    inventario.add(p);
                }
            }
            scan.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error ", "leer", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void GuardarProductos() {
        try {
            FileWriter fw = new FileWriter("Productos.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            Producto s;
            for (Object obj : inventario) {
                s = (Producto) obj;
                bw.write(s.getCodigo() + "," + s.getNombre() + "," + s.getPrecio() + "," + s.getStock() + "," + s.getCategoria() + "\n");
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ", "respaldo", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void LeerCategorias() {
        File file = new File("Categorias.txt");
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String linea = scan.nextLine();
                Scanner delimitar = new Scanner(linea);
                delimitar.useDelimiter("\\s*,\\s*");
                Categoria ct = new Categoria(
                        Integer.parseInt(delimitar.next()),
                        delimitar.next());
                categorias.add(ct);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "ERROR ", "LEER", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Categoria obtenerCtg(String nombre) {
        Categoria encontrado = new Categoria();
        boolean existe = false;
        for (int i = 0; i < categorias.size(); i++) {
            if (nombre.equals(categorias.get(i).getNombre())) {
                encontrado = categorias.get(i);
                existe = true;
                break;
            }
        }
        if (existe) {
            return encontrado;
        } else {
            return null;
        }
    }
}
