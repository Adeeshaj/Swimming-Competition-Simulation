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
public class SwimmingCompitition {
    private static String errorMessege;
    private static boolean error;
    SwimmingPool pool = new SwimmingPool();
    
    //check name whether similar name in Array
    public static boolean nameChecker(String name){
        int flag = 0;
       
        for (Person people :ArrayCls.getpeopleArray()) {
          
            if (Person.getName(people).equals(name)) {
                flag = 1; 
                
            } 
        }
        return flag != 1;
        
    }
    //create swimmer method
    public static void createSwimmer(boolean isMale,String name,int laneNo){
        // for out of bound check
        if (ArrayCls.getswimmerArray().size()<5){
            setError(false);
            // for name check
            if (nameChecker(name)){

            if (isMale){
                MaleSwimmer swimmerm = new MaleSwimmer(name);
                TouchPad tpad = new TouchPad(laneNo);
                Lane swimLane = new Lane(swimmerm,tpad,laneNo);
                ArrayCls.getswimmerArray().add(swimmerm);
                ArrayCls.getpeopleArray().add(swimmerm);
                ArrayCls.getTouchPadArray().add(tpad);
                ArrayCls.getLaneArray().add(swimLane);
            }
            else{
                FemaleSwimmer swimmerf = new FemaleSwimmer(name);
                TouchPad tpad = new TouchPad(laneNo);
                Lane swimLane = new Lane(swimmerf,tpad,laneNo);
                ArrayCls.getswimmerArray().add(swimmerf);
                ArrayCls.getpeopleArray().add(swimmerf);
                ArrayCls.getTouchPadArray().add(tpad);
                ArrayCls.getLaneArray().add(swimLane);
            }
            }else{
                setError(true);
                setErrorMessege(" Name already occupied by another person"+"\n"+" Please use another Name");
            }

        }else{
            setErrorMessege("Out Of range");
            setError(true);
        }
    }
    
    public static void createJudge(String name){
         
        if (ArrayCls.getJudgeArray().size()<2){
            setError(false);
            if (nameChecker(name)){
                Judge judge = new Judge(name);
                ArrayCls.getJudgeArray().add(judge);
                ArrayCls.getpeopleArray().add(judge);
        }else{
            setError(true);
            setErrorMessege("Name already has another person"+"\n"+"Use another Name");
        }
             
        }
        else{
            setErrorMessege("Out Of range");
            setError(true);
        }
    }
    
    public static void createSpectator(String name){
        
        if (ArrayCls.getspectatorArray().size()<12){
            setError(false);
            if (nameChecker(name)){
                
            
            Spectator spect = new Spectator(name);
            ArrayCls.getspectatorArray().add(spect);
            ArrayCls.getpeopleArray().add(spect);
        }else{
             setError(true);
             setErrorMessege("Name already has another person"+"\n"+"Use another Name");
        }
        }
        else{
            setErrorMessege("Out Of range");
            setError(true);
        }
    }
    
    public static void createstaff(String name){
        
        if (ArrayCls.getstaffArray().size()<3){
            setError(false);
            if (nameChecker(name)){
            SupportingStaff staff = new SupportingStaff(name);
            ArrayCls.getstaffArray().add(staff);
            ArrayCls.getpeopleArray().add(staff);
        }else{
             setError(true);
             setErrorMessege("Name already has another person"+"\n"+"Use another Name");
        }
        
        
        }else{
            setErrorMessege("Out Of range");
            setError(true);
        }
    }
    
    public static void setErrorMessege(String error){
        errorMessege = error;
    }

    public static String getErrorMessege(){
       return errorMessege;
    }
    public static void setError(boolean x){
        error = x;
    }
    public static boolean getError(){
        return error;
    }
     
    
    
}
