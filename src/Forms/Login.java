package Forms;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import Clases.Usuario;

public class Login extends javax.swing.JFrame {

    private final ArrayList<Usuario> usuarios = new ArrayList<>();
    boolean ingreso = false;

    public Login() {
        initComponents();
        leerUsuarios();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fabricaciones2_1.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN DE ACCESO");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPasswordField1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 230, 28));

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 230, 28));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("Contraseña: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 80, -1));

        btnIngresar.setBackground(new java.awt.Color(9, 89, 239));
        btnIngresar.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login_Entrar.png"))); // NOI18N
        btnIngresar.setText("INGRESAR");
        btnIngresar.setBorder(null);
        btnIngresar.setDefaultCapable(false);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 140, 44));

        btnSalir.setBackground(new java.awt.Color(9, 89, 239));
        btnSalir.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login_Salir.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setBorder(null);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 140, 44));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jLabel4.setText("Restaurante Lima");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 270, 50));

        setSize(new java.awt.Dimension(552, 347));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int rpta = JOptionPane.showOptionDialog(this, "¿SEGURO DE SALIR?",
                "MENSAJE DE CONFIRMACION", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (rpta == 0)
            System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        if (txtUsuario.getText().equals("") || jPasswordField1.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "INGRESAR TODOS LOS CAMPOS", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
        } else {
            for (int i = 0; i < usuarios.size(); i++) {
                if (usuarios.get(i).getNombre().equals(txtUsuario.getText()) && usuarios.get(i).getContraseña().equals(jPasswordField1.getText())) {
                    ingreso = true;
                    Inicio frm = new Inicio();
                    frm.setVisible(true);
                    this.dispose();
                }
            }
            if (ingreso == false) {
                JOptionPane.showMessageDialog(this, "USUARIO Y/O CONTRASEÑA INCORRECTA", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
            }
        }
        limpiarYcentrar();
    }//GEN-LAST:event_btnIngresarActionPerformed

    void limpiarYcentrar() {
        txtUsuario.setText("");
        jPasswordField1.setText("");
        txtUsuario.requestFocus();
    }

    private void leerUsuarios() {
        File file = new File("Usuarios.txt");
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String linea = scan.nextLine();
                Scanner delimitar = new Scanner(linea);
                delimitar.useDelimiter("\\s*,\\s*");
                Usuario s = new Usuario(
                        Integer.parseInt(delimitar.next()),
                        delimitar.next(), Integer.parseInt(delimitar.next()), delimitar.next(), delimitar.next());
                usuarios.add(s);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "ERROR ", "LEER", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
