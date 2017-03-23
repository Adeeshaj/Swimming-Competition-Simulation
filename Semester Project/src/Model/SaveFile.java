/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adeesha
 */
public class SaveFile {
    
    
    private static Serialization people = new Serialization();
    private static Serialization saveResult = new Serialization();
    private static Serialization fileNameSave = new Serialization();

    public static String setName(String fileName){
        return String.format("SaveFile/%s.ser",fileName);
        
    }
   
    public static void fileNameSave(){
        
        try {
            fileNameSave.serializeFileName(ArrayCls.getFileName(),"SaveFile/FileNameSaveFile.ser" );
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void fileNameload(){
        List<String> dummyFile = null;
        try {
           
            dummyFile = fileNameSave.deserializeFileName("SaveFile/FileNameSaveFile.ser" );
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(String dummy:dummyFile){
            ArrayCls.getFileName().add(dummy);
        }
    }
    public static void resultSave(String fileName) throws IOException{
        ArrayCls.getFileName().add(fileName);
        System.out.println(ArrayCls.getFileName().toString());
        saveResult.serializeResults(ArrayCls.results(), setName(fileName));
        
    }
    
    public static void resultLoad(String fileName) throws FileNotFoundException{
        List<String> loadResult = saveResult.deserializeResults(setName(fileName));
        ArrayCls.getLoadResults().clear();
        for(String dummy: loadResult){
            ArrayCls.getLoadResults().add(dummy);
        }
        System.out.println(ArrayCls.getLoadResults().toString());
    }
   
    public static void createSaveFile(){
        try {
           people.serializePerson(ArrayCls.getpeopleArray(), "SaveFile/PeopleSaveFile.ser");
           people.serializeSwimmer(ArrayCls.getswimmerArray(), "SaveFile/SwimmerSaveFile.ser");
           people.serializeJudge(ArrayCls.getJudgeArray(), "SaveFile/JudgeSaveFile.ser");
           people.serializeSpectator(ArrayCls.getspectatorArray(), "SaveFile/SpectatorSaveFile.ser");
           people.serializeStaff(ArrayCls.getstaffArray(), "SaveFile/StaffSaveFile.ser");
           people.serializeTouchPad(ArrayCls.getTouchPadArray(), "SaveFile/TouchPadSaveFile.ser");
           people.serializeLane(ArrayCls.getLaneArray(), "SaveFile/LaneSaveFile.ser");
           
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void loadSaveFile(){
        List<Person> loadPeople = people.deserializePerson("SaveFile/PeopleSaveFile.ser");
        List<Swimmer> loadSwimmer = people.deserializeSwimmer("SaveFile/SwimmerSaveFile.ser");
        List<Judge> loadJudge = people.deserializeJudge("SaveFile//JudgeSaveFile.ser");
        List<Spectator> loadSpectator = people.deserializeSpectator("SaveFile/SpectatorSaveFile.ser");
        List<SupportingStaff> loadStaff = people.deserializeStaff("SaveFile/StaffSaveFile.ser");
        List<TouchPad> loadTouchPad = people.deserializeTouchPad("SaveFile/TouchPadSaveFile.ser");
        List<Lane> loadLane = people.deserializeLane("SaveFile/LaneSaveFile.ser");
        
        for (Person dummy: loadPeople){
            ArrayCls.getpeopleArray().add(dummy);
        }
        for (Swimmer dummy: loadSwimmer){
            ArrayCls.getswimmerArray().add(dummy);
        }
        for (Judge dummy: loadJudge){
            ArrayCls.getJudgeArray().add(dummy);
        }
        for (Spectator dummy: loadSpectator){
            ArrayCls.getspectatorArray().add(dummy);
        }
        for (SupportingStaff dummy: loadStaff){
            ArrayCls.getstaffArray().add(dummy);
        }
        for (TouchPad dummy: loadTouchPad){
            ArrayCls.getTouchPadArray().add(dummy);
        }
        for (Lane dummy: loadLane){
            ArrayCls.getLaneArray().add(dummy);
        }   
    }
}
