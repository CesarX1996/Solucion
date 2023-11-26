package Clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ArregloCategorias {

    private final ArrayList<Categoria> categorias = new ArrayList<>();
    private int contadorfila;

    public void guardarCtg(Categoria nuevaCtg) {
        categorias.add(nuevaCtg);
    }

    public void eliminarCtg(int posicion) {
        categorias.remove(posicion);
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

    public void ActualizarTablaCtg(JTable tblCategoria) {
        DefaultTableModel dtm = (DefaultTableModel) tblCategoria.getModel();
        Object nf[] = {};

        for (int i = (contadorfila - 1); i >= 0; i--) {
            dtm.removeRow(i);
        }
        contadorfila = 0;

        Categoria p;
        for (Object obj : categorias) {
            p = (Categoria) obj;
            dtm.addRow(nf);
            tblCategoria.setValueAt(p.getIdCategoria(), contadorfila, 0);
            tblCategoria.setValueAt(p.getNombre(), contadorfila, 1);
            contadorfila++;
        }
    }

    public void guardarCategorias() {
        try {
            FileWriter fw = new FileWriter("Categorias.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            Categoria s;
            for (Object obj : categorias) {
                s = (Categoria) obj;
                bw.write(s.getIdCategoria() + "," + s.getNombre() + "\n");
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR ", "GUARDAR", JOptionPane.ERROR_MESSAGE);
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

}
