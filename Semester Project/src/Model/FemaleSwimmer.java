
package Model;

public class FemaleSwimmer extends Swimmer {
    private static int femaleCount;
    
    
// this is constructer
    public FemaleSwimmer(String noun){
        super(noun);
        this.kitColor = "Red";
        femaleCount++; 
    }
    //get count of Female Swimmers
    public static int getFemaleCount(){
        return femaleCount;
    }
   
    // Swimming style methods
    public static void doButterlfyStrok(){
        rate = 15;
        }
    public static void doBackStrok(){
        rate = 5;
        }
    public static void doBreastStrok(){
        rate =35;
        }
    public static void doFreeStyle(){
        rate = 45;
        }

   
    
     
          
    
}
