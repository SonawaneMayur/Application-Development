/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.NetworkAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mayur
 */
public class NetworkAdminOrganization extends Organization {

    public NetworkAdminOrganization(){
        super(Type.NetworkAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new NetworkAdminRole());
        return roles;
    }
    
}
