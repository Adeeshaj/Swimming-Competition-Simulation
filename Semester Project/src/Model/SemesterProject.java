
package Model;

import View.StartUp;


public class SemesterProject {
    
    
    public static void main(String[] args) {
       
        //deserisalezed file names
        ArrayCls.getFileName().add("<<<NOT SELECTED>>>");
        SaveFile.fileNameload();
        //gui 
        
        StartUp myscrn = new StartUp();
        myscrn.setSize(330,330);
        myscrn.setVisible(true);
               
        
        
        
    } 
    
}
