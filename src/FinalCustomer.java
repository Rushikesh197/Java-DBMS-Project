
import java.awt.Dimension;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author rushikeshgadewar
 */
public class FinalCustomer extends javax.swing.JFrame {

    /**
     * Creates new form FinalCustomer
     */
    public FinalCustomer() {
        initComponents();
        this.setPreferredSize(new Dimension(1500, 1500));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        Label_Logo_FC = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Table_CustDets_FC = new javax.swing.JTable();
        Label_Room_Allot_FC = new javax.swing.JLabel();
        Label_ServiceDets_FC = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Table_RoomDets_FC = new javax.swing.JTable();
        Label_RoomDets_FC = new javax.swing.JLabel();
        Label_CustDets_FC = new javax.swing.JLabel();
        Label_CheckIN_FC = new javax.swing.JLabel();
        Label_Room_Type_FC = new javax.swing.JLabel();
        Label_Check_Out_FC = new javax.swing.JLabel();
        Label_Nos_Adults_FC = new javax.swing.JLabel();
        ComboBox_Room_Typr_FC = new javax.swing.JComboBox<>();
        TextField_CheckIN_FC = new javax.swing.JTextField();
        TextField_Check_Out_FC = new javax.swing.JTextField();
        TextField_Nos_Adults_FC = new javax.swing.JTextField();
        Label_Nos_Children_FC = new javax.swing.JLabel();
        TextField_Nos_Children_FC = new javax.swing.JTextField();
        Label_Service_Name_FC = new javax.swing.JLabel();
        Label_Service_Rate_FC = new javax.swing.JLabel();
        Button_Enter_ServiceDets_FC = new javax.swing.JButton();
        TextField_Service_Name_FC = new javax.swing.JTextField();
        TextField_Service_Rate_FC = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Services_Used_FC = new javax.swing.JTable();
        Label_Services_Used_FC = new javax.swing.JLabel();
        TextField_ToPay_FC = new javax.swing.JTextField();
        ComboBox_Via_FC = new javax.swing.JComboBox<>();
        Button_LogOut_FC = new javax.swing.JButton();
        Label_ToPay_FC = new javax.swing.JLabel();
        Label_Via_FC = new javax.swing.JLabel();

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "FNAME", "MNAME", "LNAME", "AADHAR", "PH. PRI", "PH. SEC", "EMAIL", "ADDRESS", "GENDER", "MARRIAGE", "DOB"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CASH", "CREDIT CARD", "DEBIT CARD", "CHEQUE" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(java.awt.Color.darkGray);

        Label_Logo_FC.setFont(new java.awt.Font("Zapfino", 1, 36)); // NOI18N
        Label_Logo_FC.setText(" GRAND HYATT");

        Table_CustDets_FC.setBorder(new javax.swing.border.MatteBorder(null));
        Table_CustDets_FC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "FNAME", "MNAME", "LNAME", "AADHAR", "PH. PRI", "PH. SEC", "EMAIL", "ADDRESS", "GENDER", "MARRIAGE", "DOB"
            }
        ));
        jScrollPane6.setViewportView(Table_CustDets_FC);

        Label_Room_Allot_FC.setFont(new java.awt.Font("STIX Two Text", 1, 18)); // NOI18N
        Label_Room_Allot_FC.setText("ROOM ALLOTMENT");

        Label_ServiceDets_FC.setFont(new java.awt.Font("STIX Two Text", 1, 18)); // NOI18N
        Label_ServiceDets_FC.setText("SERVICES DETAILS");

        Table_RoomDets_FC.setBorder(new javax.swing.border.MatteBorder(null));
        Table_RoomDets_FC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ROOM NO.", "TYPE", "STATUS", "RATE"
            }
        ));
        jScrollPane4.setViewportView(Table_RoomDets_FC);

        Label_RoomDets_FC.setFont(new java.awt.Font("STIX Two Text", 1, 18)); // NOI18N
        Label_RoomDets_FC.setText("ROOM DETAILS");

        Label_CustDets_FC.setFont(new java.awt.Font("STIX Two Text", 1, 18)); // NOI18N
        Label_CustDets_FC.setText("CUSTOMER DETAILS");

        Label_CheckIN_FC.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        Label_CheckIN_FC.setText("CHECK IN DATE");

        Label_Room_Type_FC.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        Label_Room_Type_FC.setText("ROOM TYPE");

        Label_Check_Out_FC.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        Label_Check_Out_FC.setText("CHECK OUT DATE");

        Label_Nos_Adults_FC.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        Label_Nos_Adults_FC.setText("NUMBER OF ADULTS");

        ComboBox_Room_Typr_FC.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        ComboBox_Room_Typr_FC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "REGULAR", "DELUXE", "SUITE" }));
        ComboBox_Room_Typr_FC.setSelectedItem(ComboBox_Room_Typr_FC);

        TextField_CheckIN_FC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_CheckIN_FCActionPerformed(evt);
            }
        });

        Label_Nos_Children_FC.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        Label_Nos_Children_FC.setText("NUMBER OF CHILDREN");

        Label_Service_Name_FC.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        Label_Service_Name_FC.setText("SERVICE NAME");

        Label_Service_Rate_FC.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        Label_Service_Rate_FC.setText("SERVICE RATE");

        Button_Enter_ServiceDets_FC.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        Button_Enter_ServiceDets_FC.setText("ENTER");
        Button_Enter_ServiceDets_FC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Enter_ServiceDets_FCActionPerformed(evt);
            }
        });

        TextField_Service_Rate_FC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_Service_Rate_FCActionPerformed(evt);
            }
        });

        Table_Services_Used_FC.setBorder(new javax.swing.border.MatteBorder(null));
        Table_Services_Used_FC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "RATE", "DATE", "TIME"
            }
        ));
        jScrollPane1.setViewportView(Table_Services_Used_FC);

        Label_Services_Used_FC.setFont(new java.awt.Font("STIX Two Text", 1, 18)); // NOI18N
        Label_Services_Used_FC.setText("SERVICES USED");

        TextField_ToPay_FC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_ToPay_FCActionPerformed(evt);
            }
        });

        ComboBox_Via_FC.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        ComboBox_Via_FC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CASH", "CREDIT CARD", "DEBIT CARD", "CHEQUE" }));

        Button_LogOut_FC.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        Button_LogOut_FC.setText("LOG OUT");
        Button_LogOut_FC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_LogOut_FCActionPerformed(evt);
            }
        });

        Label_ToPay_FC.setFont(new java.awt.Font("STIX Two Text", 1, 18)); // NOI18N
        Label_ToPay_FC.setText("TO PAY");

        Label_Via_FC.setFont(new java.awt.Font("STIX Two Text", 1, 18)); // NOI18N
        Label_Via_FC.setText("VIA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label_CheckIN_FC)
                                    .addComponent(Label_Room_Type_FC)
                                    .addComponent(Label_Nos_Adults_FC))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TextField_CheckIN_FC, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(Label_Check_Out_FC)
                                        .addGap(69, 69, 69)
                                        .addComponent(TextField_Check_Out_FC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TextField_Nos_Adults_FC, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(Label_Nos_Children_FC)
                                        .addGap(29, 29, 29)
                                        .addComponent(TextField_Nos_Children_FC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ComboBox_Room_Typr_FC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label_Service_Name_FC)
                                    .addComponent(Label_Service_Rate_FC))
                                .addGap(130, 130, 130)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TextField_Service_Name_FC, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextField_Service_Rate_FC, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(121, 121, 121)))
                        .addGap(285, 285, 285))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Label_Logo_FC, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(349, 349, 349))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Label_CustDets_FC)
                        .addGap(514, 514, 514))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1032, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TextField_ToPay_FC, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Label_ToPay_FC))
                                    .addGap(103, 103, 103)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Label_Via_FC, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(ComboBox_Via_FC, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Button_LogOut_FC, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Label_RoomDets_FC)
                        .addGap(530, 530, 530))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(603, 603, 603)
                .addComponent(Button_Enter_ServiceDets_FC)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Label_Room_Allot_FC)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Label_ServiceDets_FC)
                                .addGap(1, 1, 1)))
                        .addGap(516, 516, 516))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Label_Services_Used_FC)
                        .addGap(534, 534, 534))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Label_Logo_FC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Label_CustDets_FC)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Label_Room_Allot_FC)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Room_Type_FC)
                    .addComponent(ComboBox_Room_Typr_FC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Nos_Children_FC)
                    .addComponent(TextField_Nos_Adults_FC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_Nos_Adults_FC)
                    .addComponent(TextField_Nos_Children_FC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Check_Out_FC)
                    .addComponent(TextField_CheckIN_FC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_CheckIN_FC)
                    .addComponent(TextField_Check_Out_FC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(Label_RoomDets_FC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(Label_ServiceDets_FC)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextField_Service_Name_FC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_Service_Name_FC))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Service_Rate_FC)
                    .addComponent(TextField_Service_Rate_FC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Button_Enter_ServiceDets_FC, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(Label_Services_Used_FC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_ToPay_FC)
                            .addComponent(Label_Via_FC))
                        .addGap(33, 33, 33)
                        .addComponent(TextField_ToPay_FC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Button_LogOut_FC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox_Via_FC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(167, 167, 167))
        );

        jScrollPane2.setViewportView(jPanel1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 30, 1250, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_Enter_ServiceDets_FCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Enter_ServiceDets_FCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Enter_ServiceDets_FCActionPerformed

    private void TextField_Service_Rate_FCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_Service_Rate_FCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_Service_Rate_FCActionPerformed

    private void TextField_ToPay_FCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_ToPay_FCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_ToPay_FCActionPerformed

    private void Button_LogOut_FCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_LogOut_FCActionPerformed
        // TODO add your handling code here:
        CustomerEntry ce = new CustomerEntry();
            ce.setVisible(true);
            ce.setLocationRelativeTo(null);
            this.dispose();
    }//GEN-LAST:event_Button_LogOut_FCActionPerformed

    private void TextField_CheckIN_FCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_CheckIN_FCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_CheckIN_FCActionPerformed

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
            java.util.logging.Logger.getLogger(FinalCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Enter_ServiceDets_FC;
    private javax.swing.JButton Button_LogOut_FC;
    private javax.swing.JComboBox<String> ComboBox_Room_Typr_FC;
    private javax.swing.JComboBox<String> ComboBox_Via_FC;
    private javax.swing.JLabel Label_CheckIN_FC;
    private javax.swing.JLabel Label_Check_Out_FC;
    private javax.swing.JLabel Label_CustDets_FC;
    private javax.swing.JLabel Label_Logo_FC;
    private javax.swing.JLabel Label_Nos_Adults_FC;
    private javax.swing.JLabel Label_Nos_Children_FC;
    private javax.swing.JLabel Label_RoomDets_FC;
    private javax.swing.JLabel Label_Room_Allot_FC;
    private javax.swing.JLabel Label_Room_Type_FC;
    private javax.swing.JLabel Label_ServiceDets_FC;
    private javax.swing.JLabel Label_Service_Name_FC;
    private javax.swing.JLabel Label_Service_Rate_FC;
    private javax.swing.JLabel Label_Services_Used_FC;
    private javax.swing.JLabel Label_ToPay_FC;
    private javax.swing.JLabel Label_Via_FC;
    private javax.swing.JTable Table_CustDets_FC;
    private javax.swing.JTable Table_RoomDets_FC;
    private javax.swing.JTable Table_Services_Used_FC;
    private javax.swing.JTextField TextField_CheckIN_FC;
    private javax.swing.JTextField TextField_Check_Out_FC;
    private javax.swing.JTextField TextField_Nos_Adults_FC;
    private javax.swing.JTextField TextField_Nos_Children_FC;
    private javax.swing.JTextField TextField_Service_Name_FC;
    private javax.swing.JTextField TextField_Service_Rate_FC;
    private javax.swing.JTextField TextField_ToPay_FC;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable5;
    // End of variables declaration//GEN-END:variables
}
