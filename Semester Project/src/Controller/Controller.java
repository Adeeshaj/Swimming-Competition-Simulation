/*
 * 
 * this class for MVC stranderd system             
 * this is for controller
 */
package Controller;

import View.GuiThreadCls;
import View.GuiSwimmer;
import View.InformationFrame;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import Model.ArrayCls;
import Model.ClockThread;
import Model.FemaleSwimmer;
import Model.Judge;
import Model.Lane;
import Model.MaleSwimmer;
import Model.Person;
import Model.SaveFile;
import Model.ScoreBoard;
import Model.Swimmer;
import Model.SwimmerThread;
import Model.SwimmingCompitition;
import Model.SwimmingPool;
import Model.ThreadCls;
import Model.TouchPad;

/**
 *
 * @author Adeesha
 */
public class Controller {
    
    
    private static JLabel jClock;
    private static Queue<Integer> queue = new LinkedList<>();
    private static final int limit = 10;
    private static final Object lock = new Object();
    private static boolean isFinished;
    
    
    public static int getNumberofSwimmers() {
        return ArrayCls.getswimmerArray().size();
    }
    
    public static int getNumberofJudges(){
        return ArrayCls.getJudgeArray().size();
    }
    
    public static int getNumberofSpectators(){
        return ArrayCls.getspectatorArray().size();
    }
    
    public static int getNumberofStaff(){
        return ArrayCls.getstaffArray().size();
    }
    public static boolean getError(){
        return SwimmingCompitition.getError();
    }
    public static String getErrorMessege(){
        return SwimmingCompitition.getErrorMessege();
    }
   
    public static void createSwimmer (boolean isMale,JTextField name,int laneNo){
        SwimmingCompitition.createSwimmer(isMale, InformationFrame.getTextName(name),laneNo);
    }
    public static void createJudge (JTextField name){
        SwimmingCompitition.createJudge(InformationFrame.getTextName(name));
    }
     public static void createSpectator (JTextField name){
        SwimmingCompitition.createSpectator(InformationFrame.getTextName(name));
    }
      public static void createStaff (JTextField name){
        SwimmingCompitition.createstaff(InformationFrame.getTextName(name));
    }
    public static String getSwimmerName(Swimmer x){
        return Swimmer.getName(x);
    }
    //for return Time
    public static void setTimeLabel(JLabel time){
         jClock = time;
    } 
    
    public static JLabel getTimeLabel(){
        return jClock;
    }

    public static void swimmerThread(SwimmerThread thread){
        try {
            ThreadCls.SwimmerThread(thread);
            
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void sliderThread(GuiSwimmer thread,JSlider slider){
        try {
            GuiThreadCls.SliderThread(thread, slider);
            
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void timeThread(){
        ThreadCls.clockThread();
        GuiThreadCls.guiClockThread();
    }
    
    public static void createSaveFile(){
        SaveFile.createSaveFile();
    }
    
    public static void loadSaveFile(){
        SaveFile.loadSaveFile();
        
    }
    
    
     public static List<Person> getpeopleArray(){
        return ArrayCls.getpeopleArray();
    }
    
    public static List<Swimmer> getswimmerArray(){
        return ArrayCls.getswimmerArray();
    }
    
    public static String display(int LaneNo){
        ScoreBoard.notifyResults(LaneNo);
        return ScoreBoard.display(LaneNo);
        
    }
    
    public static void stopClock(){
        ClockThread.stopThread();
    }
    public static void setIsFinished(){
        isFinished = true;
    }
    public static boolean getIsFinished(){
        return isFinished;
    }
    public static void produce() throws InterruptedException {
        Random random = new Random();
        
        
        int rate = Swimmer.getRate();
        int speed = random.nextInt(rate);
        while(true){
            synchronized (lock){
                while (queue.size() == limit){
                    lock.wait();
                }
                
                queue.add(speed);
                lock.notify();
            }
        }
    }
    public static void consume(JSlider slider) throws InterruptedException{
        int length = 0;
        while(length<5000){
            
            synchronized (lock){
            
                while (queue.size() == 0){
                    
                    lock.wait();
                }
                length += queue.poll();
                slider.setValue(length);
                
                lock.notify(); 
            } 
          
            if (slider.getValue()==5000){
                switch(slider.getY()){
                    case 10:
                        Controller.setTime(5);
                        break;
                    case 50:
                        Controller.setTime(4);
                        break;
                    case 90:
                        Controller.setTime(3);
                        break;
                    case 130:
                        Controller.setTime(2);
                        break;
                    case 180:
                        Controller.setTime(1);
                        break;
                }
            }
     
                
                
            
            Thread.sleep(50);
        }
    
       
   }
   
    public static void setTime(int num){
        TouchPad.setTime(num);
    }
    public static void setStork(int stork,boolean isMale){
        switch (stork){
            case 1:
               if(isMale){
                   MaleSwimmer.doFreeStyle();
               }else{
                   FemaleSwimmer.doFreeStyle();
               }
             break;
            case 2:
                if(isMale){
                    MaleSwimmer.doBackStrok();
                }else{
                    FemaleSwimmer.doBackStrok();
                }
            break;
            case 3:
                if(isMale){
                    MaleSwimmer.doBreastStrok();
                }else{
                    FemaleSwimmer.doBreastStrok();
                }
            break;
            case 4:
                if(isMale){
                    MaleSwimmer.doButterlfyStrok();
                }else{
                    FemaleSwimmer.doButterlfyStrok();
                }
            break;
        }
    }
    public static String getWinner(){
       return Person.getName(Lane.getSwimmer(ArrayCls.getLaneArray().get(ArrayCls.getFinishingNumArray().get(0)-1)));
    }
    
    public static void saveResult(String name){
        try {
            SaveFile.resultSave(name);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void loadResult(String name){
        
        try {
            SaveFile.resultLoad(name);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static List<String> getLoadReusult(){
        return ArrayCls.getLoadResults();
    }
    public static List<String> getFileName(){
        return ArrayCls.getFileName();
    }
    
    public static void blowWhistle(){
        try {
            Judge.blowWhistle();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void saveFileName(){
        ArrayCls.getFileName().remove(0);
        SaveFile.fileNameSave();
    }
    
    public static boolean isRunning(){
        return ClockThread.getStarted();
    }
    
    public static String getTime(){
        return ClockThread.getTime();
    }
    
    public static String getPoolColor(){
        return SwimmingPool.getColor();
    }
}
