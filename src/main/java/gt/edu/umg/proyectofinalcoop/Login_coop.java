
package gt.edu.umg.proyectofinalcoop;

import java.sql.Connection;


public class Login_coop extends javax.swing.JFrame {
private Connection conexion;

    public Login_coop() {
        initComponents();
        this.conectar();
    }
    public void conectar(){        
        BaseDatos bd = new BaseDatos ();
        conexion = bd.getConexion();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnañadirs = new javax.swing.JButton();
        btnregresar = new javax.swing.JButton();
        btnañadirU = new javax.swing.JButton();
        btnservicios2 = new javax.swing.JButton();
        btntarea = new javax.swing.JButton();
        btnañadirs1 = new javax.swing.JButton();
        btnañadirs2 = new javax.swing.JButton();
        btn_obtenerC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 48)); // NOI18N
        jLabel1.setText("\"BIENVENIDO\" ");

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

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel2.setText("Su Sistema apropiado de confianza...");

        btnañadirs.setBackground(new java.awt.Color(0, 0, 0));
        btnañadirs.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        btnañadirs.setForeground(new java.awt.Color(153, 204, 0));
        btnañadirs.setText("Añadir cliente");
        btnañadirs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnañadirs.setBorderPainted(false);
        btnañadirs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnañadirs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnañadirsActionPerformed(evt);
            }
        });

        btnregresar.setBackground(new java.awt.Color(0, 0, 0));
        btnregresar.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        btnregresar.setForeground(new java.awt.Color(153, 204, 0));
        btnregresar.setText("Cerrar Sesión.");
        btnregresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnregresar.setBorderPainted(false);
        btnregresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });

        btnañadirU.setBackground(new java.awt.Color(0, 0, 0));
        btnañadirU.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        btnañadirU.setForeground(new java.awt.Color(153, 204, 0));
        btnañadirU.setText("Crear nuevo usuario");
        btnañadirU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnañadirU.setBorderPainted(false);
        btnañadirU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnañadirU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnañadirUActionPerformed(evt);
            }
        });

        btnservicios2.setBackground(new java.awt.Color(0, 0, 0));
        btnservicios2.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        btnservicios2.setForeground(new java.awt.Color(153, 204, 0));
        btnservicios2.setText("Añadir registro de producto");
        btnservicios2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnservicios2.setBorderPainted(false);
        btnservicios2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnservicios2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnservicios2ActionPerformed(evt);
            }
        });

        btntarea.setBackground(new java.awt.Color(0, 0, 0));
        btntarea.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        btntarea.setForeground(new java.awt.Color(153, 204, 0));
        btntarea.setText("Añadir registro de tarea");
        btntarea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btntarea.setBorderPainted(false);
        btntarea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btntarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntareaActionPerformed(evt);
            }
        });

        btnañadirs1.setBackground(new java.awt.Color(0, 0, 0));
        btnañadirs1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        btnañadirs1.setForeground(new java.awt.Color(153, 204, 0));
        btnañadirs1.setText("Añadir producto");
        btnañadirs1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnañadirs1.setBorderPainted(false);
        btnañadirs1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnañadirs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnañadirs1ActionPerformed(evt);
            }
        });

        btnañadirs2.setBackground(new java.awt.Color(0, 0, 0));
        btnañadirs2.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        btnañadirs2.setForeground(new java.awt.Color(153, 204, 0));
        btnañadirs2.setText("Añadir mantenimiento");
        btnañadirs2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnañadirs2.setBorderPainted(false);
        btnañadirs2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnañadirs2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnañadirs2ActionPerformed(evt);
            }
        });

        btn_obtenerC.setBackground(new java.awt.Color(0, 0, 0));
        btn_obtenerC.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        btn_obtenerC.setForeground(new java.awt.Color(153, 204, 0));
        btn_obtenerC.setText("Obtener clientes");
        btn_obtenerC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_obtenerC.setBorderPainted(false);
        btn_obtenerC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_obtenerC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_obtenerCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(224, 224, 224))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnañadirU, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnañadirs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnservicios2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnañadirs1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                            .addComponent(btntarea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnañadirs2, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
                        .addGap(0, 65, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(254, 254, 254)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(267, 267, 267)
                                .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addComponent(btn_obtenerC, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntarea, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnañadirU, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnañadirs, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnañadirs1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnservicios2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnañadirs2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_obtenerC, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnregresar)
                .addGap(62, 62, 62))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnañadirsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnañadirsActionPerformed
        A_añadir_asc añc = new A_añadir_asc ();
        añc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnañadirsActionPerformed

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        MClase cse = new MClase();
        cse.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_btnregresarActionPerformed

    private void btnañadirUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnañadirUActionPerformed
        A_usuarios_coop ucoop = new A_usuarios_coop();
        ucoop.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnañadirUActionPerformed

    private void btnservicios2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnservicios2ActionPerformed
        A_aña_productos ucoop = new A_aña_productos();
        ucoop.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnservicios2ActionPerformed

    private void btntareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntareaActionPerformed
        A_aña_tarea ucoop = new A_aña_tarea();
        ucoop.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btntareaActionPerformed

    private void btnañadirs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnañadirs1ActionPerformed
        A_añadir_producto ucoop = new A_añadir_producto();
        ucoop.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnañadirs1ActionPerformed

    private void btnañadirs2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnañadirs2ActionPerformed
        aña_serv ucoop = new aña_serv();
        ucoop.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnañadirs2ActionPerformed

    private void btn_obtenerCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_obtenerCActionPerformed
        actualizar_asc ucoop = new actualizar_asc();
        ucoop.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_obtenerCActionPerformed

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
            java.util.logging.Logger.getLogger(Login_coop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_coop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_coop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_coop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_coop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_obtenerC;
    private javax.swing.JButton btnañadirU;
    private javax.swing.JButton btnañadirs;
    private javax.swing.JButton btnañadirs1;
    private javax.swing.JButton btnañadirs2;
    private javax.swing.JButton btnregresar;
    private javax.swing.JButton btnservicios2;
    private javax.swing.JButton btntarea;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
