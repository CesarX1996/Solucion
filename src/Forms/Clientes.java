package Forms;

import Clases.ArregloClientes;
import Clases.Cliente;
import javax.swing.JOptionPane;

public class Clientes extends javax.swing.JFrame {

    ArregloClientes objCli = new ArregloClientes();

    public Clientes() {
        initComponents();
        this.setLocationRelativeTo(null);
        objCli.LeerClientes();
        objCli.ActualizarTablaCli(tblCliente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        txtIDCliente = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        txtNombreCliente = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        txtCelularCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        txtDNICliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnModificar1 = new javax.swing.JButton();

        btnRegresar.setBackground(new java.awt.Color(9, 89, 239));
        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        txtIDCliente.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

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

        txtNombreCliente.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

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

        txtCelularCliente.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "DNI", "Celular"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        txtDNICliente.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Codigo: ");

        btnEliminar.setBackground(new java.awt.Color(9, 89, 239));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_Eliminar.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Clientes_Banner.jpg"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("DNI:");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("Celular:");

        btnModificar1.setBackground(new java.awt.Color(9, 89, 239));
        btnModificar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnModificar1.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_Modificar.png"))); // NOI18N
        btnModificar1.setText("BUSCAR");
        btnModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDNICliente, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addComponent(txtCelularCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNombreCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtIDCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(btnModificar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5)
                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDNICliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegresar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        objCli.GuardarClientes();
        Inicio i = new Inicio();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtIDCliente.getText().length() != 0 || txtNombreCliente.getText().length() != 0 || txtDNICliente.getText().length() != 0
                || txtCelularCliente.getText().length() != 0) {
            try {
                Cliente nuevoCli = new Cliente();
                nuevoCli.setCodigo(Integer.parseInt(txtIDCliente.getText()));
                nuevoCli.setNombre(txtNombreCliente.getText());
                nuevoCli.setDNI(Integer.parseInt(txtDNICliente.getText()));
                nuevoCli.setCelular(Integer.parseInt(txtCelularCliente.getText()));
                objCli.guardarCli(nuevoCli);
                objCli.ActualizarTablaCli(tblCliente);
                objCli.contador = 0;
                limpiarYCentrar();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "FÓRMATO NO VÁLIDO", "ERROR", JOptionPane.ERROR_MESSAGE);
                limpiarYCentrar();
            }

        } else {
            JOptionPane.showMessageDialog(this, "RELLENAR TODOS LOS CAMPOS", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            objCli.modificarCli(tblCliente, txtIDCliente, txtNombreCliente,
                    txtCelularCliente, txtDNICliente);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "SELECCIONAR UNA FILA",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            int fila = tblCliente.getSelectedRow();
            objCli.eliminarCli(fila);
            objCli.ActualizarTablaCli(tblCliente);
            objCli.contador = 0;
            limpiarYCentrar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "SELECCIONAR UNA FILA",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificar1ActionPerformed
    void limpiarYCentrar() {
        txtIDCliente.setText("");
        txtNombreCliente.setText("");
        txtDNICliente.setText("");
        txtCelularCliente.setText("");
        txtIDCliente.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificar1;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtCelularCliente;
    private javax.swing.JTextField txtDNICliente;
    private javax.swing.JTextField txtIDCliente;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables
}
