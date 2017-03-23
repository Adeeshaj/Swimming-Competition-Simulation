/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Controller;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class SwimmerThread extends Thread{
    @Override
    public void run(){
        try {  
            Controller.produce();
        } catch (InterruptedException ex) {
            Logger.getLogger(SwimmerThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
   
    
   
}
