/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.EcoSystem;
import static Business.EcoSystem.getInstance;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;

/**
 *
 * @author Mayur
 */
public class Validate {
    
    public static boolean isInteger(String str){
       String INT_REGEX = "^[0-9][0-9]{0,6}";
      String strr = str; //"user@domain.com";
      if(!strr.matches(INT_REGEX)){
          JOptionPane.showMessageDialog(null, "Enter the valid Integer");
      }
      return strr.matches(INT_REGEX);  
    
    }
    
    public static boolean isChar(String chr){
      String CHAR_REGEX = "^[a-zA-Z]{1,6}";
      String strr = chr; //"user@domain.com";
      if(!strr.matches(CHAR_REGEX)){
          JOptionPane.showMessageDialog(null, "Enter the valid data");
      }
      return strr.matches(CHAR_REGEX);  
    
    }
    
    public static boolean isString(String str){
       String STR_REGEX = "^\\w{1,14}";
      String strr = str; //"user@domain.com";
      if(!strr.matches(STR_REGEX)){
          JOptionPane.showMessageDialog(null, "Enter the valid string");
      }
      return strr.matches(STR_REGEX); 
    }
    
    public static boolean checkIfUsernameIsUnique(String username, EcoSystem eco){
        boolean flagUserUnique = true;
        EcoSystem business = eco;
       for(Network nw : business.getNetworkList()){
               for(UserAccount ua1: nw.getUserAccountDirectory().getUserAccountList()){
                    if (ua1.getUsername().equals(username)){
                                flagUserUnique = false;
                              break;
                              
                            }
               }
               if(flagUserUnique){
                    for(Enterprise ent : nw.getEnterpriseDirectory().getEnterpriseList()){
                        for(UserAccount ua1: ent.getUserAccountDirectory().getUserAccountList()){
                            if (ua1.getUsername().equals(username)){
                                flagUserUnique = false;
                              break;
                              
                            }
                        }
                        if(flagUserUnique){
                            for(Organization org : ent.getOrganizationDirectory().getOrganizationList()){
                                for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()){
                                    if (ua.getUsername().equals(username)){
                                        flagUserUnique = false;
                                        break;
                                    }
                                }
                            }
                        }
                    }
               }
       }
           
        if(!flagUserUnique){
            JOptionPane.showMessageDialog(null, "UserName is not Unique");
        }
        return flagUserUnique;
    }
    
    public static boolean isEmployeeExist(Employee e, Organization o){
        boolean flagEmpExist = false;
        for(UserAccount ua : o.getUserAccountDirectory().getUserAccountList())
            if(ua.getEmployee().getId() == e.getId()){
                flagEmpExist = true;
                break;
            }
        
        if(flagEmpExist){
            JOptionPane.showMessageDialog(null, "Employee "+e.getName()+" is Already created");
        }
        
        return flagEmpExist;
    }
    
}
