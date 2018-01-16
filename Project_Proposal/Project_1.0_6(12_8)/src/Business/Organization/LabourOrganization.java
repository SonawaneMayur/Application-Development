/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LabourRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mayur
 */
public class LabourOrganization extends Organization {

    public LabourOrganization(){
        super(Organization.Type.Labour.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole(){
       ArrayList<Role> roles = new ArrayList<>();
        roles.add(new LabourRole());
        return roles;
    }
    
}
