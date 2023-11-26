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

public class ArregloClientes {

    private final ArrayList<Cliente> clientes = new ArrayList<>();
    public int contador = 0;
    int contadorfila = 0;

    public void guardarCli(Cliente nuevoCli) {
        clientes.add(nuevoCli);
    }

    public void eliminarCli(int posicion) {
        clientes.remove(posicion);
    }

    public void modificarCli(JTable tblCliente, JTextField txtCodCliente, JTextField txtNombreCliente, JTextField txtCelularCliente, JTextField txtDNICliente) {
        int fila = tblCliente.getSelectedRow();
        if (contador == 0) {
            int DNIcliente = (int) tblCliente.getValueAt(fila, 2);
            Cliente encontrado = obtenerCli(DNIcliente);
            txtCodCliente.setText(String.valueOf(encontrado.getCodigo()));
            txtNombreCliente.setText(encontrado.getNombre());
            txtCelularCliente.setText(String.valueOf(encontrado.getCelular()));
            txtDNICliente.setText(String.valueOf(encontrado.getDNI()));
            contador++;
        } else {
            clientes.get(fila).setNombre(txtNombreCliente.getText());
            clientes.get(fila).setCodigo(Integer.parseInt(txtCodCliente.getText()));
            clientes.get(fila).setCelular(Integer.parseInt(txtCelularCliente.getText()));
            clientes.get(fila).setDNI(Integer.parseInt(txtDNICliente.getText()));
            contador = 0;
            ActualizarTablaCli(tblCliente);
            txtNombreCliente.setText("");
            txtCodCliente.setText("");
            txtCelularCliente.setText("");
            txtDNICliente.setText("");
            txtNombreCliente.requestFocus();
        }
    }

    public void ActualizarTablaCli(JTable tblCliente) {
        DefaultTableModel dtm = (DefaultTableModel) tblCliente.getModel();
        Object nf[] = {};

        for (int i = (contadorfila - 1); i >= 0; i--) {
            dtm.removeRow(i);
        }
        contadorfila = 0;
        Cliente p;
        for (Object obj : clientes) {
            p = (Cliente) obj;
            dtm.addRow(nf);
            tblCliente.setValueAt(p.getCodigo(), contadorfila, 0);
            tblCliente.setValueAt(p.getNombre(), contadorfila, 1);
            tblCliente.setValueAt(p.getDNI(), contadorfila, 2);
            tblCliente.setValueAt(p.getCelular(), contadorfila, 3);
            contadorfila++;
        }
    }

    public Cliente obtenerCli(int DNI) {
        Cliente encontrado = new Cliente();
        boolean existe = false;
        for (int i = 0; i < clientes.size(); i++) {
            if (DNI == clientes.get(i).getDNI()) {
                encontrado = clientes.get(i);
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

    public void LeerClientes() {
        File file = new File("Clientes.txt");
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String linea = scan.nextLine();
                Scanner delimitar = new Scanner(linea);
                delimitar.useDelimiter("\\s*,\\s*");
                Cliente p = new Cliente(
                        Integer.parseInt(delimitar.next()),
                        delimitar.next(),
                        Integer.parseInt(delimitar.next()),
                        Integer.parseInt(delimitar.next()));
                clientes.add(p);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error ", "leer", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void GuardarClientes() {
        try {
            FileWriter fw = new FileWriter("Clientes.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            Cliente s;
            for (Object obj : clientes) {
                s = (Cliente) obj;
                bw.write(s.getCodigo() + "," + s.getNombre() + "," + s.getDNI() + "," + s.getCelular() + "\n");
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ", "respaldo", JOptionPane.ERROR_MESSAGE);
        }
    }
}
