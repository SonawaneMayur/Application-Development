/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Mayur
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Hydrologist.getValue())){
            organization = new HydrologistOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Labour.getValue())){
            organization = new LabourOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Supervisor.getValue())){
            organization = new SupervisorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Technician.getValue())){
            organization = new TechnicianOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.NetworkAdmin.getValue())){
            organization = new NetworkAdminOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}