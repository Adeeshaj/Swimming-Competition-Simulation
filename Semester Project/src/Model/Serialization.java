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
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Serialization {
    public void serializePerson (List<Person> people, String fileName) throws IOException{
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
            out.writeObject(people);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void serializeSwimmer (List<Swimmer> swimmer, String fileName) throws IOException{
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
            out.writeObject(swimmer);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
     public void serializeJudge (List<Judge> judge, String fileName) throws IOException{
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
            out.writeObject(judge);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
     
     public void serializeSpectator (List<Spectator> spectator, String fileName) throws IOException{
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
            out.writeObject(spectator);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
      public void serializeStaff (List<SupportingStaff> staff, String fileName) throws IOException{
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
            out.writeObject(staff);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
     public void serializeLane (List<Lane> lane, String fileName) throws IOException{
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
            out.writeObject(lane);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
     public void serializeTouchPad (List<TouchPad> touchpad, String fileName) throws IOException{
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
            out.writeObject(touchpad);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void serializeResults(List<String> result,String fileName) throws IOException{
        
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
            out.writeObject(result);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    public void serializeFileName(List<String> name,String fileName) throws FileNotFoundException{
        ObjectOutputStream out;
        try {
            out = new ObjectOutputStream(new FileOutputStream(fileName));
            out.writeObject(name);
        } catch (IOException ex) {
            Logger.getLogger(Serialization.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    
    
    public List<Person> deserializePerson(String fileName){
        List<Person> people = null;
        try( ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))){
           people = (List<Person>) in.readObject();
        }catch(IOException | ClassNotFoundException ex){
                System.out.println(ex.getMessage());
        }
        return people;
    }
    
    public List<Swimmer> deserializeSwimmer(String fileName){
        List<Swimmer> swimmer = null;
        try( ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))){
           swimmer = (List<Swimmer>) in.readObject();
        }catch(IOException | ClassNotFoundException ex){
                System.out.println(ex.getMessage());
        }
        return swimmer;
    }
    
    public List<Judge> deserializeJudge(String fileName){
        List<Judge> judge = null;
        try( ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))){
           judge = (List<Judge>) in.readObject();
        }catch(IOException | ClassNotFoundException ex){
                System.out.println(ex.getMessage());
        }
        return judge;
    }
    
    public List<Spectator> deserializeSpectator(String fileName){
        List<Spectator> spectator = null;
        try( ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))){
           spectator = (List<Spectator>) in.readObject();
        }catch(IOException | ClassNotFoundException ex){
                System.out.println(ex.getMessage());
        }
        return spectator;
    }
    
    public List<SupportingStaff> deserializeStaff(String fileName){
        List<SupportingStaff> staff = null;
        try( ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))){
           staff = (List<SupportingStaff>) in.readObject();
        }catch(IOException | ClassNotFoundException ex){
                System.out.println(ex.getMessage());
        }
        return staff;
    }
    
    public List<TouchPad> deserializeTouchPad(String fileName){
        List<TouchPad> touchpad = null;
        try( ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))){
           touchpad = (List<TouchPad>) in.readObject();
        }catch(IOException | ClassNotFoundException ex){
                System.out.println(ex.getMessage());
        }
        return touchpad;
    }
    
    public List<Lane> deserializeLane(String fileName){
        List<Lane> lane = null;
        try( ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))){
           lane = (List<Lane>) in.readObject();
        }catch(IOException | ClassNotFoundException ex){
                System.out.println(ex.getMessage());
        }
        return lane;
    }
    
    public List<String> deserializeResults(String fileName) throws FileNotFoundException{
        List<String> result = null;
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))){
            result = (List<String>) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } 
        return result;
    }
    public List<String> deserializeFileName(String fileName) throws FileNotFoundException{
        List<String> name = null;
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))){
            name = (List<String>) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } 
        return name;
    }
    
    
    
}
