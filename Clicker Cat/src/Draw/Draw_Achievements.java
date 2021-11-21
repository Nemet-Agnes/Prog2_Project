/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Draw;

import Actions.Main;
import GUI.Gui;
import GUI.IL;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

/**
 *
 * @author Ágica
 */
public class Draw_Achievements extends JLabel {
    Gui gui = new Gui();
    IL il = new IL();
    int textWidth;
    
    protected void paintComponent(Graphics g){
        

        
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        if(Gui.bAchievements.isActive() ){
            for(int i=0;i< Main.achievementNumber;i++){
                g.drawImage(Gui.achievement[i].getImage(),Gui.achievement[i].getX(),Gui.achievement[i].getY(),null);
                if(!Gui.achievement[i].isUnlocked()){
                    g.setColor(new Color(0,0,0,150));
                    g.fillRect(Gui.achievement[i].getX(),Gui.achievement[i].getY(),Gui.achievement[i].getWidth(),Gui.achievement[i].getHeight());
                }
                if(Gui.achievement[i].isHover()){
                    g.setColor(Color.WHITE);
                    g.drawRect(Gui.achievement[i].getX(),Gui.achievement[i].getY(),Gui.achievement[i].getWidth()-1,Gui.achievement[i].getHeight()-1);
                    g.setFont(new Font("Arial",Font.PLAIN,20));
                    
                    String s = Gui.achievement[i].getName();
                    textWidth = g.getFontMetrics().stringWidth(s);
                    g.drawString(s,(int)(gui.width/2+gui.width/4-textWidth/2),590);
                    
                    s = Gui.achievement[i].getText();
                    textWidth = g.getFontMetrics().stringWidth(s);
                    g.drawString(s,(int)(gui.width/2+gui.width/4-textWidth/2),645);
                    
                    g.setColor(new Color(255,255,255,75));
                    g.drawLine((int)(gui.width/2+gui.width/4- textWidth/4),610,(int)(gui.width/2+gui.width/4+ textWidth/4),610);
                }
            }
            
            g.setColor(new Color(255,255,255,75));
            g.drawLine(gui.width /2 +1, 550, gui.width,550);
        }
        
        for(int i=0; i<Gui.achievementSlider.length;i++){
            if(Gui.achievementSlider[i].isVisible()){
                g.setColor(Color.WHITE);
                g.drawRect(Gui.achievementSlider[i].getX(),Gui.achievementSlider[i].getY(), getWidth(),getHeight());
                Gui.achievementSlider[i].getHeight();
                g.drawImage(Gui.achievementSlider[i].getImage(),Gui.achievementSlider[i].getX()+5,Gui.achievementSlider[i].getY()+5,null);
                g.setFont(new Font("Arial",Font.PLAIN,12));
                g.drawString(Gui.achievementSlider[i].getText(),Gui.achievementSlider[i].getX()+50,Gui.achievementSlider[i].getY()+30);
            }
        }
        repaint();
    }
}
