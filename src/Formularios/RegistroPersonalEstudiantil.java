/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import BD.ConexionBD;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author B450M
 */
public class RegistroPersonalEstudiantil extends javax.swing.JFrame {

    /**
     * Creates new form RegistroPersonal
     */
    public RegistroPersonalEstudiantil() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtdni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtApellido1RP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtApellido2RP = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtFechaNRP = new javax.swing.JTextField();
        btnRegistrarP = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtTelefonoRP = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cbTDR = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNombre2RP = new javax.swing.JTextField();
        txtNombre1RP = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtDireccionRP = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtMailRP = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtAsistenteRP = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtTelARP = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtidhuella = new javax.swing.JLabel();
        id_huella = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdniActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Forte", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("2do Apellido: ");

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));

        jLabel5.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Registro de personal estudiantil");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconfinder_mypc_save_41757 (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconfinder_on-off_1370046.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconfinder_minus_172505.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        txtApellido1RP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellido1RPActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Forte", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("1er Apellido:");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Forte", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Número de documento:");

        jLabel8.setFont(new java.awt.Font("Forte", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Fecha de nacimiento(aa/mm/dd):");

        btnRegistrarP.setBackground(new java.awt.Color(0, 204, 255));
        btnRegistrarP.setFont(new java.awt.Font("Forte", 0, 12)); // NOI18N
        btnRegistrarP.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarP.setText("Registrar");
        btnRegistrarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setFont(new java.awt.Font("Forte", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Forte", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Teléfono:");

        jLabel12.setFont(new java.awt.Font("Forte", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("ID:");

        cbTDR.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 ", "2", "3", "4" }));

        jLabel14.setFont(new java.awt.Font("Forte", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("1er Nombre");

        jLabel15.setFont(new java.awt.Font("Forte", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("2do Nombre");

        jLabel17.setFont(new java.awt.Font("Forte", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel17.setText("Dirección:");

        jLabel18.setFont(new java.awt.Font("Forte", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("Mail:");

        jLabel19.setFont(new java.awt.Font("Forte", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 153, 153));
        jLabel19.setText("Contacto de emergencia:");

        jLabel20.setFont(new java.awt.Font("Forte", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 153, 153));
        jLabel20.setText("Teléfono de Contacto:");

        jLabel10.setFont(new java.awt.Font("Forte", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Los siguientes valores corresponden al tipo de documento:");

        jLabel13.setFont(new java.awt.Font("Forte", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("1 - Tarjeta de Identidad");

        jLabel16.setFont(new java.awt.Font("Forte", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("2 - Cédula de Ciudadanía");

        jLabel21.setFont(new java.awt.Font("Forte", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 153, 153));
        jLabel21.setText("3 - Cédula de Extranjería");

        jLabel22.setFont(new java.awt.Font("Forte", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 153, 153));
        jLabel22.setText("4 - Pasaporte");

        txtidhuella.setFont(new java.awt.Font("Forte", 0, 14)); // NOI18N
        txtidhuella.setForeground(new java.awt.Color(153, 153, 153));
        txtidhuella.setText("Id huella:");

        id_huella.setEditable(false);
        id_huella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_huellaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(63, 63, 63)
                        .addComponent(btnRegistrarP, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel12)
                                    .addComponent(txtidhuella))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtApellido2RP)
                                    .addComponent(txtTelefonoRP)
                                    .addComponent(txtFechaNRP)
                                    .addComponent(txtNombre2RP)
                                    .addComponent(txtNombre1RP)
                                    .addComponent(txtApellido1RP)
                                    .addComponent(txtdni)
                                    .addComponent(cbTDR, 0, 184, Short.MAX_VALUE)
                                    .addComponent(txtDireccionRP)
                                    .addComponent(txtMailRP)
                                    .addComponent(txtAsistenteRP)
                                    .addComponent(txtTelARP)
                                    .addComponent(id_huella))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(13, 13, 13)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel22))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cbTDR, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtdni))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtNombre1RP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtNombre2RP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellido1RP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellido2RP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtFechaNRP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTelefonoRP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtDireccionRP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtMailRP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtAsistenteRP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtTelARP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidhuella)
                    .addComponent(id_huella, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btnRegistrarP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdniActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int msjc = JOptionPane.showConfirmDialog(null, "¿Cancelar registro?");

        if (msjc == JOptionPane.YES_OPTION) {
            ExploPersonal exp = null;
            try {
                exp = new ExploPersonal();
            } catch (SQLException ex) {
                Logger.getLogger(RegistroPersonalEstudiantil.class.getName()).log(Level.SEVERE, null, ex);
            }
            exp.setVisible(true);
            this.setVisible(false);

        } else {
            if (msjc == JOptionPane.NO_OPTION) {

            } else {
                if (msjc == JOptionPane.CANCEL_OPTION) {
                    JOptionPane.showMessageDialog(null, "Cancelado");
                }
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        int msjc = JOptionPane.showConfirmDialog(null, "¿Realmente desea cerrar la aplicación?");

        if (msjc == JOptionPane.YES_OPTION) {
            System.exit(0);

        } else {
            if (msjc == JOptionPane.NO_OPTION) {

            } else {
                if (msjc == JOptionPane.CANCEL_OPTION) {
                    JOptionPane.showMessageDialog(null, "Cancelado");
                }
            }
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    public int buscaridUltimaHuella() {
        int idHuella = 0;
        ConexionBD con = new ConexionBD();
        Connection c = con.conectar();
        try {
            String cmd = "SELECT ID FROM huella ORDER by ID DESC LIMIT 0,1";
            PreparedStatement ConsultaUltimaHuella = c.prepareStatement(cmd);

            ResultSet idConsulta = ConsultaUltimaHuella.executeQuery();
            if (idConsulta.next()) {
                idHuella = idConsulta.getInt("ID");
            }
        } catch (SQLException e) {

        }
        return idHuella;
    }

    private void btnRegistrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPActionPerformed
        int idUltH = buscaridUltimaHuella();
        //String algo = Idhuella.toString(); 
        String td = cbTDR.getSelectedItem().toString();
        String dni = txtdni.getText();
        String nom1 = txtNombre1RP.getText();
        String nom2 = txtNombre2RP.getText();
        String ape1 = txtApellido1RP.getText();
        String ape2 = txtApellido2RP.getText();
        String fecha_nac = txtFechaNRP.getText();
        String tel = txtTelefonoRP.getText();
        String dir = txtDireccionRP.getText();
        String mail = txtMailRP.getText();
        String asistente = txtAsistenteRP.getText();
        String telAString = txtAsistenteRP.getText();

        String valorHuella = Integer.toString(idUltH);
        id_huella.setText(valorHuella);

        String SQL_INSERT = "INSERT INTO alumno (id_td,numero,1er_nombre,2do_nombre,1er_apellido,2do_apellido,fecha_nac,telefono,direccion,mail,asistente,tel_asistente,id_huella) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        if (!td.isEmpty()) {
            if (!dni.isEmpty()) {
                if (!nom1.isEmpty() || (!nom2.isEmpty())) {
                    if (!ape1.isEmpty() || (!ape2.isEmpty())) {
                        if (!fecha_nac.isEmpty()) {
                            if (!tel.isEmpty()) {
                                if (!dir.isEmpty()) {
                                    if (!mail.isEmpty()) {
                                        if (!asistente.isEmpty()) {
                                            if (!telAString.isEmpty()) {

                                                ConexionBD con = new ConexionBD();

                                                try (Connection conn = con.conectar();
                                                        PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT)) {

                                                    preparedStatement.setString(1, td);
                                                    preparedStatement.setString(2, dni);
                                                    preparedStatement.setString(3, nom1);
                                                    preparedStatement.setString(4, nom2);
                                                    preparedStatement.setString(5, ape1);
                                                    preparedStatement.setString(6, ape2);
                                                    preparedStatement.setString(7, fecha_nac);
                                                    preparedStatement.setString(8, tel);
                                                    preparedStatement.setString(9, dir);
                                                    preparedStatement.setString(10, mail);
                                                    preparedStatement.setString(11, asistente);
                                                    preparedStatement.setString(12, telAString);
                                                    preparedStatement.setString(13, valorHuella);

                                                    int row = preparedStatement.executeUpdate();
                                                    System.out.println("Se han guardado los datos correctamente");
                                                    JOptionPane.showMessageDialog(null, "Se han guardado los datos correctamente");
                                                    con.desconectar();
                                                    dispose();
                                                } catch (SQLException e) {
                                                    System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                }
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Por favor ingrese el telefono del asistente");
                                            }
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Por favor ingrese el asistente");
                                        }

                                    } else {
                                        JOptionPane.showMessageDialog(null, "Por favor ingrese el mail");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Por favor ingrese la dirección");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Por favor ingrese el telefono");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Por favor ingrese la fecha de nacimiento");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor ingrese el primer y/o segundo apellido");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese el primer nombre");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor ingrese el dni");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor ingrese el tipo de documento");
        }

        ExploPersonal ep = null;
        try {
            ep = new ExploPersonal();
        } catch (SQLException ex) {
            Logger.getLogger(RegistroPersonalEstudiantil.class.getName()).log(Level.SEVERE, null, ex);
        }
        ep.setVisible(true);
    }//GEN-LAST:event_btnRegistrarPActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setExtendedState(1);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txtApellido1RPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellido1RPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellido1RPActionPerformed

    private void id_huellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_huellaActionPerformed
        id_huella.setText("ft");
    }//GEN-LAST:event_id_huellaActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroPersonalEstudiantil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroPersonalEstudiantil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroPersonalEstudiantil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroPersonalEstudiantil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroPersonalEstudiantil().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRegistrarP;
    public javax.swing.JComboBox cbTDR;
    public javax.swing.JTextField id_huella;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField txtApellido1RP;
    public javax.swing.JTextField txtApellido2RP;
    public javax.swing.JTextField txtAsistenteRP;
    public javax.swing.JTextField txtDireccionRP;
    public javax.swing.JTextField txtFechaNRP;
    public javax.swing.JTextField txtMailRP;
    public javax.swing.JTextField txtNombre1RP;
    public javax.swing.JTextField txtNombre2RP;
    public javax.swing.JTextField txtTelARP;
    public javax.swing.JTextField txtTelefonoRP;
    public javax.swing.JTextField txtdni;
    private javax.swing.JLabel txtidhuella;
    // End of variables declaration//GEN-END:variables
}
