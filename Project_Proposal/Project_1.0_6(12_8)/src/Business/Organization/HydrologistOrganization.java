/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HydrologistRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mayur
 */
public class HydrologistOrganization extends Organization{

    public HydrologistOrganization(){
        super(Organization.Type.Hydrologist.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HydrologistRole());
        return roles;
    }
    
}
