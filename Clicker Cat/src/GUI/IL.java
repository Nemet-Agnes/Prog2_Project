package GUI;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import Actions.Main;

public class IL {
    public BufferedImage ibg;
    public BufferedImage iug[] = new BufferedImage[Main.ugNumber];
    public BufferedImage iCat1, iCat2;
    
    public IL(){
        
        try {
            ibg = ImageIO.read(new File ("rsc/bg.png"));
            iCat1= ImageIO.read(new File("rsc/cat1.png"));
            iCat2= ImageIO.read(new File("rsc/cat2.png"));
            
            for(int i=0;i<iug.length;i++){
                iug[i] = ImageIO.read(new File("rsc/ug" + (i+1)+ ".png"));
            }
            
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        
    }
}
