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
public class ThreadCls {
    public static void SwimmerThread(SwimmerThread t) throws InterruptedException{  
        t = new SwimmerThread();   
        t.start(); 
        
    }
    
    public static void clockThread(){
        ClockThread stopWatch = new ClockThread();
        stopWatch.startThread();
        
    }
}
