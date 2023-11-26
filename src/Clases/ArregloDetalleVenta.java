package Clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ArregloDetalleVenta {

    public final ArrayList<DetalleVenta> listaProdVta = new ArrayList<>();
    public int contador = 0;
    int contadorfila = 0;

    public void guardarPV(DetalleVenta nuevoPV) {
        listaProdVta.add(nuevoPV);
    }

    public void eliminarPV(int posicion) {
        listaProdVta.remove(posicion);
    }

    public void ActualizarTablaProVta(JTable tblProdVta) {
        DefaultTableModel dtm = (DefaultTableModel) tblProdVta.getModel();
        Object nf[] = {};

        for (int i = (contadorfila - 1); i >= 0; i--) {
            dtm.removeRow(i);
        }
        contadorfila = 0;
        DetalleVenta p;
        for (Object obj : listaProdVta) {
            p = (DetalleVenta) obj;
            dtm.addRow(nf);
            tblProdVta.setValueAt(p.getNomProducto(), contadorfila, 0);
            tblProdVta.setValueAt(p.getCantidad(), contadorfila, 1);
            tblProdVta.setValueAt(p.getPrecio(), contadorfila, 2);
            tblProdVta.setValueAt(p.getSubTotal(), contadorfila, 3);
            contadorfila++;
        }
    }

    public double actualizarTotal(String fecha, int nroVenta) {
        double total = 0;
        for (int i = 0; i < listaProdVta.size(); i++) {
            if (listaProdVta.get(i).getCodVenta().equals(fecha + "-" + nroVenta)) {
                total += (Double) listaProdVta.get(i).getSubTotal();
            }
        }
        return total;
    }

    public void GuardarDetalleVentas() {
        try {
            FileWriter fw = new FileWriter("DetalleVenta.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            DetalleVenta s;
            for (Object obj : listaProdVta) {
                s = (DetalleVenta) obj;
                bw.write(s.getCodVenta() + "," + s.getNomProducto() + "," + s.getCantidad() + "," + s.getPrecio() + "," + s.getSubTotal() + "\n");
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ", "respaldo", JOptionPane.ERROR_MESSAGE);
        }
    }
}
