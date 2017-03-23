/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JSlider;
import Controller.Controller;

/**
 *
 * @author Adeesha
 */
public class GuiSwimmer extends Thread {
    JSlider swimminglane;
    GuiSwimmer(JSlider sl){
        swimminglane = sl;
    }
    @Override
    public void run(){
        try {
            Controller.consume(swimminglane);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}

