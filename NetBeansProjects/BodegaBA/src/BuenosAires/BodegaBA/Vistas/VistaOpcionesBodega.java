/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuenosAires.BodegaBA.Vistas;

import BuenosAires.BodegaBA.Controladores.ControladorBodega;
import BuenosAires.Modelo.BodegaDespacho;
import BuenosAires.Modelo.BodegaProducto;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Liz
 */
public class VistaOpcionesBodega extends javax.swing.JFrame {

    ControladorBodega ctrlBodega = new ControladorBodega();
    /**
     * Creates new form VistaOpcionesBodega
     */
    public VistaOpcionesBodega() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfNombreProd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDescripcion = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        tfMarca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnGuardarProd = new javax.swing.JButton();
        jsPrecio = new javax.swing.JSpinner();
        jsCantidad = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtProductosBodega = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        jbListarProductos = new javax.swing.JButton();
        jSIDProducto = new javax.swing.JSpinner();
        jSCantidadAct = new javax.swing.JSpinner();
        panel1 = new java.awt.Panel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtOrdenDespacho = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnActualizar1 = new javax.swing.JButton();
        jbListarOrden = new javax.swing.JButton();
        jsDespachoId = new javax.swing.JSpinner();
        cbEstado = new javax.swing.JComboBox<>();
        m_opcionesbodega = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mi_salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mi_consultanwo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Bodega Buenos Aires");

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel2.setText("Nombre producto:");

        tfNombreProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreProdActionPerformed(evt);
            }
        });

        jLabel3.setText("Descripción: ");

        taDescripcion.setColumns(20);
        taDescripcion.setRows(5);
        jScrollPane1.setViewportView(taDescripcion);

        jLabel4.setText("Marca: ");

        tfMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMarcaActionPerformed(evt);
            }
        });

        jLabel5.setText("Precio: ");

        jLabel6.setText("En stock: ");

        btnGuardarProd.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnGuardarProd.setText("Guardar");
        btnGuardarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProdActionPerformed(evt);
            }
        });

        jsCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jsCantidadKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(btnGuardarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jsPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jsCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jsPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jsCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(btnGuardarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        jTabbedPane1.addTab("Agregar Producto", jPanel1);

        jtProductosBodega.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Producto", "Marca", "Precio", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtProductosBodega);

        jLabel7.setText("Ingrese ID: ");

        jLabel8.setText("Ingrese Cantidad: ");

        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jbListarProductos.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jbListarProductos.setText("Listar productos");
        jbListarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListarProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jSIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jSCantidadAct, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbListarProductos)))
                .addContainerGap(72, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jbListarProductos)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jSIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSCantidadAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jTabbedPane1.addTab("Actualizar Stock", jPanel2);

        jtOrdenDespacho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "N° orden", "Id Factura", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtOrdenDespacho.setFocusable(false);
        jScrollPane4.setViewportView(jtOrdenDespacho);

        jLabel9.setText("Ingrese n° orden:");

        jLabel10.setText("Seleccione estado:");

        btnActualizar1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnActualizar1.setText("Actualizar");
        btnActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar1ActionPerformed(evt);
            }
        });

        jbListarOrden.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jbListarOrden.setActionCommand("Listar orden");
        jbListarOrden.setLabel("Listar orden");
        jbListarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListarOrdenActionPerformed(evt);
            }
        });

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "EN PREPARACIÓN", "EN TRANSITO", "DESPACHADO" }));
        cbEstado.setOpaque(false);
        cbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsDespachoId, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(btnActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbListarOrden)))
                .addContainerGap(56, Short.MAX_VALUE))
            .addComponent(jScrollPane4)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jbListarOrden)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jsDespachoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Orden de despacho", panel1);

        jMenu1.setText("Opciones");

        mi_salir.setText("Salir");
        mi_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_salirActionPerformed(evt);
            }
        });
        jMenu1.add(mi_salir);

        m_opcionesbodega.add(jMenu1);

        jMenu2.setText("Anwo");

        mi_consultanwo.setText("Consulta/ Reserva Anwo");
        mi_consultanwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_consultanwoActionPerformed(evt);
            }
        });
        jMenu2.add(mi_consultanwo);

        m_opcionesbodega.add(jMenu2);

        setJMenuBar(m_opcionesbodega);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mi_consultanwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_consultanwoActionPerformed
        VistaInventarioAnwo va = new VistaInventarioAnwo();
        va.setVisible(true);
    }//GEN-LAST:event_mi_consultanwoActionPerformed

    private void mi_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_salirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mi_salirActionPerformed

    private void btnGuardarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProdActionPerformed
        BodegaProducto producto= new BodegaProducto();
        
        producto.setNombreProducto(tfNombreProd.getText());
        producto.setMarca(tfMarca.getText());
        producto.setDescripcion(taDescripcion.getText());
        producto.setPrecio((int)jsPrecio.getValue());
        producto.setCantidad((int)jsCantidad.getValue());
        
        try
        {
            ctrlBodega.almacenarProducto(producto);
            tfNombreProd.setText("");
            tfMarca.setText("");
            taDescripcion.setText("");
            jsPrecio.setValue(0);
            jsCantidad.setValue(0);
            JOptionPane.showMessageDialog(rootPane, "PRODUCTO ALMACENADO CORRECTAMENTE");
        }
        catch(Exception err)
        {
            JOptionPane.showMessageDialog(rootPane, "ERROR AL ALMACENAR: "+ err.getMessage());
        }
                                                 
    }//GEN-LAST:event_btnGuardarProdActionPerformed

    private void tfMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMarcaActionPerformed

    private void tfNombreProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreProdActionPerformed

    private void jbListarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarProductosActionPerformed
        ArrayList<BodegaProducto> listaProductos = new ArrayList<>();
        try
        {
            listaProductos = ctrlBodega.listarProductos();
            DefaultTableModel productoMostrar = (DefaultTableModel)jtProductosBodega.getModel();
            productoMostrar.setRowCount(0);
            
            for(BodegaProducto producto: listaProductos)
            {
                Object[] fila = 
                {
                    producto.getIdProducto(),
                    producto.getNombreProducto(),
                    producto.getMarca(),
                    producto.getPrecio(),
                    producto.getCantidad(),
                };
                productoMostrar.addRow(fila);
            }
            this.jtProductosBodega.setModel(productoMostrar);
        }
        catch(Exception err)
        {
            System.out.println("ERROR: "+ err.getMessage());
        }                                                             
    }//GEN-LAST:event_jbListarProductosActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        
        int idProducto = (int)jSIDProducto.getValue();
        int cantidad = (int)jSCantidadAct.getValue();
        try {
            ctrlBodega.actualizarCantidad(idProducto, cantidad);
            JOptionPane.showMessageDialog(rootPane, "PRODUCTO ACTUALIZADO CORRECTAMENTE");
            ArrayList<BodegaProducto> listaProductos = new ArrayList<>();
            try
            {
                listaProductos = ctrlBodega.listarProductos();
                DefaultTableModel productoMostrar = (DefaultTableModel)jtProductosBodega.getModel();
                productoMostrar.setRowCount(0);

                for(BodegaProducto producto: listaProductos)
                {
                    Object[] fila = 
                    {
                        producto.getIdProducto(),
                        producto.getNombreProducto(),
                        producto.getMarca(),
                        producto.getPrecio(),
                        producto.getCantidad(),
                    };
                    productoMostrar.addRow(fila);
                }
                this.jtProductosBodega.setModel(productoMostrar);
            }
            catch(Exception err)
            {
                System.out.println("ERROR: "+ err.getMessage());
            }  
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "ERROR AL ACTUALIZAR PRODUCTO");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void cbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEstadoActionPerformed

    private void jbListarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarOrdenActionPerformed
        ArrayList<BodegaDespacho> listaDespachos = new ArrayList<>();
        try
        {
            listaDespachos = ctrlBodega.listarDespachos();
            DefaultTableModel despachoMostrar = (DefaultTableModel)jtOrdenDespacho.getModel();
            despachoMostrar.setRowCount(0);

            for(BodegaDespacho orden: listaDespachos)
            {
                Object[] fila =
                {
                    orden.getIdOd(),
                    orden.getIdFactura(),
                    orden.getEstadoOd(),
                };
                despachoMostrar.addRow(fila);
            }
            this.jtOrdenDespacho.setModel(despachoMostrar);
        }
        catch(Exception err)
        {
            System.out.println("ERROR: "+ err.getMessage());
        }
    }//GEN-LAST:event_jbListarOrdenActionPerformed

    private void btnActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar1ActionPerformed
        int idOrden = (int)jsDespachoId.getValue();
        String estado = cbEstado.getSelectedItem().toString();
        try {
                ctrlBodega.actualizarEstado(idOrden, estado);
            JOptionPane.showMessageDialog(rootPane, "ORDEN ACTUALIZADA CORRECTAMENTE");
            ArrayList<BodegaDespacho> listaDespachos = new ArrayList<>();
            try
            {
                listaDespachos = ctrlBodega.listarDespachos();
                DefaultTableModel despachoMostrar = (DefaultTableModel)jtOrdenDespacho.getModel();
                despachoMostrar.setRowCount(0);

                for(BodegaDespacho orden: listaDespachos)
                {
                    Object[] fila =
                    {
                        orden.getIdOd(),
                        orden.getIdFactura(),
                        orden.getEstadoOd(),
                    };
                    despachoMostrar.addRow(fila);
                }
                this.jtOrdenDespacho.setModel(despachoMostrar);
            }
            catch(Exception err)
            {
                System.out.println("ERROR: "+ err.getMessage());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "ERROR AL ACTUALIZAR ORDEN");
        }
    }//GEN-LAST:event_btnActualizar1ActionPerformed

    private void jsCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jsCantidadKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jsCantidadKeyTyped

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VistaOpcionesBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaOpcionesBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaOpcionesBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaOpcionesBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaOpcionesBodega().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnActualizar1;
    private javax.swing.JButton btnGuardarProd;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner jSCantidadAct;
    private javax.swing.JSpinner jSIDProducto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbListarOrden;
    private javax.swing.JButton jbListarProductos;
    private javax.swing.JSpinner jsCantidad;
    private javax.swing.JSpinner jsDespachoId;
    private javax.swing.JSpinner jsPrecio;
    private javax.swing.JTable jtOrdenDespacho;
    private javax.swing.JTable jtProductosBodega;
    private javax.swing.JMenuBar m_opcionesbodega;
    private javax.swing.JMenuItem mi_consultanwo;
    private javax.swing.JMenuItem mi_salir;
    private java.awt.Panel panel1;
    private javax.swing.JTextArea taDescripcion;
    private javax.swing.JTextField tfMarca;
    private javax.swing.JTextField tfNombreProd;
    // End of variables declaration//GEN-END:variables
}