
package Model;

public class ScoreBoard {
   
    public static String setTime(int laneNo){
        return ArrayCls.getFinishingTimeArray().get(laneNo);
    }
    public static String display(int laneNo){
        String result = String.format("%s    %s",setName(laneNo),setTime(laneNo));
        ArrayCls.results().add(result);
        return result;
    }
    
    public static String setName(int laneNo){
        return Person.getName(Lane.getSwimmer(ArrayCls.getLaneArray().get(ArrayCls.getFinishingNumArray().get(laneNo)-1)));
    }
    
    public static void notifyResults(int laneNo){
        for(Spectator spec : ArrayCls.getspectatorArray()){
            spec.setResults(setName(laneNo)+"    "+setTime(laneNo),spec);
        }
    }
    
    
    
    
     

}
