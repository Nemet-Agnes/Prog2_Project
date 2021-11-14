package pack1;
public class Button {
    
    int x,y,width,height;
    boolean hover=false, active=false;
            
    public Button(int x, int y, int width, int height){
        this.x =x;
        this.y=y;
        this.width = width;
        this.height=height;
        
        
    }
    public Button(){
        
    }
    public static void setActive(Button btn){
        if(btn == Gui.bUpgrades){
            if(Gui.bUpgrades.active==false){
                Gui.bUpgrades.active=true;
                
                Gui.bAchievements.active=false;
                Gui.bOptions.active=false;
            }else if(Gui.bUpgrades.active){
                Gui.bUpgrades.active=false;
            }
        }else if( btn == Gui.bAchievements){
            if(Gui.bAchievements.active==false){
                Gui.bAchievements.active=true;
                
                Gui.bUpgrades.active=false;
                Gui.bOptions.active=false;
            }else if(Gui.bAchievements.active){
                Gui.bAchievements.active=false;
            }
        }
        else if( btn == Gui.bOptions){
            if(Gui.bOptions.active==false){
                Gui.bOptions.active=true;
                
                Gui.bUpgrades.active=false;
                Gui.bAchievements.active=false;
            }else if(Gui.bOptions.active){
                Gui.bOptions.active=false;
            }//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        }
    }
}
