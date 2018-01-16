/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Mayur
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public boolean isEmployeeExist(String emp){
        boolean flagemp = false;
        if(!employeeList.isEmpty() && emp.length()>0){
            for(Employee employee : employeeList)
                if(employee.getName().equalsIgnoreCase(emp))
                    flagemp = true;
        }
        if(flagemp){
            JOptionPane.showMessageDialog(null, "Employee Already Existed");
        }
        return flagemp;
    
    }
    
    public boolean isEmployeeNameValid(String emp){
       // boolean flagempn = false;
      String EMPLOYEE_REGEX = "^[a-zA-Z][a-zA-Z0-9]{0,14}$";
      String username = emp; 
     if(!username.matches(EMPLOYEE_REGEX)){
         JOptionPane.showMessageDialog(null, "Enter the Valid Employee Name");
     }
     return username.matches(EMPLOYEE_REGEX);
        
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
}