/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author rushikeshgadewar(TEST)
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomerEntry extends javax.swing.JFrame {
     Connection conn;
    PreparedStatement ps; 
    /**
     * Creates new form Login
     */
    public CustomerEntry() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        Label_Logo_CE = new javax.swing.JLabel();
        TextField_Ph_Pri_CE = new javax.swing.JTextField();
        Label_Ph_Pri_CE = new javax.swing.JLabel();
        Button_Login_CE = new javax.swing.JButton();
        Label_CustEntry_CE = new javax.swing.JLabel();
        Button_Back_CE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(java.awt.Color.darkGray);

        Label_Logo_CE.setFont(new java.awt.Font("Zapfino", 1, 36)); // NOI18N
        Label_Logo_CE.setText(" GRAND HYATT");

        TextField_Ph_Pri_CE.setFont(new java.awt.Font("STIX Two Text", 0, 14)); // NOI18N
        TextField_Ph_Pri_CE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_Ph_Pri_CEActionPerformed(evt);
            }
        });

        Label_Ph_Pri_CE.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        Label_Ph_Pri_CE.setText("PHONE NO.(PRIMARY)");

        Button_Login_CE.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        Button_Login_CE.setText("LOGIN");
        Button_Login_CE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Login_CEActionPerformed(evt);
            }
        });

        Label_CustEntry_CE.setFont(new java.awt.Font("STIX Two Text", 1, 18)); // NOI18N
        Label_CustEntry_CE.setText("CUSTOMER ENTRY");

        Button_Back_CE.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        Button_Back_CE.setText("BACK");
        Button_Back_CE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Back_CEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 187, Short.MAX_VALUE)
                .addComponent(Label_Logo_CE, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_Ph_Pri_CE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(Label_CustEntry_CE)
                            .addGap(358, 358, 358))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Button_Back_CE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Button_Login_CE))
                                .addComponent(TextField_Ph_Pri_CE, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(290, 290, 290)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Label_Logo_CE)
                .addGap(34, 34, 34)
                .addComponent(Label_CustEntry_CE)
                .addGap(41, 41, 41)
                .addComponent(Label_Ph_Pri_CE)
                .addGap(38, 38, 38)
                .addComponent(TextField_Ph_Pri_CE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Back_CE)
                    .addComponent(Button_Login_CE))
                .addContainerGap(210, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 20, 890, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextField_Ph_Pri_CEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_Ph_Pri_CEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_Ph_Pri_CEActionPerformed

    private void Button_Login_CEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Login_CEActionPerformed

        FinalCustomer fc = new FinalCustomer();
            fc.setVisible(true);
            fc.setLocationRelativeTo(null);
            this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Login_CEActionPerformed

    private void Button_Back_CEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Back_CEActionPerformed
        // TODO add your handling code here:
        MainScreen ms = new MainScreen();
            ms.setVisible(true);
            ms.setLocationRelativeTo(null);
            this.dispose();
    }//GEN-LAST:event_Button_Back_CEActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerEntry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Back_CE;
    private javax.swing.JButton Button_Login_CE;
    private javax.swing.JLabel Label_CustEntry_CE;
    private javax.swing.JLabel Label_Logo_CE;
    private javax.swing.JLabel Label_Ph_Pri_CE;
    private javax.swing.JTextField TextField_Ph_Pri_CE;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
