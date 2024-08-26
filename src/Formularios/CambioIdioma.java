/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import BD.Idioma;
import static java.lang.System.getProperty;
import javax.swing.JOptionPane;

/**
 *
 * @author B450M
 */
public class CambioIdioma extends javax.swing.JFrame {

    /**
     * Creates new form CambioIdioma
     */
    public CambioIdioma() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        cambiarIdioma("Espanol");
    }

     public void cambiarIdioma(String nombreIdioma){
        
        idioma=new Idioma(nombreIdioma);
        Configuracion conf = new Configuracion();
         Configuracion.jbCuentas.setText(idioma.getProperty("cuentas"));
         btnIdiomas.setText(idioma.getProperty("cambio"));
        TituloCI.setText(idioma.getProperty("titulo"));
        CambiarIdioma.setText(idioma.getProperty("cambio"));
      
        
        
        
       
        
        cbCambioIdioma.removeAllItems();
        
        String idiomas[]={
                          idioma.getProperty("espanol"),
                          idioma.getProperty("ingles"),
                          idioma.getProperty("frances")
                          };
        
        for(int i=0;i<idiomas.length;i++){
            cbCambioIdioma.addItem(idiomas[i]);
        }
        
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
        jPanel2 = new javax.swing.JPanel();
        TituloCambioI = new javax.swing.JPanel();
        TituloCI = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CambiarIdioma = new javax.swing.JLabel();
        cbCambioIdioma = new javax.swing.JComboBox();
        btnIdiomas = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        TituloCambioI.setBackground(new java.awt.Color(0, 204, 255));

        TituloCI.setFont(new java.awt.Font("Forte", 0, 14)); // NOI18N
        TituloCI.setForeground(new java.awt.Color(255, 255, 255));
        TituloCI.setText("Cambiar idioma del software");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconfinder_adept_update_7685.png"))); // NOI18N

        javax.swing.GroupLayout TituloCambioILayout = new javax.swing.GroupLayout(TituloCambioI);
        TituloCambioI.setLayout(TituloCambioILayout);
        TituloCambioILayout.setHorizontalGroup(
            TituloCambioILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TituloCambioILayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TituloCI)
                .addGap(53, 53, 53))
        );
        TituloCambioILayout.setVerticalGroup(
            TituloCambioILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(TituloCambioILayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TituloCI, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        CambiarIdioma.setFont(new java.awt.Font("Forte", 0, 14)); // NOI18N
        CambiarIdioma.setForeground(new java.awt.Color(153, 153, 153));
        CambiarIdioma.setText("Cambiar idioma:");

        cbCambioIdioma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnIdiomas.setText("Aceptar");
        btnIdiomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdiomasActionPerformed(evt);
            }
        });

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconfinder_back_172570 (1).png"))); // NOI18N
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconfinder_00-ELASTOFONT-STORE-READY_close_2703079.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(CambiarIdioma)
                        .addGap(26, 26, 26)
                        .addComponent(cbCambioIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TituloCambioI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(btnIdiomas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TituloCambioI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCambioIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CambiarIdioma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btnIdiomas)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIdiomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdiomasActionPerformed
               
        switch(cbCambioIdioma.getSelectedIndex()){

            case 0:
                cambiarIdioma("Español");
                break;
            case 1:
                cambiarIdioma("Ingles");
                break;
            case 2:
                cambiarIdioma("Frances");
                break;

        }
        
       
        
    }//GEN-LAST:event_btnIdiomasActionPerformed

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        Configuracion conf = new Configuracion();
        conf.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Configuracion conf = new Configuracion();
        conf.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(CambioIdioma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambioIdioma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambioIdioma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambioIdioma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambioIdioma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CambiarIdioma;
    private javax.swing.JLabel TituloCI;
    private javax.swing.JPanel TituloCambioI;
    public static javax.swing.JButton btnIdiomas;
    private javax.swing.JComboBox cbCambioIdioma;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
public Idioma idioma;
}
