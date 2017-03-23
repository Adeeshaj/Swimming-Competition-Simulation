/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Adeesha
 */
public class ClockThread extends Thread {
    private static boolean started;
    
    public void startThread(){
        Clock.startClock();
        this.started = true;
        this.start();
    }
    
    @Override
    public void run(){
        while(started){
            
        }
    }
    
    public static String getTime(){
        return Clock.gettime();
    }
    
    public static void stopThread(){
        started = false;
    }
    
    public static boolean getStarted(){
        return started;
    }
}
