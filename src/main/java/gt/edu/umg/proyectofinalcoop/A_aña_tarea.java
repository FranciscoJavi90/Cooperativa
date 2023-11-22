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

public class A_aña_tarea extends javax.swing.JFrame {

    private Connection conexion;

    public A_aña_tarea() {
        initComponents();
        this.conectar();
    }

    public void conectar() {
        BaseDatos bd = new BaseDatos();
        conexion = bd.getConexion();
        mostrarTareas();
        mostrarClientes();
    }

    public void mostrarTareas() {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Id");
    modelo.addColumn("Nombre tarea");
    modelo.addColumn("Costo tarea");
    Tabla1.setModel(modelo);
    
    String busqueda = busqueda1.getText(); 
    String sql = "";
    if (busqueda.equals("")) {
        sql = "SELECT idTarea, nombre_tarea, costo_tarea FROM mantenimiento";
    } else {
        sql = "SELECT idTarea, nombre_tarea, costo_tarea FROM mantenimiento WHERE nombre_tarea LIKE '%" + busqueda + "%' OR costo_tarea LIKE '%" + busqueda + "%' OR idTarea LIKE '%" + busqueda + "%'";
    }

    String datos1[] = new String[3];
    try {
        PreparedStatement stmt = conexion.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            datos1[0] = rs.getString(1);
            datos1[1] = rs.getString(2);
            datos1[2] = rs.getString(3);
            modelo.addRow(datos1);
        }
        Tabla1.setModel(modelo);
    } catch (SQLException ex) {
        Logger.getLogger(A_aña_tarea.class.getName()).log(Level.SEVERE, null, ex);
    }
}


public void mostrarClientes() {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Id");
    modelo.addColumn("Nombre");
    modelo.addColumn("Apellidos");
    Tabla.setModel(modelo);

    String busqueda2 = busqueda.getText();

    final String SELECT_CLIENTES = "SELECT id_cliente, Nombre, Apellidos FROM clientes";
    final String WHERE_CLAUSE = " WHERE Nombre LIKE ? OR Apellidos LIKE ? OR id_cliente LIKE ?";

    String sql = busqueda2.isEmpty() ? SELECT_CLIENTES : SELECT_CLIENTES + WHERE_CLAUSE;

    try (PreparedStatement ps = conexion.prepareStatement(sql)) {
        if (!busqueda2.isEmpty()) {
            ps.setString(1, "%" + busqueda2 + "%");
            ps.setString(2, "%" + busqueda2 + "%");
            ps.setString(3, "%" + busqueda2 + "%");
        }

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            String idCliente = rs.getString(1);
            String nombre = rs.getString(2);
            String apellidos = rs.getString(3);

            modelo.addRow(new String[] {idCliente, nombre, apellidos});
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
        jLabel6 = new javax.swing.JLabel();
        txtCostoTotal = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        busqueda = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnañadir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        busqueda1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnañadir1 = new javax.swing.JButton();
        IdProducto = new javax.swing.JTextField();
        btnañadir3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btn_reportes_r = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel2.setText("Id de tarea:");

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel3.setText("Id de cliente:");

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel4.setText("Fecha de registro:");

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        jLabel1.setText("Registro de tareas");

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

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel9.setText("Su Sistema apropiado de confianza...");

        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel6.setText("Costo total(Q):");

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
        jLabel11.setText("BUSCAR CLIENTE:");

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

        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel7.setText("Id:");

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
                        .addGap(145, 145, 145)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
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
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnregresar3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(busqueda1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(223, 223, 223)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnañadir, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnañadir3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(btnañadir1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(IdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFechaRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCostoTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40))
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_reportes_r, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_reportes_r, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCostoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnañadir3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnañadir1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(IdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(btnañadir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
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
        int idTarea = Integer.parseInt(txtIdTarea.getText());
        int idCliente = Integer.parseInt(txtIdCliente.getText());
        String fechaRegistro = txtFechaRegistro.getText();
        double costoTotal = Double.parseDouble(txtCostoTotal.getText());

        try {
            Statement stmt = conexion.createStatement();
            String sql = "INSERT INTO registros_tareas (idtarea, id_cliente, fecha_registro, costo_total) "
                    + "VALUES (" + idTarea + ", " + idCliente + ",'" + fechaRegistro + "', " + costoTotal + ")";

            int resultado = stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Registro de tarea guardado satisfactoriamente");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar el registro de tarea: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnañadirActionPerformed

    private void busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaActionPerformed
        mostrarClientes();
    }//GEN-LAST:event_busquedaActionPerformed

    private void busqueda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busqueda1ActionPerformed
        mostrarTareas();
    }//GEN-LAST:event_busqueda1ActionPerformed

    private void btnañadir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnañadir1ActionPerformed
        int idRegistroTarea = Integer.parseInt(IdProducto.getText());
        int idTarea = Integer.parseInt(txtIdTarea.getText());
        int idCliente = Integer.parseInt(txtIdCliente.getText());
        String fechaRegistro = txtFechaRegistro.getText();
        double costoTotal = Double.parseDouble(txtCostoTotal.getText());

        try {
            Statement stmt = conexion.createStatement();
            String sql = "UPDATE registros_tareas SET idtarea = " + idTarea + ", id_cliente = " + idCliente 
                    + ", fecha_registro = '" + fechaRegistro + "', costo_total = " + costoTotal 
                    + " WHERE id_registro_tarea = " + idRegistroTarea;

            int resultado = stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Registro de tarea actualizado satisfactoriamente");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el registro de tarea: " + ex.getMessage());
        }
    

    }//GEN-LAST:event_btnañadir1ActionPerformed

    private void btnañadir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnañadir3ActionPerformed
                                                 
        int idRegistroTarea = Integer.parseInt(IdProducto.getText());

        try {
            Statement stmt = conexion.createStatement();
            String sql = "DELETE FROM registros_tareas WHERE id_registro_tarea = " + idRegistroTarea;

            int resultado = stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Registro de tarea eliminado satisfactoriamente");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el registro de tarea: " + ex.getMessage());
        }
    

    }//GEN-LAST:event_btnañadir3ActionPerformed

    private void btn_reportes_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportes_rActionPerformed
        Document documento = new Document();

        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte_Tareas.pdf"));
            documento.open();

            PdfPTable tabla = new PdfPTable(5);
            tabla.addCell("Id registro tarea");
            tabla.addCell("Id tarea");
            tabla.addCell("Id cliente");
            tabla.addCell("Fecha registro");
            tabla.addCell("Costo total");
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/pfcoop", "root", "root");
                PreparedStatement pst = cn.prepareStatement("select *from registros_tareas");
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    do {
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
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
            java.util.logging.Logger.getLogger(A_aña_tarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A_aña_tarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A_aña_tarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A_aña_tarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new A_aña_tarea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdProducto;
    private javax.swing.JTable Tabla;
    private javax.swing.JTable Tabla1;
    private javax.swing.JButton btn_reportes_r;
    private javax.swing.JButton btnañadir;
    private javax.swing.JButton btnañadir1;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtCostoTotal;
    private javax.swing.JTextField txtFechaRegistro;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdTarea;
    // End of variables declaration//GEN-END:variables
}
