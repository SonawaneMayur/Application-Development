/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mayur
 */
public abstract class Enterprise extends Organization{
    
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private int waterStorage = 1000;
    private int waterAvail = 60;
    private int waterThreshold = 70;
    private int sensorCount = 4;
    private Sensor sensor;
    
    public Enterprise(String name,EnterpriseType enterpriseType){
        super(name);
        this.enterpriseType=enterpriseType;
        organizationDirectory=new OrganizationDirectory();
        this.sensor = new Sensor();
        
    }
    
    
    public enum EnterpriseType{
       // Hospital("Hospital");
        Farm("Farm"),
        Park("Park");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }

        public String getValue() {
            return value;
        }
        
       
    

    @Override
    public String toString() {
        return value;
    }
    }

    public int getWaterStorage() {
        return waterStorage;
    }

    public void setWaterStorage(int waterStorage) {
        this.waterStorage = waterStorage;
    }

    public int getWaterAvail() {
        return waterAvail;
    }

    public void setWaterAvail(int waterAvail) {
        this.waterAvail = waterAvail;
    }

    public int getWaterThreshold() {
        return waterThreshold;
    }

    public void setWaterThreshold(int waterThreshold) {
        this.waterThreshold = waterThreshold;
    }

    public int getSensorCount() {
        return sensorCount;
    }

    public void setSensorCount(int sensorCount) {
        this.sensorCount = sensorCount;
    }
    

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public Sensor getCensor() {
        return sensor;
    }
    
    
  
    
}
