
package Model;

public abstract class Swimmer extends Person{
    
    protected  String kitColor;
    protected static int rate=30;
    public Swimmer(String Name){
        super(Name);
    }
    
    public static int getSwimmerCount(){
        return MaleSwimmer.getMaleCount()+FemaleSwimmer.getFemaleCount();
    }
   
    static void doButterlfyStrok(){
        
    }
    static  void doBackStrok(){
        
    }
    static  void doBreastStrok(){
        
    }
    static  void doFreeStyle(){
        
    }
        
   
    public String getKitColor(){
        return kitColor;
    }
    public static int getRate(){
        return rate;
    }
     
}
