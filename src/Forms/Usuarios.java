package Forms;

import Clases.ArregloUsuarios;
import Clases.Usuario;
import javax.swing.JOptionPane;

public class Usuarios extends javax.swing.JFrame {

    ArregloUsuarios objUsu = new ArregloUsuarios();

    public Usuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        objUsu.LeerUsuarios();
        objUsu.ActualizarTablaUsu(tblUsuarios);
        limpiarYCentrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbRolUsuario = new javax.swing.JComboBox<>();
        txtContraseñaUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCodUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        txtDNIUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        cbRolUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "EMPLEADO" }));
        cbRolUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRolUsuarioActionPerformed(evt);
            }
        });

        txtContraseñaUsuario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("Contraseña:");

        btnEliminar.setBackground(new java.awt.Color(9, 89, 239));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_Eliminar.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setToolTipText("");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("Rol:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Usuario_Banner.jpg"))); // NOI18N

        txtCodUsuario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Codigo: ");

        txtNombreUsuario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        btnRegresar.setBackground(new java.awt.Color(9, 89, 239));
        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(9, 89, 239));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_Modificar.png"))); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("Nombre:");

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Contraseña", "DNI", "Rol"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        btnGuardar.setBackground(new java.awt.Color(9, 89, 239));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_Guardar.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtDNIUsuario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("DNI:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtContraseñaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNombreUsuario)
                                        .addComponent(txtCodUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(cbRolUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDNIUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                        .addComponent(jLabel7)))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegresar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5)
                        .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContraseñaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDNIUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(3, 3, 3)
                        .addComponent(cbRolUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegresar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            int fila = tblUsuarios.getSelectedRow();
            objUsu.eliminarUsu(fila);
            objUsu.ActualizarTablaUsu(tblUsuarios);
            objUsu.contador = 0;
            limpiarYCentrar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "SELECCIONAR UNA FILA",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        objUsu.GuardarUsuarios();
        Inicio i = new Inicio();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            objUsu.modificarUsu(tblUsuarios, txtCodUsuario, txtNombreUsuario,
                    txtContraseñaUsuario, txtDNIUsuario, cbRolUsuario);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "SELECCIONAR UNA FILA",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtCodUsuario.getText().length() != 0 || txtNombreUsuario.getText().length() != 0 || txtDNIUsuario.getText().length() != 0
                || txtContraseñaUsuario.getText().length() != 0 || cbRolUsuario.getSelectedIndex() != -1) {
            try {
                Usuario nuevoUsu = new Usuario();
                nuevoUsu.setCodigo(Integer.parseInt(txtCodUsuario.getText()));
                nuevoUsu.setNombre(txtNombreUsuario.getText());
                nuevoUsu.setDNI(Integer.parseInt(txtDNIUsuario.getText()));
                nuevoUsu.setContraseña(txtContraseñaUsuario.getText());
                nuevoUsu.setRol(String.valueOf(cbRolUsuario.getSelectedItem()));
                objUsu.guardarUsu(nuevoUsu);
                objUsu.ActualizarTablaUsu(tblUsuarios);
                objUsu.contador = 0;
                limpiarYCentrar();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "FÓRMATO NO VÁLIDO", "ERROR", JOptionPane.ERROR_MESSAGE);
                limpiarYCentrar();
            }

        } else {
            JOptionPane.showMessageDialog(this, "RELLENAR TODOS LOS CAMPOS", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cbRolUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRolUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRolUsuarioActionPerformed
    void limpiarYCentrar() {
        txtCodUsuario.setText("");
        txtNombreUsuario.setText("");
        txtDNIUsuario.setText("");
        txtContraseñaUsuario.setText("");
        cbRolUsuario.setSelectedIndex(-1);
        txtCodUsuario.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbRolUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtCodUsuario;
    private javax.swing.JTextField txtContraseñaUsuario;
    private javax.swing.JTextField txtDNIUsuario;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
