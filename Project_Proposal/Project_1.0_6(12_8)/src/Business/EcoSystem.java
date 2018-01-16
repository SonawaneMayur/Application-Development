/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Mayur
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private int empCount;
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
            
        }
        return business;
    }
    
    
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setEmpCount(int empCount) {
        this.empCount = empCount;
    }

    public int getEmpCount() {
        return empCount;
    }
    
    
    public boolean isNetworkExist(String net){
        boolean flagNet = false;
        if(!networkList.isEmpty() && net.length()>0){
            for(Network network : networkList){
                if(network.getName().equalsIgnoreCase(net)){
                    flagNet = true;
                    break;
                }
            }
        }
       if(flagNet){
           JOptionPane.showMessageDialog(null, "Network Already Exist");
       }
       return flagNet;
    
    }
    
    public static boolean isNetworkNameValid(String net){
        String EMPLOYEE_REGEX = "^[a-zA-Z][a-zA-Z0-9]{0,14}$";
        String username = net; 
        if(!username.matches(EMPLOYEE_REGEX)){
            JOptionPane.showMessageDialog(null, "Enter Different Network Name");
        }
        return username.matches(EMPLOYEE_REGEX);
        
    }
    
    public Network createNetwork(String name){
        Network network=new Network(name);
        networkList.add(network);
        return network;
    }
    
     public boolean checkIfUsernameIsUnique(String username){
        boolean flagUserUnique = true;
        business = getInstance();
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
    
    public void sendEmail(String to1, String from1, String filePath1){
        // Recipient's email ID needs to be mentioned.
      String to = to1; //"abcd@gmail.com";

      // Sender's email ID needs to be mentioned
      String from = from1;//"web@gmail.com";

      String filename = filePath1;
      // Assuming you are sending email from localhost
      String host = "localhost";
      
      String subjectLine = "Reports";
      
      String messageBody = "Please find the attachments";

      // Get system properties
      Properties properties = System.getProperties();

      // Setup mail server
      properties.put("mail.smtp.starttls.enable", "true"); 
      properties.put("mail.smtp.host", "smtp.gmail.com");
     // properties.put("mail.smtp.user", "mayurs1690"); // User name
      //properties.put("mail.smtp.password", "9421617700mayur$"); // password
      properties.put("mail.smtp.port", "587");
      properties.put("mail.smtp.auth", "true");

      // Get the default Session object.
      //Session session = Session.getDefaultInstance(properties);
        Session session = Session.getInstance(properties, new GMailAuthenticator("mayurs1690", "9421617700mayur$"));
      
      
      try{
         // Create a default MimeMessage object.
         MimeMessage message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(from));

         // Set To: header field of the header.
         message.addRecipient(Message.RecipientType.TO,
                                  new InternetAddress(to));

         // Set Subject: header field
         message.setSubject(subjectLine);

         // Create the message part 
         BodyPart messageBodyPart = new MimeBodyPart();

         // Fill the message
         messageBodyPart.setText(messageBody);
         
         // Create a multipar message
         Multipart multipart = new MimeMultipart();

         // Set text message part
         multipart.addBodyPart(messageBodyPart);

         // Part two is attachment
         messageBodyPart = new MimeBodyPart();
         //String filename = filename;
         DataSource source = new FileDataSource(filename);
         messageBodyPart.setDataHandler(new DataHandler(source));
         messageBodyPart.setFileName(filename);
         multipart.addBodyPart(messageBodyPart);

         // Send the complete message parts
         message.setContent(multipart );

         // Send message
         Transport.send(message);
         System.out.println("Sent message successfully....");
      }catch (MessagingException mex) {
         mex.printStackTrace();
      }
    
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
        
    }
    
    
}
