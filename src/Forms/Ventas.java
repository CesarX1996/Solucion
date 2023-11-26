package Forms;

import Clases.ArregloClientes;
import Clases.ArregloDetalleVenta;
import Clases.ArregloProductos;
import Clases.ArregloUsuarios;
import Clases.ArregloVentas;
import Clases.Cliente;
import Clases.DetalleVenta;
import Clases.Producto;
import Clases.Venta;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Ventas extends javax.swing.JFrame {

    //LIMPIAR TABLAS Y SOBREESCRIBIR
    ArregloProductos objPro = new ArregloProductos();
    ArregloVentas objVen = new ArregloVentas();
    ArregloDetalleVenta objDet = new ArregloDetalleVenta();
    ArregloClientes objCli = new ArregloClientes();
    ArregloUsuarios objUsu = new ArregloUsuarios();
    private int nroVenta;
    private int totalVenta = 0;
    private String fecha = "" + LocalDate.now().getYear() + LocalDate.now().getMonthValue() + LocalDate.now().getDayOfMonth();
    int contadorfila = 0;

    public Ventas(int nroVenta) {
        initComponents();
        this.setLocationRelativeTo(null);
        objPro.LeerCategorias();
        objPro.LeerProductos();
        objCli.LeerClientes();
        objUsu.LeerUsuarios();
        objUsu.llenarCBVendedor(cbVendedor);
        limpiarYCentrar();
        this.nroVenta=nroVenta;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBuscarProducto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductoVenta = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombrePV = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCategoriaPV = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        txtPrecioPV = new javax.swing.JTextField();
        txtStockPV = new javax.swing.JTextField();
        txtCantidadPV = new javax.swing.JTextField();
        btnAgregarPV = new javax.swing.JButton();
        txtDNICli = new javax.swing.JTextField();
        txtNombCli = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProdVta = new javax.swing.JTable();
        btnEliminarPV = new javax.swing.JButton();
        txtCambio = new javax.swing.JTextField();
        btnTerminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbVendedor = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPagaCon = new javax.swing.JTextField();

        jLabel3.setText("Nombre del producto a Buscar");

        jLabel4.setText("Nombre del Producto");

        jLabel5.setText("Categoria");

        jLabel6.setText("Precio");

        txtBuscarProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarProductoKeyPressed(evt);
            }
        });

        jLabel7.setText("Stock");

        tblProductoVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Busqueda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductoVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductoVentaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductoVenta);

        jLabel8.setText("Cantidad");

        jLabel9.setText("DNI Cliente");

        jLabel10.setText("Nombre del Cliente");

        btnRegresar.setBackground(new java.awt.Color(9, 89, 239));
        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        txtCantidadPV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadPVKeyTyped(evt);
            }
        });

        btnAgregarPV.setBackground(new java.awt.Color(9, 89, 239));
        btnAgregarPV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarPV.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarPV.setText("AGREGAR");
        btnAgregarPV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPVActionPerformed(evt);
            }
        });

        txtDNICli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDNICliKeyPressed(evt);
            }
        });

        tblProdVta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Precio", "SubTotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblProdVta);

        btnEliminarPV.setBackground(new java.awt.Color(9, 89, 239));
        btnEliminarPV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminarPV.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarPV.setText("ELIMINAR");
        btnEliminarPV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPVActionPerformed(evt);
            }
        });

        btnTerminar.setBackground(new java.awt.Color(9, 89, 239));
        btnTerminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTerminar.setForeground(new java.awt.Color(255, 255, 255));
        btnTerminar.setText("TERMINAR");
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setText("Total");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Venta_Banner.jpg"))); // NOI18N

        jLabel11.setText("Vendedor");

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel12.setText("Paga con");

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel13.setText("Cambio");

        txtPagaCon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPagaConKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(txtBuscarProducto)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtStockPV, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(txtCantidadPV)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCategoriaPV, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtPrecioPV, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnAgregarPV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombrePV)
                            .addComponent(btnEliminarPV, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel9)
                                .addGap(71, 71, 71))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtDNICli, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombCli, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(cbVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCambio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1)
                                        .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnTerminar, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(txtPagaCon, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombrePV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(txtPrecioPV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCategoriaPV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCantidadPV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStockPV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregarPV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarPV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10))
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDNICli, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombCli, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPagaCon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        Inicio i = new Inicio();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtBuscarProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarProductoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtBuscarProducto.getText().equals("")) {
                objPro.ActualizarTablaProVenta(tblProductoVenta, txtBuscarProducto.getText());
            }
        }
    }//GEN-LAST:event_txtBuscarProductoKeyPressed

    private void btnAgregarPVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPVActionPerformed
        if (txtNombrePV.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SELECCIONAR UN PRODUCTO",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (txtCantidadPV.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "INGRESAR UNA CANTIDAD",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (Integer.parseInt(txtCantidadPV.getText()) > Integer.parseInt(txtStockPV.getText())) {
            JOptionPane.showMessageDialog(this, "CANTIDAD MAYOR QUE EL STOCK",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            txtCantidadPV.setText("");
            txtCantidadPV.requestFocus();
        } else {
            Producto encontrado = objPro.obtenerPro(txtNombrePV.getText());
            DetalleVenta nuevoProVta = new DetalleVenta();
            nuevoProVta.setCodVenta(fecha + "-" + nroVenta);
            nuevoProVta.setNomProducto(encontrado.getNombre());
            nuevoProVta.setCantidad(Integer.parseInt(txtCantidadPV.getText()));
            nuevoProVta.setPrecio(encontrado.getPrecio());
            nuevoProVta.setSubTotal(encontrado.getPrecio() * Integer.parseInt(txtCantidadPV.getText()));
            objDet.guardarPV(nuevoProVta);
            objDet.ActualizarTablaProVta(tblProdVta);
            txtTotal.setText("" + objDet.actualizarTotal(fecha, nroVenta));
            objPro.actualizarStockAgregar(txtNombrePV, txtCantidadPV);
            limpiarYCentrar();

        }
    }//GEN-LAST:event_btnAgregarPVActionPerformed

    private void tblProductoVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductoVentaMouseClicked
        objPro.seleccionarProducto(tblProductoVenta, txtNombrePV, txtCategoriaPV, txtPrecioPV, txtStockPV);
        txtCantidadPV.requestFocus();
    }//GEN-LAST:event_tblProductoVentaMouseClicked

    private void btnEliminarPVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPVActionPerformed
        try {
            int fila = tblProdVta.getSelectedRow();
            objPro.actualizarStockEliminar(fila, tblProdVta);
            objDet.eliminarPV(fila);
            objDet.ActualizarTablaProVta(tblProdVta);
            txtTotal.setText("" + objDet.actualizarTotal(fecha, nroVenta));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "SELECCIONAR UNA FILA",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarPVActionPerformed

    private void txtDNICliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNICliKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtDNICli.getText().equals("")) {
                Cliente encontrado = objCli.obtenerCli(Integer.parseInt(txtDNICli.getText()));
                if (encontrado != null) {
                    txtNombCli.setText(encontrado.getNombre());
                } else {
                    JOptionPane.showMessageDialog(this, "NO SE ENCONTRO CLIENTE CON ESE DNI",
                            "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_txtDNICliKeyPressed

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        if (txtNombCli.getText().equals("") || cbVendedor.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "INGRESAR TODOS LOS DATOS NECESARIOS",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (txtPagaCon.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "INGRESAR CON CUANTO PAGA",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            Venta nuevaVenta = new Venta();
            nuevaVenta.setCodigo(fecha + "-" + nroVenta);
            nuevaVenta.setFechaVenta(LocalDate.now().toString());
            nuevaVenta.setCliente(objCli.obtenerCli(Integer.parseInt(txtDNICli.getText())));
            nuevaVenta.setVendedor(objUsu.obtenerUsu((String) cbVendedor.getSelectedItem()));
            nuevaVenta.setImporteTotal(Double.parseDouble(txtTotal.getText()));
            objVen.guardarVenta(nuevaVenta);
            nroVenta++;
            limpiarYCentrar();
            txtTotal.setText("");
            txtPagaCon.setText("");
            txtCambio.setText("");
            objPro.GuardarProductos();
            objVen.GuardarVentas();
            objDet.GuardarDetalleVentas();
            Ventas v = new Ventas(nroVenta);
            v.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnTerminarActionPerformed

    private void txtPagaConKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagaConKeyPressed
        DecimalFormat df = new DecimalFormat("###0.00");
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (Double.parseDouble(txtPagaCon.getText()) >= Double.parseDouble(txtTotal.getText())) {
                txtCambio.setText("" + df.format(Double.parseDouble(txtPagaCon.getText()) - Double.parseDouble(txtTotal.getText())));
            } else {
                txtPagaCon.setText("");
                JOptionPane.showMessageDialog(this, "INGRESAR UNA CANTIDAD MAYOR AL TOTAL",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_txtPagaConKeyPressed

    private void txtCantidadPVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadPVKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadPVKeyTyped
    void limpiarYCentrar() {
        txtBuscarProducto.setText("");
        txtNombrePV.setText("");
        txtCategoriaPV.setText("");
        txtCantidadPV.setText("");
        txtPrecioPV.setText("");
        txtStockPV.setText("");
        txtBuscarProducto.requestFocus();
        txtDNICli.setText("");
        txtNombCli.setText("");
        cbVendedor.setSelectedIndex(-1);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarPV;
    private javax.swing.JButton btnEliminarPV;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JComboBox<String> cbVendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblProdVta;
    private javax.swing.JTable tblProductoVenta;
    private javax.swing.JTextField txtBuscarProducto;
    private javax.swing.JTextField txtCambio;
    private javax.swing.JTextField txtCantidadPV;
    private javax.swing.JTextField txtCategoriaPV;
    private javax.swing.JTextField txtDNICli;
    private javax.swing.JTextField txtNombCli;
    private javax.swing.JTextField txtNombrePV;
    private javax.swing.JTextField txtPagaCon;
    private javax.swing.JTextField txtPrecioPV;
    private javax.swing.JTextField txtStockPV;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
