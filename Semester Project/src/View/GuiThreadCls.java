/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.GuiSwimmer;
import javax.swing.JSlider;

/**
 *
 * @author Adeesha
 */
public class GuiThreadCls {
    public static void SliderThread(GuiSwimmer thread,JSlider slider) throws InterruptedException{
        thread = new GuiSwimmer(slider);
        thread.start(); 
        
    }
    public static void guiClockThread(){
        GuiTime guiclock = new GuiTime();
        guiclock.start();
    }
}
