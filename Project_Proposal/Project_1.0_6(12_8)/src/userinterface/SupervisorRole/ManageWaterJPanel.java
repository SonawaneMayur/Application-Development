/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SupervisorRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.Sensor;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.Validate;

/**
 *
 * @author Mayur
 */
public class ManageWaterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageWaterJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Network network;
    private int waterAV;
    private int waterThr;
    private int sensor_waterAV;
    private int waterPH;
    
    public ManageWaterJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.network = network;
        EnterprisejLabel.setText(enterprise.getName());
        lblStorage.setText(String.valueOf(enterprise.getWaterStorage()));
        WaterAvlbljTextField.setText(String.valueOf(enterprise.getWaterAvail()));
        WaterThrshldjTextField.setText(String.valueOf(enterprise.getWaterThreshold()));
        
        SensorjLabel.setText(enterprise.getCensor().getSensorUID());
        sensorWaterLvljTextField2.setText(String.valueOf(enterprise.getCensor().getWaterLevel()));
        WaterPHjTextField1.setText(String.valueOf(enterprise.getCensor().getWaterPH()));
        if(enterprise.getCensor().isSensorStatus() == true){
            TruejRadioButton1.setSelected(true);
        }else{
            FalsejRadioButton2.setSelected(true);
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

        statusBtnGrp = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        WaterAvlbljTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        WaterThrshldjTextField = new javax.swing.JTextField();
        btnSetValues = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        WaterPHjTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TruejRadioButton1 = new javax.swing.JRadioButton();
        FalsejRadioButton2 = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        EnterprisejLabel = new javax.swing.JLabel();
        SensorjLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sensorWaterLvljTextField2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        lblStorage = new javax.swing.JLabel();

        jLabel1.setText("Water Available:");

        jLabel2.setText("Water Threshold:");

        btnSetValues.setText("UPDATE");
        btnSetValues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetValuesActionPerformed(evt);
            }
        });

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Water PH:");

        jLabel4.setText("Sensor Status:");

        statusBtnGrp.add(TruejRadioButton1);
        TruejRadioButton1.setText("True");
        TruejRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TruejRadioButton1ActionPerformed(evt);
            }
        });

        statusBtnGrp.add(FalsejRadioButton2);
        FalsejRadioButton2.setText("False");

        EnterprisejLabel.setText("Enterprise");

        SensorjLabel.setText("Sensor");

        jLabel7.setText("Water Level:");

        jLabel6.setText("Water Storage:");

        lblStorage.setText("jLabel8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(SensorjLabel)
                                        .addGap(108, 108, 108)
                                        .addComponent(jLabel7))
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TruejRadioButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FalsejRadioButton2))
                                    .addComponent(sensorWaterLvljTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(WaterPHjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(EnterprisejLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(backJButton)
                                .addGap(60, 60, 60)
                                .addComponent(btnSetValues, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblStorage, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(139, 139, 139)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(WaterThrshldjTextField)
                                        .addComponent(WaterAvlbljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 157, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnterprisejLabel)
                    .addComponent(jLabel6)
                    .addComponent(lblStorage))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WaterAvlbljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(WaterThrshldjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SensorjLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(sensorWaterLvljTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(WaterPHjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TruejRadioButton1)
                                    .addComponent(FalsejRadioButton2)
                                    .addComponent(jLabel4))))))
                .addGap(16, 16, 16)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backJButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSetValues, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(89, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSetValuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetValuesActionPerformed
        
        
        
       if(Validate.isInteger(WaterAvlbljTextField.getText()) && Validate.isInteger(WaterThrshldjTextField.getText()) && Validate.isInteger(sensorWaterLvljTextField2.getText()) && Validate.isInteger(WaterPHjTextField1.getText())){
           waterAV = Integer.parseInt(WaterAvlbljTextField.getText());
            waterThr = Integer.parseInt(WaterThrshldjTextField.getText());
             sensor_waterAV = Integer.parseInt(sensorWaterLvljTextField2.getText());
              waterPH = Integer.parseInt(WaterPHjTextField1.getText());
              enterprise.setWaterAvail(waterAV);
        enterprise.setWaterThreshold(waterThr);
        Sensor s = enterprise.getCensor();
        s.setWaterLevel(sensor_waterAV);
        s.setWaterPH(waterPH);
        if(TruejRadioButton1.isSelected()){
        s.setSensorStatus(true);
        }
        if(FalsejRadioButton2.isSelected()){
        s.setSensorStatus(false);
        }
        
         JOptionPane.showMessageDialog(null,"Data Updated");
       }else {
           
         JOptionPane.showMessageDialog(null,"Enter Valid Data");
       }
        
 
    }//GEN-LAST:event_btnSetValuesActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void TruejRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TruejRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TruejRadioButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EnterprisejLabel;
    private javax.swing.JRadioButton FalsejRadioButton2;
    private javax.swing.JLabel SensorjLabel;
    private javax.swing.JRadioButton TruejRadioButton1;
    private javax.swing.JTextField WaterAvlbljTextField;
    private javax.swing.JTextField WaterPHjTextField1;
    private javax.swing.JTextField WaterThrshldjTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnSetValues;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblStorage;
    private javax.swing.JTextField sensorWaterLvljTextField2;
    private javax.swing.ButtonGroup statusBtnGrp;
    // End of variables declaration//GEN-END:variables
}