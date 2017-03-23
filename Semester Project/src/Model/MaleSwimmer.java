
package Model;

public class MaleSwimmer extends Swimmer {
    private static int maleCount;
    
    
    // this is constructer
    public MaleSwimmer(String noun){
        super(noun);
        this.kitColor = "Blue";
        maleCount++;
        }
    //get count of MaleSwimmers
    public static int getMaleCount(){
        return maleCount;
        }
     // Swimming style methods
    public static  void doButterlfyStrok(){
        rate = 25;
        
        }
    public static void doBackStrok(){
        rate = 15;
        }
    public static void doBreastStrok(){
        rate = 40;
      }
    public static  void doFreeStyle(){
        rate = 50;
       
         }

   
   
     
}
