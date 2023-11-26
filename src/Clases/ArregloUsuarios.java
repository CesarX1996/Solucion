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

public class ArregloUsuarios {

    public final ArrayList<Usuario> usuarios = new ArrayList<>();
    public int contador = 0;
    int contadorfila = 0;

    public void guardarUsu(Usuario nuevoUsu) {
        usuarios.add(nuevoUsu);
    }

    public void eliminarUsu(int posicion) {
        usuarios.remove(posicion);
    }

    public void modificarUsu(JTable tblUsuarios, JTextField txtCodUsuario, JTextField txtNombreUsuario, JTextField txtContrasenaUsuario, JTextField txtDNIUsuario, JComboBox cbRolUsuario) {
        int fila = tblUsuarios.getSelectedRow();
        int columna = tblUsuarios.getSelectedColumn();
        if (contador == 0) {
            String nombreUsuario = (String) tblUsuarios.getValueAt(fila, 1);
            Usuario encontrado = obtenerUsu(nombreUsuario);
            txtCodUsuario.setText(String.valueOf(encontrado.getCodigo()));
            txtNombreUsuario.setText(encontrado.getNombre());
            cbRolUsuario.setSelectedItem(encontrado.getRol());
            txtContrasenaUsuario.setText(encontrado.getContraseña());
            txtDNIUsuario.setText(String.valueOf(encontrado.getDNI()));
            contador++;
        } else {
            usuarios.get(fila).setNombre(txtNombreUsuario.getText());
            usuarios.get(fila).setCodigo(Integer.parseInt(txtCodUsuario.getText()));
            usuarios.get(fila).setContraseña(txtContrasenaUsuario.getText());
            usuarios.get(fila).setRol(String.valueOf(cbRolUsuario.getSelectedItem()));
            usuarios.get(fila).setDNI(Integer.parseInt(txtDNIUsuario.getText()));
            contador = 0;
            ActualizarTablaUsu(tblUsuarios);
            txtNombreUsuario.setText("");
            txtCodUsuario.setText("");
            txtContrasenaUsuario.setText("");
            txtDNIUsuario.setText("");
            cbRolUsuario.setSelectedIndex(-1);
            txtNombreUsuario.requestFocus();
        }
    }

    public void ActualizarTablaUsu(JTable tblUsuario) {
        DefaultTableModel dtm = (DefaultTableModel) tblUsuario.getModel();
        Object nf[] = {};

        for (int i = (contadorfila - 1); i >= 0; i--) {
            dtm.removeRow(i);
        }
        contadorfila = 0;
        Usuario p;
        for (Object obj : usuarios) {
            p = (Usuario) obj;
            dtm.addRow(nf);
            tblUsuario.setValueAt(p.getCodigo(), contadorfila, 0);
            tblUsuario.setValueAt(p.getNombre(), contadorfila, 1);
            tblUsuario.setValueAt(p.getContraseña(), contadorfila, 2);
            tblUsuario.setValueAt(p.getDNI(), contadorfila, 3);
            tblUsuario.setValueAt(p.getRol(), contadorfila, 4);
            contadorfila++;
        }
    }

    public Usuario obtenerUsu(String nombre) {
        Usuario encontrado = new Usuario();
        boolean existe = false;
        for (int i = 0; i < usuarios.size(); i++) {
            if (nombre.equals(usuarios.get(i).getNombre())) {
                encontrado = usuarios.get(i);
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

    public void llenarCBVendedor(JComboBox cbVendedor) {
        for (int i = 0; i < usuarios.size(); i++) {
            cbVendedor.addItem((String) usuarios.get(i).getNombre());
        }
    }

    public void LeerUsuarios() {
        File file = new File("Usuarios.txt");
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String linea = scan.nextLine();
                Scanner delimitar = new Scanner(linea);
                delimitar.useDelimiter("\\s*,\\s*");
                Usuario p = new Usuario(
                        Integer.parseInt(delimitar.next()),
                        delimitar.next(),
                        Integer.parseInt(delimitar.next()),
                        delimitar.next(), delimitar.next());
                usuarios.add(p);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error ", "leer", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void GuardarUsuarios() {
        try {
            FileWriter fw = new FileWriter("Usuarios.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            Usuario s;
            for (Object obj : usuarios) {
                s = (Usuario) obj;
                bw.write(s.getCodigo() + "," + s.getNombre() + "," + s.getDNI() + "," + s.getContraseña() + "," + s.getRol() + "\n");
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ", "respaldo", JOptionPane.ERROR_MESSAGE);
        }
    }
}
