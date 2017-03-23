
package Model;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Judge extends Person  {
    
    private static int judgeCount;
 

    // this is constructer
    public Judge(String noun){
        super(noun);
        judgeCount++; 
    }
    //get count of judges
    public static int  getJudgeCount(){
        return judgeCount;
    }
    //blow whistle methods
    public static void blowWhistle() throws UnsupportedAudioFileException{
       File whistle = new File("src/Other/whistle.WAV");
        try {
            Whistle.sound(whistle);
        } catch (IOException ex) {
            Logger.getLogger(Judge.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
}
