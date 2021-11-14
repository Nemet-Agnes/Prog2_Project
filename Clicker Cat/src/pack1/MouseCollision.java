package pack1;
public class MouseCollision {
    int mouseX, mouseY, x, y, width, height;
    
    public boolean inside(int mouseX, int mouseY, Button btn){
        
        this.mouseX=mouseX;
        this.mouseY=mouseY;
        this.x=btn.x;
        this.y=btn.y;
        this.width=btn.width;
        this.height=btn.height;
        
        if(this.mouseX>=this.x && this.mouseX<= this.x + this.width && this.mouseY>this.y && this.mouseY< this.y+this.height){
            return true;
        }else{
           return false; 
        }
        
    }
}
