/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.SupervisorOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.SupervisorRole.SupervisorWorkAreaJPanel;

/**
 *
 * @author Mayur
 */
public class SupervisorRole extends Role{

    @Override
    //container, userAccount, inOrganization, inEnterprise,inNetwork, ecoSystem
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new SupervisorWorkAreaJPanel(userProcessContainer, account, organization, enterprise, network, business);
    }
    
}
