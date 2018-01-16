/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SupervisorRole;

import java.util.Random;

/**
 *
 * @author Mayur
 */
public class RandomVGen {
    private int max;
    private int min;
    private int randomNumber;
    
    public static int randValGen(int min, int max){
        //this.min = mi;
        //this.max = ma;
     Random random = new Random();   
    return random.nextInt(max - min) + min;
    }
    
}
