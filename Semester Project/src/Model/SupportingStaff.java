
package Model;

public class SupportingStaff extends Person {
    private static int staffCount;
    
    
    // this is constructer
    public SupportingStaff(String noun){
        super(noun);
        staffCount++;
    }
    //get count of staff
    public static int getStaffCount(){
        return staffCount;
    }

   
}
