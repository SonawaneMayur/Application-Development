/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.Date;



/**
 *
 * @author Mayur
 */
public class Sensor {
    private String SensorUID;
    private int waterLevel;         // gives the water level status
    private int waterThreshold = 30;     // water threshold for sensor 
    private int waterPH;            //gives water PH
    private int waterPressure;      // gives water pressure
    private boolean sensorStatus;   // censor is working or not
    private Date currentTime;
    private int MAX_PH = 9;
    private int MIN_PH = 6;
    /*
    public  Sensor(){
    this.currentTime = new Date();
    }
    */
    public String getSensorUID() {
        return SensorUID;
    }

    public void setSensorUID(String SensorUID) {
        this.SensorUID = SensorUID;
    }
    
    public int getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(int waterLevel) {
        this.waterLevel = waterLevel;
    }

    public int getWaterThreshold() {
        return waterThreshold;
    }

    public void setWaterThreshold(int waterThreshold) {
        this.waterThreshold = waterThreshold;
    }
    

    public int getWaterPH() {
        return waterPH;
    }

    public void setWaterPH(int waterPH) {
        this.waterPH = waterPH;
    }

    public int getWaterPressure() {
        return waterPressure;
    }

    public void setWaterPressure(int waterPressure) {
        this.waterPressure = waterPressure;
    }

    public boolean isSensorStatus() {
        return sensorStatus;
    }

    public void setSensorStatus(boolean sensorStatus) {
        this.sensorStatus = sensorStatus;
    }

    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }

    public int getMAX_PH() {
        return MAX_PH;
    }

    public void setMAX_PH(int MAX_PH) {
        this.MAX_PH = MAX_PH;
    }

    public int getMIN_PH() {
        return MIN_PH;
    }

    public void setMIN_PH(int MIN_PH) {
        this.MIN_PH = MIN_PH;
    }

    @Override
    public String toString() {
        return SensorUID;
    }
    
    
    
}
