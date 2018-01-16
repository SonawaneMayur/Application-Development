/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Mayur
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory(){
      enterpriseList=new ArrayList<>();
    }
    
    public Enterprise createEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        /*if(type==Enterprise.EnterpriseType.Hospital){
            enterprise=new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }*/
        if(type==Enterprise.EnterpriseType.Farm){
            enterprise = new FarmEnterprise(name);
            enterpriseList.add(enterprise);
        }else if(type==Enterprise.EnterpriseType.Park){
            enterprise = new ParkEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public boolean enterpriseNameExist(String ent){
        boolean enterpriseName = false;
        if(!enterpriseList.isEmpty() && ent.length()>0){
            for(Enterprise enterprise : enterpriseList)
                if(enterprise.getName().equalsIgnoreCase(ent))
                     enterpriseName = true;
                          
           
        }
        if(enterpriseName){
            JOptionPane.showMessageDialog(null, "Enterprise Already Existed");
        }
        return enterpriseName;
    }
    
    public boolean isEnterpriseNameValid(String emp){
        
      String EMPLOYEE_REGEX = "^[a-zA-Z][a-zA-Z0-9]{0,14}$";
      String username = emp; 
      if(!username.matches(EMPLOYEE_REGEX)){
          JOptionPane.showMessageDialog(null, "Enter Valid Enterprise Name");
      }
      return username.matches(EMPLOYEE_REGEX);
        
    }
}
    

