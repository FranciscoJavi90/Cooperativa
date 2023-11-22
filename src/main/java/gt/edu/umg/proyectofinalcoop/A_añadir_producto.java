
package gt.edu.umg.proyectofinalcoop;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class A_añadir_producto extends javax.swing.JFrame {
    private Connection conexion;

    public A_añadir_producto() {
        initComponents();
        this.conectar();
    }
    public void conectar(){        
        BaseDatos bd = new BaseDatos ();
        conexion = bd.getConexion();
        
    }
    void limpiar(){
        NombreProducto.setText("");
        Cantidad.setText("");
        Costo.setText("");
        Unidad.setText("");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnregresar3 = new javax.swing.JButton();
        btnañadir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Cantidad = new javax.swing.JTextField();
        NombreProducto = new javax.swing.JTextField();
        Costo = new javax.swing.JTextField();
        Unidad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnañadir1 = new javax.swing.JButton();
        IdProducto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnañadir2 = new javax.swing.JButton();
        btn_reportes_r = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(102, 204, 0));
        jPanel2.setForeground(new java.awt.Color(51, 204, 0));
        jPanel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 63, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        btnañadir.setBackground(new java.awt.Color(0, 0, 0));
        btnañadir.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        btnañadir.setForeground(new java.awt.Color(153, 204, 0));
        btnañadir.setText("Guardar");
        btnañadir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnañadir.setBorderPainted(false);
        btnañadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnañadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnañadirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel3.setText("Cantidad:");

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel4.setText("Costo:");

        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel6.setText("Id:");

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        jLabel1.setText("AÑADIR PRODUCTOS");

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel9.setText("Su Sistema apropiado de confianza...");

        btnañadir1.setBackground(new java.awt.Color(0, 0, 0));
        btnañadir1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        btnañadir1.setForeground(new java.awt.Color(153, 204, 0));
        btnañadir1.setText("Modificar");
        btnañadir1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnañadir1.setBorderPainted(false);
        btnañadir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnañadir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnañadir1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel7.setText("Unidad:");

        btnañadir2.setBackground(new java.awt.Color(0, 0, 0));
        btnañadir2.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        btnañadir2.setForeground(new java.awt.Color(153, 204, 0));
        btnañadir2.setText("Eliminar");
        btnañadir2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnañadir2.setBorderPainted(false);
        btnañadir2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnañadir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnañadir2ActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Unidad, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                    .addComponent(Costo)
                                    .addComponent(Cantidad)
                                    .addComponent(NombreProducto))))
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(btnañadir, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnregresar3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(184, 184, 184))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_reportes_r, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnañadir2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(btnañadir1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(IdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Unidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(31, 31, 31)
                .addComponent(btnañadir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnañadir2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnañadir1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(btn_reportes_r, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnregresar3)
                .addGap(49, 49, 49))
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
    String nombreProducto = NombreProducto.getText();
    int cantidad = Integer.parseInt(Cantidad.getText());
    double costoProducto = Double.parseDouble(Costo.getText());
    String unidad = Unidad.getText();
    limpiar();
    String sql = "INSERT INTO productos (nombre_producto, cantidad, costo_producto, unidad) "
            + "VALUES ('" + nombreProducto + "', " + cantidad + ", " + costoProducto + ", '" + unidad + "')";

    try {
        Statement st = conexion.createStatement();
        int resultado = st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Producto guardado satisfactoriamente");
        limpiar();
    } catch (Exception error) {
        JOptionPane.showMessageDialog(null, "Error al guardar producto " + error);
    }
    }//GEN-LAST:event_btnañadirActionPerformed

    private void btnañadir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnañadir1ActionPerformed
    int idProducto = Integer.parseInt(IdProducto.getText());
    String nombreProducto = NombreProducto.getText();
    int cantidad = Integer.parseInt(Cantidad.getText());
    double costoProducto = Double.parseDouble(Costo.getText());
    String unidad = Unidad.getText();
    String sql = "UPDATE productos SET nombre_producto='" + nombreProducto + "', cantidad=" + cantidad + ", costo_producto=" + costoProducto + ", unidad='" + unidad + "' WHERE idproducto=" + idProducto;
    try {
        Statement st = conexion.createStatement();
        int resultado = st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Producto actualizado satisfactoriamente");
        limpiar();
    } catch (Exception error) {
        JOptionPane.showMessageDialog(null, "Error al actualizar producto " + error);
    }

    }//GEN-LAST:event_btnañadir1ActionPerformed

    private void btnañadir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnañadir2ActionPerformed
    int idProducto = Integer.parseInt(IdProducto.getText());
    limpiar();
    String sql = "DELETE FROM productos WHERE idproducto = " + idProducto;

    try {
        Statement st = conexion.createStatement();
        int resultado = st.executeUpdate(sql);
        if (resultado > 0) {
            JOptionPane.showMessageDialog(null, "Producto eliminado satisfactoriamente");
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún producto con el ID especificado");
        }
    } catch (Exception error) {
        JOptionPane.showMessageDialog(null, "Error al eliminar producto " + error);
    }
    }//GEN-LAST:event_btnañadir2ActionPerformed

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
            java.util.logging.Logger.getLogger(A_añadir_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A_añadir_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A_añadir_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A_añadir_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new A_añadir_producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cantidad;
    private javax.swing.JTextField Costo;
    private javax.swing.JTextField IdProducto;
    private javax.swing.JTextField NombreProducto;
    private javax.swing.JTextField Unidad;
    private javax.swing.JButton btn_reportes_r;
    private javax.swing.JButton btnañadir;
    private javax.swing.JButton btnañadir1;
    private javax.swing.JButton btnañadir2;
    private javax.swing.JButton btnregresar3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
