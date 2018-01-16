/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.Organization;
import Business.Role.NetworkAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mayur
 */
public class Network extends Organization {
   
    //private String name;
    private EnterpriseDirectory enterpriseDirectory;
     private int waterAvail = 100000;
    
    public Network(String name){
        super(name);
        enterpriseDirectory=new EnterpriseDirectory();
    }
/*
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   */
    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public int getWaterAvail() {
        return waterAvail;
    }

    public void setWaterAvail(int waterAvail) {
        this.waterAvail = waterAvail;
    }
    
/*
    @Override
    public String toString() {
        return value;
    }
*/
    @Override
    public ArrayList<Role> getSupportedRole() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         ArrayList<Role> roles = new ArrayList<>();
        roles.add(new NetworkAdminRole());
        return roles;
    }
    
    
}
