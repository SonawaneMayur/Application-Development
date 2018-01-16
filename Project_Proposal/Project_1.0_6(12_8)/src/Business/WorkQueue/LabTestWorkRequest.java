/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Mayur
 */
public class LabTestWorkRequest extends WorkRequest{
    
    private String testResult;
    private int waterPH;

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public int getWaterPH() {
        return waterPH;
    }

    public void setWaterPH(int waterPH) {
        this.waterPH = waterPH;
    }
    
    
}
