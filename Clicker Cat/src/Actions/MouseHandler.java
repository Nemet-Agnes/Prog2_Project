package Actions;

import Actions.MouseCollision;
import GUI.Gui;
import GUI.Button;
import GUI.Upgrade;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;


public class MouseHandler implements MouseListener, MouseMotionListener, MouseWheelListener {
    
    Gui gui= new Gui();
    MouseCollision mc= new MouseCollision();
    
    @Override
    public void mouseClicked(MouseEvent e){
        
    }
    
    @Override
    public void mouseEntered(MouseEvent e){
        
    }
    
    @Override
    public void mouseExited(MouseEvent e){
        
    }
    
    @Override
    public void mousePressed(MouseEvent e){
        //Upgrades Button
        if(mc.inside(e.getX(), e.getY(), gui.bUpgrades)){
            Button.setActive(Gui.bUpgrades);
        }
        //Achievement Button
        if(mc.inside(e.getX(), e.getY(), gui.bAchievements)){
            Button.setActive(Gui.bAchievements);
        }
        //Options Button
        if(mc.inside(e.getX(), e.getY(), gui.bOptions)){
            Button.setActive(Gui.bOptions);
        }
        //Cat Button
        if(mc.inside(e.getX(), e.getY(), gui.bCat)){
            Gui.bCat.setActive(true);
            Main.coins += Main.cpc;
        }
        
        
        //Upgrade Buttons
        for( int i =0; i<Gui.upgrade.length;i++){
            if(mc.inside(e.getX(),e.getY(),Gui.ugButton[i])){
                if(Main.coins >= Gui.upgrade[i].getCost()){
                    Main.coins -= Gui.upgrade[i].getCost();
                    
                    int number=Gui.upgrade[i].getNumber();
                    Gui.upgrade[i].setNumber(number+=1);
                    int cst = Gui.upgrade[i].getCost();
                    Gui.upgrade[i].setCost(cst+= cst/2);
                    Upgrade.cpsUpgrade(i);
                    
                }
            }
        }
        //Upgrade Clicker
        if(mc.inside(e.getX(), e.getY(), Gui.ugClicker)){
            if(Main.coins >= Main.ugClickerCost){
                Main.coins -= Main.ugClickerCost;
                
                Main.ugClickerCost *=2;
                Main.cpc+=Main.cpc /2;
            }
        }
        //SAVE BUTTON:
        if(mc.inside(e.getX(), e.getY(), Gui.bSave)){
            Data.saveData();
        }
        //LOAD BUTTON:
        if(mc.inside(e.getX(), e.getY(), Gui.bLoad)){
            Data.loadData();
        }
    }
    
    @Override
    public void mouseReleased(MouseEvent e){
        //Cat Button
        if(Gui.bCat.isActive()){
            Gui.bCat.setActive(false);
            Main.coins += Main.cpc;
            
            Main.clickCount++;
        }
        
    }
    
    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        if(Gui.bUpgrades.isActive()){
            
            if(e.getX() > gui.width /2){
                //scroll down
                if(e.getWheelRotation() ==1){
                    Gui.actualHeight -=20;
                    
                    if(Gui.actualHeight >= -(Gui.maxHeight -550)){
                        for( int i= 0; i<Gui.upgrade.length;i++){
                            int y1 = Gui.upgrade[i].getY()-20;
                            int y2= Gui.ugButton[i].getY()-20;
                            
                            Gui.upgrade[i].setY(y1);
                            Gui.ugButton[i].setY(y2);
                            
                        }
                    }else{
                        Gui.actualHeight =-(Gui.maxHeight-550);
                    }
                }
                
                //scroll up
                if(e.getWheelRotation() ==-1){
                    Gui.actualHeight +=20;
                    
                    if(Gui.actualHeight <=0){
                        for(int i=0; i<Gui.upgrade.length;i++){
                            int y1 = Gui.upgrade[i].getY()+20;
                            int y2= Gui.ugButton[i].getY()+20;
                            
                            Gui.upgrade[i].setY(y1);
                            Gui.ugButton[i].setY(y2);
                        }
                    }else{
                        Gui.actualHeight = 0;
                    }
                    
                }
            }
        }
    }
    
    @Override
    public void mouseDragged(MouseEvent e) {
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
        if(mc.inside(e.getX(), e.getY(), Gui.bUpgrades)){
            Gui.bUpgrades.setHover(true);
            
        }else{
            Gui.bUpgrades.setHover(false);
        }
        
        if(mc.inside(e.getX(), e.getY(), Gui.bAchievements)){
            Gui.bAchievements.setHover(true);
            
        }else{
            Gui.bAchievements.setHover(false);
        }
        
        if(mc.inside(e.getX(), e.getY(), Gui.bOptions)){
            Gui.bOptions.setHover(true);
            
        }else{
            Gui.bOptions.setHover(false);
        }
        
        //Update Buttons
        for(int i=0; i<Gui.ugButton.length;i++){
            if(mc.inside(e.getX(), e.getY(), Gui.ugButton[i])){
                Gui.ugButton[i].setHover(true);
            }else{
                Gui.ugButton[i].setHover(false);
            }
        }
        //Upgrade Clicker
        if(mc.inside(e.getX(), e.getY(), Gui.ugClicker)){
            Gui.ugClicker.setHover(true);
        }else{
            Gui.ugClicker.setHover(false);
        }
    }

    
}
