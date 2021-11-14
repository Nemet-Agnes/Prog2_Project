package pack1;

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
    }
    
    @Override
    public void mouseReleased(MouseEvent e){
        
    }
    
    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        
    }
    
    @Override
    public void mouseDragged(MouseEvent e) {
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
        if(mc.inside(e.getX(), e.getY(), Gui.bUpgrades)){
            Gui.bUpgrades.hover = true;
            
        }else{
            Gui.bUpgrades.hover = false;
        }
        
        if(mc.inside(e.getX(), e.getY(), Gui.bAchievements)){
            Gui.bAchievements.hover = true;
            
        }else{
            Gui.bAchievements.hover = false;
        }
        
        if(mc.inside(e.getX(), e.getY(), Gui.bOptions)){
            Gui.bOptions.hover = true;
            
        }else{
            Gui.bOptions.hover = false;
        }
        
        //Update Buttons
        for(int i=0; i<Gui.ugButton.length;i++){
            if(mc.inside(e.getX(), e.getY(), Gui.ugButton[i])){
                Gui.ugButton[i].hover=true;
            }else{
                Gui.ugButton[i].hover=false;
            }
        }
    }

    
}
