package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.AdminRole;
import Business.Role.HydrologistRole;
import Business.Role.LabourRole;
import Business.Role.NetworkAdminRole;
import Business.Role.SupervisorRole;
import Business.Role.SystemAdminRole;
import Business.Role.TechnicianRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Mayur
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("Mayur");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin","mayurs1690@gmail.com", employee, new SystemAdminRole());
     
        Network n1 = system.createNetwork("n1");
     
         Employee employeen = n1.getEmployeeDirectory().createEmployee("NetworkAdmin1");
        n1.getUserAccountDirectory().createUserAccount("NetworkAdmin1", "NetworkAdmin1","mayurs1690@gmail.com", employeen, new NetworkAdminRole());
        
        Enterprise e1 = n1.getEnterpriseDirectory().createEnterprise("Farm1", Enterprise.EnterpriseType.Farm);
        Employee employeea = e1.getEmployeeDirectory().createEmployee("EnterprisekAdmin1");
        e1.getUserAccountDirectory().createUserAccount("EnterprisekAdmin1", "EnterprisekAdmin1","mayurs1690@gmail.com", employeea, new AdminRole());
        
        Organization sorganization = e1.getOrganizationDirectory().createOrganization(Organization.Type.Supervisor);
        Employee employees = sorganization.getEmployeeDirectory().createEmployee("supervisor");
        sorganization.getUserAccountDirectory().createUserAccount("supervisor", "supervisor","mayurs1690@gmail.com", employees, new SupervisorRole());
        
        Organization lorganization = e1.getOrganizationDirectory().createOrganization(Organization.Type.Labour);
        Employee employeel = lorganization.getEmployeeDirectory().createEmployee("labour1");
        lorganization.getUserAccountDirectory().createUserAccount("labour1", "labour1","mayurs1690@gmail.com", employeel, new LabourRole());
        
        Organization horganization = e1.getOrganizationDirectory().createOrganization(Organization.Type.Hydrologist);
        Employee employeeh = horganization.getEmployeeDirectory().createEmployee("hydrologist1");
        horganization.getUserAccountDirectory().createUserAccount("hydrologist1", "hydrologist1","mayurs1690@gmail.com", employeeh, new HydrologistRole());
        
        Organization torganization = e1.getOrganizationDirectory().createOrganization(Organization.Type.Technician);
        Employee employeet = torganization.getEmployeeDirectory().createEmployee("techinician1");
            torganization.getUserAccountDirectory().createUserAccount("techinician1", "techinician1","mayurs1690@gmail.com", employeet, new TechnicianRole());
        
        Organization naorganization = e1.getOrganizationDirectory().createOrganization(Organization.Type.NetworkAdmin);
       
       // Employee employeena = naorganization.getEmployeeDirectory().createEmployee("na1");
       // naorganization.getUserAccountDirectory().createUserAccount("na1", "na1","mayurs1690@gmail.com", employeena, new NetworkAdminRole());
      
        return system;
    }
    
}
