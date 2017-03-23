
package Model;

public class Spectator extends Person {
    private static int spectateCount;
    private String results;
    
    
    // this is constructer
    public Spectator(String Name){
        super(Name);
        
        spectateCount++;
        }
    //get count of Spectaters
    public static int getspectatorCount(){
        return spectateCount;
    }
    
    public void setResults(String x,Spectator spec){
        spec.results = x;
    }

}
