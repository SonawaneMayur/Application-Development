/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NetworkAdminRole;

import Business.Browse;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.LayeredBarChart;
import Business.Network.Network;
import Business.Organization.NetworkAdminOrganization;
import Business.Organization.Organization;
import Business.PieChart;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WaterLvlWorkRequest;
import Business.WorkQueue.WaterShortageWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
//import javafx.scene.chart.PieChart;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.ui.RefineryUtilities;
import userinterface.LabourRole.LabourProcessWorkRequestJPanel;

/**
 *
 * @author Mayur
 */
public class NetworkAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NetworkAdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Network network;
    private EcoSystem business;
    private NetworkAdminOrganization organization;
    private Enterprise enterprise;
    public NetworkAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.network = network;
        this.organization = (NetworkAdminOrganization) organization;
        this.business = business;
        this.enterprise = enterprise;
        
        networkjLabel.setText(network.getName());
        lblnwAdmin.setText(userAccount.getEmployee().getName());
       // processJButton.setEnabled(false);
        //populateEnterprise();
       // populateTable();
    }
   
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnmanageRequest = new javax.swing.JButton();
        btnIntellicast = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblnwAdmin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        networkjLabel = new javax.swing.JLabel();
        btnChckEmail1 = new javax.swing.JButton();

        btnmanageRequest.setText("Manage Request");
        btnmanageRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanageRequestActionPerformed(evt);
            }
        });

        btnIntellicast.setText("Intellicast");
        btnIntellicast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntellicastActionPerformed(evt);
            }
        });

        jLabel4.setText("Network Admin:");

        lblnwAdmin.setText("jLabel5");

        jLabel1.setText("Network:");

        networkjLabel.setText("jLabel2");

        btnChckEmail1.setText("Check Email");
        btnChckEmail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChckEmail1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(networkjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblnwAdmin)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnIntellicast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmanageRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChckEmail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(293, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(networkjLabel)
                    .addComponent(jLabel4)
                    .addComponent(lblnwAdmin))
                .addGap(78, 78, 78)
                .addComponent(btnmanageRequest)
                .addGap(47, 47, 47)
                .addComponent(btnIntellicast)
                .addGap(43, 43, 43)
                .addComponent(btnChckEmail1)
                .addContainerGap(69, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnIntellicastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntellicastActionPerformed

           Browse.openURL("http://www.intellicast.com/National/Precipitation/RainCast.aspx");
    }//GEN-LAST:event_btnIntellicastActionPerformed

    private void btnmanageRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanageRequestActionPerformed

                ManageRequestWorkAreaJPanel manageRequestWorkAreaJPanel = new ManageRequestWorkAreaJPanel(userProcessContainer,userAccount,organization, enterprise, network ,business);
                userProcessContainer.add("manageRequestWorkAreaJPanel", manageRequestWorkAreaJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
    }//GEN-LAST:event_btnmanageRequestActionPerformed

    private void btnChckEmail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChckEmail1ActionPerformed

        Browse.openURL("http://www.gmail.com");
    }//GEN-LAST:event_btnChckEmail1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChckEmail1;
    private javax.swing.JButton btnIntellicast;
    private javax.swing.JButton btnmanageRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblnwAdmin;
    private javax.swing.JLabel networkjLabel;
    // End of variables declaration//GEN-END:variables
}
