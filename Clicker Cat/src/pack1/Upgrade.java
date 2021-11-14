package pack1;

import java.awt.image.BufferedImage;

public class Upgrade {
    
    Gui gui= new Gui();
    
    int x,y;
    int width=gui.width/2;
    int height=150;
    String name;
    BufferedImage image;
    int number;
    int cost;
    
    public Upgrade(int y, String name, BufferedImage imgage, int number, int cost){
        this.x=gui.width/2;
        this.y=y;
        this.name=name;
        this.image=image;
        this.number=number;
        this.cost=cost;
        
    }
    public static void cpsUpgrade(int index){
        
    }
}
