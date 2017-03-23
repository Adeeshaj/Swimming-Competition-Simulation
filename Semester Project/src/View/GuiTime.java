/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.logging.Level;
import java.util.logging.Logger;
import Controller.Controller;

/**
 *
 * @author Adeesha
 */
public class GuiTime extends Thread {
    private boolean runner=true; 
    @Override
    public void run(){
        while(runner){
            runner = Controller.isRunning();
            Controller.getTimeLabel().setText(Controller.getTime());
            try {
                sleep(4);
            } catch (InterruptedException ex) {
                Logger.getLogger(GuiTime.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
