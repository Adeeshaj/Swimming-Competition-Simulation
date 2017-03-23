/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Adeesha
 */
public class ArrayCls {
    
    private static List<Person> peopleArray = new ArrayList<>();
    private static List<Swimmer> swimmerArray = new ArrayList<>();
    private static List<SupportingStaff> staffArray = new ArrayList<>();
    private static List<Judge> judgeArray = new ArrayList<>();
    private static List<Spectator> spectatorArray = new ArrayList<>();
    private static List<Lane> laneArray = new ArrayList<>();
    private static List<TouchPad> touchPadArray = new ArrayList<>();
    private static List<String> finishingTimeArray = new ArrayList<>();
    private static List<Integer> finishingNumArray = new ArrayList<>();
    private static List<String> results = new ArrayList<>();
    private static List<String> loadResults = new ArrayList<>();
    private static List<String> fileName = new ArrayList<>();
    
    public static List<String> getFileName(){
        return fileName;
    }
    
    public static List<Person> getpeopleArray(){
        return peopleArray;
    }
    
    public static List<Swimmer> getswimmerArray(){
        return swimmerArray;
    }
    
    public static List<SupportingStaff> getstaffArray(){
        return staffArray;
    }
    
    public static List<Spectator> getspectatorArray(){
        return spectatorArray;
    }
    public static List<Lane> getLaneArray(){
        return laneArray;
    }
    public static List<TouchPad> getTouchPadArray(){
        return touchPadArray;
    }
    public static List<Judge> getJudgeArray(){
        return judgeArray;
    }
    public static List<String> getFinishingTimeArray(){
        return finishingTimeArray;
    }
    public static List<Integer> getFinishingNumArray(){
        return finishingNumArray;
    }
    public static List<String> results(){
        return results;
    }
    public static List<String> getLoadResults(){
        return loadResults;
    }
    
}
