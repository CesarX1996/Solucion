/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Forms;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblClientes = new javax.swing.JLabel();
        lblProductos = new javax.swing.JLabel();
        lblUsuarios = new javax.swing.JLabel();
        lblVentas = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();

        lblClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Clientes.jpg"))); // NOI18N
        lblClientes.setText("jLabel1");
        lblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClientesMouseClicked(evt);
            }
        });

        lblProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Productos.jpg"))); // NOI18N
        lblProductos.setText("jLabel1");
        lblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProductosMouseClicked(evt);
            }
        });

        lblUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Usuarios.jpg"))); // NOI18N
        lblUsuarios.setText("jLabel1");
        lblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUsuariosMouseClicked(evt);
            }
        });

        lblVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ventas.jpg"))); // NOI18N
        lblVentas.setText("jLabel1");
        lblVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVentasMouseClicked(evt);
            }
        });

        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar.jpg"))); // NOI18N
        lblCerrar.setText("jLabel1");
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(lblVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClientesMouseClicked
        Clientes cl = new Clientes();
        cl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblClientesMouseClicked

    private void lblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductosMouseClicked
        Inventario ip = new Inventario();
        ip.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblProductosMouseClicked

    private void lblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuariosMouseClicked
        Usuarios u = new Usuarios();
        u.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblUsuariosMouseClicked

    private void lblVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVentasMouseClicked
        Ventas v = new Ventas(1);
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblVentasMouseClicked

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        Login frm = new Login();
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_lblCerrarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblUsuarios;
    private javax.swing.JLabel lblVentas;
    // End of variables declaration//GEN-END:variables
}
