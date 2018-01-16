/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author Mayur
 */
public class Employee {
    
    private String name;
    private int id;
    private static int count;

    public Employee() {
        
        id = count;
        count++;
        
    }

    public static void setCount(int count) {
        Employee.count = count;
    }

    public static int getCount() {
        return count;
    }
    
    

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
