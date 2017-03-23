
package Model;

import java.io.Serializable;

public class TouchPad implements Serializable {
    private int lane;
    private static String time;
    
    public TouchPad(int laneNo){
        lane = laneNo;
    }
   
    public static void setTime(int lnum) {
        time = Clock.gettime();
        ArrayCls.getFinishingTimeArray().add(time);
        ArrayCls.getFinishingNumArray().add(lnum);
    }
    
    public static String getTime(){
        return time;
    }
    
    public static int getLane(TouchPad x){
        return x.lane;
    }
     
}
