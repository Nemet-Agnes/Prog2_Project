package pack1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class IL {
    BufferedImage ibg;
    BufferedImage iug[] = new BufferedImage[Main.ugNumber];
    
    public IL(){
        
        try {
            ibg = ImageIO.read(new File ("rsc/bg.png"));
            
            for(int i=0;i<iug.length;i++){
                iug[i] = ImageIO.read(new File("rsc/ug" + (i+1)+ ".png"));
            }
            
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        
    }
}
