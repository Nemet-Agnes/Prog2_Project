package GUI;

public class Button {
    
    int x,y,width,height;
    boolean hover=false, active=false;
            
    Button(int x, int y, int width, int height){
        this.x =x;
        this.y=y;
        this.width = width;
        this.height=height;
        
        
    }
    public Button(){
        
    }
    public static void setActive(Button btn){
        Gui.bUpgrades.active=false;
        Gui.bAchievements.active=false;
        Gui.bOptions.active=false;
        
        btn.active = true;
        
//        if(btn == Gui.bUpgrades){
//            if(Gui.bUpgrades.active==false){
//                Gui.bUpgrades.active=true;
//                
//                Gui.bAchievements.active=false;
//                Gui.bOptions.active=false;
//            }else if(Gui.bUpgrades.active){
//                Gui.bUpgrades.active=false;
//            }
//        }else if( btn == Gui.bAchievements){
//            if(Gui.bAchievements.active==false){
//                Gui.bAchievements.active=true;
//                
//                Gui.bUpgrades.active=false;
//                Gui.bOptions.active=false;
//            }else if(Gui.bAchievements.active){
//                Gui.bAchievements.active=false;
//            }
//        }
//        else if( btn == Gui.bOptions){
//            if(Gui.bOptions.active==false){
//                Gui.bOptions.active=true;
//                
//                Gui.bUpgrades.active=false;
//                Gui.bAchievements.active=false;
//            }else if(Gui.bOptions.active){
//                Gui.bOptions.active=false;
//            }//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//        }
    } // getter & setter

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isHover() {
        return hover;
    }

    public void setHover(boolean hover) {
        this.hover = hover;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
}
