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
public class Clock {
    private static long startTime = 0,endTime = 0;
    
    static void startClock(){
        startTime = System.currentTimeMillis();
    }
    
    static int getMiliTime(){
        endTime = System.currentTimeMillis();
        long time = endTime-startTime;
        return (int)time;
    }
    
    static int getMinutes(){
        int minT = getMiliTime();
        return (minT/60000)%60;
    }
    
    static int getSeconds(){
        int secT = getMiliTime();
        return (secT/1000)%60;
    }
    
    static int getMiliseconds(){
        int miliT = getMiliTime();
        return miliT%1000;
    }
    public static String gettime(){
        return String.format("%02d:%02d:%03d",getMinutes(),getSeconds(),getMiliseconds());
    }
}
