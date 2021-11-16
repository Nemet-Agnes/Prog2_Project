package Actions;

import GUI.Button;

public class MouseCollision {
    int mouseX, mouseY, x, y, width, height;
    
    public boolean inside(int mouseX, int mouseY, Button btn){
        
        this.mouseX=mouseX;
        this.mouseY=mouseY;
        this.x=btn.getX();
        this.y=btn.getY();
        this.width=btn.getWidth();
        this.height=btn.getHeight();
        
        if(this.mouseX>=this.x && this.mouseX<= this.x + this.width && this.mouseY>this.y && this.mouseY< this.y+this.height){
            return true;
        }else{
           return false; 
        }
        
    }
}
