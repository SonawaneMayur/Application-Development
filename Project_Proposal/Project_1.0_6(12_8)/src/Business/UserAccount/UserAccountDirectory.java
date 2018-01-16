/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Mayur
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, String emailID, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmailId(emailID);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        boolean flagUserUnique = true;
       
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                flagUserUnique = false;
        }
        if(!flagUserUnique){
            JOptionPane.showMessageDialog(null, "UserName is not Unique");
        }
        return flagUserUnique;
    }
    
     public static boolean validUsername(String str) {
        
              
      String USERNAME_REGEX = "^[a-z][a-z0-9_-]{1,14}$";
      String username = str; //"user@domain.com";
      if(!username.matches(USERNAME_REGEX)){
          JOptionPane.showMessageDialog(null, "Enter Valid UserName");
      }
       return username.matches(USERNAME_REGEX);
             
             
         /*for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) || Character.isAlphabetic(str.charAt(i))){
                }else{
                 return false;
                }
        }
                return true;*/
        
         
  }
     public static boolean validPassword(String pwd){
      String PWD_REGEX = "[\\S]{1,8}";
      String pswd = pwd; 
      if(!pswd.matches(PWD_REGEX)){
          JOptionPane.showMessageDialog(null, "Password do not Start With Space");
      }
         return pswd.matches(PWD_REGEX);
     }
     
    public static boolean validEmailId(String emailID){
      
      String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
      String email1 = emailID; //"user@domain.com";
      if(!email1.matches(EMAIL_REGEX)){
          JOptionPane.showMessageDialog(null, "Enter the valid Email ID");
      }
      return email1.matches(EMAIL_REGEX);
       
    
    }
}
