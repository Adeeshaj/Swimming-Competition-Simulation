
package Model;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class Whistle {
    
    public static void sound(File whistle) throws UnsupportedAudioFileException, IOException{
        try {
            Clip clip =AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(whistle));
            clip.start();
            
            Thread.sleep(clip.getMicrosecondLength()/1000);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Whistle.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Whistle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
