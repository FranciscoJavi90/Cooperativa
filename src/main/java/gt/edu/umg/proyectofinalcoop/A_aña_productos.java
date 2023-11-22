package gt.edu.umg.proyectofinalcoop;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.DriverManager;


public class A_aña_productos extends javax.swing.JFrame {

    private Connection conexion;

    public A_aña_productos() {
        initComponents();
        this.conectar();
    }

    public void conectar() {
        BaseDatos bd = new BaseDatos();
        conexion = bd.getConexion();
        mostrarTareas();
        mostrarProductos();
    }

public void mostrarTareas() {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Id Registro");
    modelo.addColumn("Id Tarea");
    modelo.addColumn("Id Cliente");
    modelo.addColumn("Fecha Registro");
    modelo.addColumn("Costo Total");
    Tabla1.setModel(modelo);
    
    String busqueda3 = busqueda1.getText(); 
    String sql = "";
    if (busqueda3.equals("")) {
        sql = "SELECT id_registro_tarea, idTarea, id_cliente, fecha_registro, costo_total FROM registros_tareas";
    } else {
        sql = "SELECT id_registro_tarea, idTarea, id_cliente, fecha_registro, costo_total FROM registros_tareas WHERE id_registro_tarea LIKE '%" + busqueda3 + "%' OR idTarea LIKE '%" + busqueda3 + "%' OR id_cliente LIKE '%" + busqueda3 + "%'";
    }

    String datos1[] = new String[5];
    try {
        PreparedStatement stmt = conexion.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            datos1[0] = rs.getString(1);
            datos1[1] = rs.getString(2);
            datos1[2] = rs.getString(3);
            datos1[3] = rs.getString(4);
            datos1[4] = rs.getString(5);
            modelo.addRow(datos1);
        }
        Tabla1.setModel(modelo);
    } catch (SQLException ex) {
        Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
    }
}


