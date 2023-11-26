package Clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ArregloVentas {

    private final ArrayList<Venta> ventas = new ArrayList<>();
    public int contador = 0;
    int contadorfila = 0;

    public void guardarVenta(Venta nuevaVenta) {
        ventas.add(nuevaVenta);
    }

    public void GuardarVentas() {
        try {
            FileWriter fw = new FileWriter("Ventas.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            Venta s;
            for (Object obj : ventas) {
                s = (Venta) obj;
                bw.write(s.getCodigo() + "," + s.getFechaVenta() + "," + s.getCliente().getNombre() + "," + 
                        s.getVendedor().getNombre() + "," + s.getImporteTotal() + "\n");
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ", "respaldo", JOptionPane.ERROR_MESSAGE);
        }
    }
   
}
