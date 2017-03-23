/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Adeesha
 */
public class Lane implements Serializable {
    private final Swimmer swimmer;
    private final TouchPad touchpad;
    private static int laneNo;
    
    
    public Lane(Swimmer s,TouchPad t,int n){
        swimmer = s;
        touchpad = t;
        laneNo = n;
    }
    
    public static Swimmer getSwimmer(Lane l){
        return l.swimmer;
    }
    
    public static TouchPad getTouchpad(Lane l){
        return l.touchpad;
    }
    
    public static int getLaneNo(){
        return laneNo;
    }
}