public void mostrarProductos() {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Id");
    modelo.addColumn("Nombre");
    modelo.addColumn("Costo");
    modelo.addColumn("Unidad");
    Tabla.setModel(modelo);

    String busqueda2 = busqueda.getText();

    final String SELECT_PRODUCTOS = "SELECT idproducto, nombre_producto, costo_producto, unidad FROM productos";
    final String WHERE_CLAUSE = " WHERE nombre_producto LIKE ? OR costo_producto LIKE ? OR idproducto LIKE ?";

    String sql = busqueda2.isEmpty() ? SELECT_PRODUCTOS : SELECT_PRODUCTOS + WHERE_CLAUSE;

    try (PreparedStatement ps = conexion.prepareStatement(sql)) {
        if (!busqueda2.isEmpty()) {
            ps.setString(1, "%" + busqueda2 + "%");
            ps.setString(2, "%" + busqueda2 + "%");
            ps.setString(3, "%" + busqueda2 + "%");
        }

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            String idProducto = rs.getString(1);
            String nombre = rs.getString(2);
            String costo = rs.getString(3);
            String unidad = rs.getString(4);

            modelo.addRow(new String[] {idProducto, nombre, costo, unidad});
        }

        Tabla.setModel(modelo);
    } catch (SQLException ex) {
        Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
    }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        txtIdTarea = new javax.swing.JTextField();
        btnregresar3 = new javax.swing.JButton();
        txtFechaRegistro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        busqueda = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnañadir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        busqueda1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btn_reportes = new javax.swing.JButton();
        btnañadir3 = new javax.swing.JButton();
        btn_reportes_r = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel2.setText("Id de producto:");

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel3.setText("Id de registro de tareas :");

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel4.setText("Cantidad utilizada:");

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        jLabel1.setText("Registro de productos");

        jPanel2.setBackground(new java.awt.Color(102, 204, 0));
        jPanel2.setForeground(new java.awt.Color(51, 204, 0));
        jPanel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnregresar3.setBackground(new java.awt.Color(0, 0, 0));
        btnregresar3.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        btnregresar3.setForeground(new java.awt.Color(153, 204, 0));
        btnregresar3.setText("Regresar... ");
        btnregresar3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnregresar3.setBorderPainted(false);
        btnregresar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnregresar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresar3ActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel9.setText("Su Sistema apropiado de confianza...");

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(Tabla);

        busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel10.setText("BUSCAR TAREA:");

        btnañadir.setBackground(new java.awt.Color(0, 0, 0));
        btnañadir.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        btnañadir.setForeground(new java.awt.Color(153, 204, 0));
        btnañadir.setText("Registrar");
        btnañadir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnañadir.setBorderPainted(false);
        btnañadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnañadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnañadirActionPerformed(evt);
            }
        });

        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(Tabla1);

        busqueda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busqueda1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel11.setText("BUSCAR PRODUCTO:");

        btn_reportes.setBackground(new java.awt.Color(0, 0, 0));
        btn_reportes.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        btn_reportes.setForeground(new java.awt.Color(153, 204, 0));
        btn_reportes.setText("Modificar");
        btn_reportes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_reportes.setBorderPainted(false);
        btn_reportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportesActionPerformed(evt);
            }
        });

        btnañadir3.setBackground(new java.awt.Color(0, 0, 0));
        btnañadir3.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        btnañadir3.setForeground(new java.awt.Color(153, 204, 0));
        btnañadir3.setText("Eliminar");
        btnañadir3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnañadir3.setBorderPainted(false);
        btnañadir3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnañadir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnañadir3ActionPerformed(evt);
            }
        });

        btn_reportes_r.setBackground(new java.awt.Color(0, 0, 0));
        btn_reportes_r.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        btn_reportes_r.setForeground(new java.awt.Color(153, 204, 0));
        btn_reportes_r.setText("Reportes");
        btn_reportes_r.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_reportes_r.setBorderPainted(false);
        btn_reportes_r.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_reportes_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportes_rActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(5, 5, 5)
                                .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(busqueda1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnañadir3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(btn_reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(btnañadir, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(txtFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_reportes_r, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnregresar3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(btnañadir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnañadir3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_reportes_r, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(busqueda1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnregresar3)
                .addGap(5, 5, 5))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnregresar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresar3ActionPerformed
        Login_coop lgc = new Login_coop();
        lgc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnregresar3ActionPerformed

    private void btnañadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnañadirActionPerformed
    int idProducto = Integer.parseInt(txtIdTarea.getText());
    int idRegistroTarea = Integer.parseInt(txtIdCliente.getText());
    int cantidadUtilizada = Integer.parseInt(txtFechaRegistro.getText());

    try {
        Statement stmt = conexion.createStatement();
        String sql = "INSERT INTO registros_productos (idproducto, id_registro_tarea, cantidad_utilizada) "
                + "VALUES (" + idProducto + ", " + idRegistroTarea + "," + cantidadUtilizada + ")";

        int resultado = stmt.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Registro de producto guardado satisfactoriamente");

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al guardar el registro de producto: " + ex.getMessage());
    }


    }//GEN-LAST:event_btnañadirActionPerformed

    private void busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaActionPerformed
        mostrarProductos();
    }//GEN-LAST:event_busquedaActionPerformed

    private void busqueda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busqueda1ActionPerformed
        mostrarTareas();
    }//GEN-LAST:event_busqueda1ActionPerformed

    private void btn_reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportesActionPerformed
    int idProducto = Integer.parseInt(txtIdTarea.getText());
    int idRegistroTarea = Integer.parseInt(txtIdCliente.getText());
    int cantidadUtilizada = Integer.parseInt(txtFechaRegistro.getText());

    try {
        Statement stmt = conexion.createStatement();
        String sql = "UPDATE registros_productos SET cantidad_utilizada=" + cantidadUtilizada + " WHERE idproducto=" + idProducto + " AND id_registro_tarea=" + idRegistroTarea;

        int resultado = stmt.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Registro de producto actualizado satisfactoriamente");

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al actualizar el registro de producto: " + ex.getMessage());
    }

    }//GEN-LAST:event_btn_reportesActionPerformed

    private void btnañadir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnañadir3ActionPerformed
    int idProducto = Integer.parseInt(txtIdTarea.getText());
    int idRegistroTarea = Integer.parseInt(txtIdCliente.getText());

    try {
        Statement stmt = conexion.createStatement();
        String sql = "DELETE FROM registros_productos WHERE idproducto=" + idProducto + " AND id_registro_tarea=" + idRegistroTarea;

        int resultado = stmt.executeUpdate(sql);
        if (resultado > 0) {
            JOptionPane.showMessageDialog(null, "Registro de producto eliminado satisfactoriamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro de producto");
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al eliminar el registro de producto: " + ex.getMessage());
    }

    }//GEN-LAST:event_btnañadir3ActionPerformed

    private void btn_reportes_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportes_rActionPerformed
        Document documento = new Document();

        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte_Productos.pdf"));
            documento.open();

            PdfPTable tabla = new PdfPTable(4);
            tabla.addCell("Id registro Producto");
            tabla.addCell("Id producto");
            tabla.addCell("Id registro tarea");
            tabla.addCell("Cantidad utilizada");

            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/pfcoop", "root", "root");
                PreparedStatement pst = cn.prepareStatement("select *from productos");
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    do {
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                    } while (rs.next());
                    documento.add(tabla);
                }

            } catch (DocumentException | SQLException e) {
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado");
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
        }
    }//GEN-LAST:event_btn_reportes_rActionPerformed

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
            java.util.logging.Logger.getLogger(A_aña_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A_aña_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A_aña_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A_aña_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new A_aña_productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JTable Tabla1;
    private javax.swing.JButton btn_reportes;
    private javax.swing.JButton btn_reportes_r;
    private javax.swing.JButton btnañadir;
    private javax.swing.JButton btnañadir3;
    private javax.swing.JButton btnregresar3;
    private javax.swing.JTextField busqueda;
    private javax.swing.JTextField busqueda1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtFechaRegistro;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdTarea;
    // End of variables declaration//GEN-END:variables
}
