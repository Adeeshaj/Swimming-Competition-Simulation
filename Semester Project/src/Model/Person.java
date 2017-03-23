
package Model;

import java.io.Serializable;



public abstract class Person implements Serializable{
    private final String name;
    
    
    //count all people method
    Person (String Name){
        this.name = Name;
    }
    public static int count(){
       int peopleCount=SupportingStaff.getStaffCount()+Judge.getJudgeCount()+Spectator.getspectatorCount()+MaleSwimmer.getMaleCount()+FemaleSwimmer.getFemaleCount();
       return peopleCount;
    }
    
    public static String getName(Person human){
        return human.name;
    }
    
    
    
    
}