/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Draw;

import GUI.Gui;
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
public class Draw_Options extends JLabel{
    
    
    Gui gui = new Gui();
    int textWidth;
    protected void paintComponent(Graphics g){
        

        
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        if(Gui.bOptions.isActive()){
            //SAVE
            g.setColor(new Color(43,61,79,150));
            g.fillRect(gui.width/2+1,150,gui.width,150);
            
            g.setColor(new Color(255,255,255,150));
            g.drawLine(gui.width/2+1,150+150,gui.width,150+150);
            
            g.drawRect(Gui.bSave.getX(), Gui.bSave.getY(), Gui.bSave.getWidth(), Gui.bSave.getHeight());
            
            if( Gui.bSave.isHover()){
                g.setColor(new Color(84,84,84,150));
                g.fillRect(Gui.bSave.getX()+1, Gui.bSave.getY()+1, Gui.bSave.getWidth()-2, Gui.bSave.getHeight()-2);
            }else{
                g.setColor(Color.white);
            }
            
            g.setColor(Color.white);
            g.setFont(new Font("Arial", Font.PLAIN,25));
            textWidth = g.getFontMetrics().stringWidth("Save");
            g.drawString("Save",(gui.width/4)*3 +textWidth/2,233); 
            
            //LOAD
            g.setColor(new Color(43,61,79,150));
            g.fillRect(gui.width/2+1,350,gui.width,350);
            
            g.setColor(new Color(255,255,255,150));
            g.drawLine(gui.width/2+1,350+150 ,gui.width,350+150);
            
            g.drawRect(Gui.bLoad.getX(), Gui.bLoad.getY(), Gui.bLoad.getWidth(), Gui.bLoad.getHeight());
            
            if( Gui.bLoad.isHover()){
                g.setColor(new Color(84,84,84,150));
                g.fillRect(Gui.bLoad.getX()+1, Gui.bLoad.getY()+1, Gui.bLoad.getWidth()-2, Gui.bLoad.getHeight()-2);
            }else{
                g.setColor(Color.white);
            }
            
            g.setColor(Color.white);
            g.setFont(new Font("Arial", Font.PLAIN,25));
            textWidth = g.getFontMetrics().stringWidth("Load");
            g.drawString("Load",(gui.width/4)*3 +textWidth/2,233+200); 
            
        }
        
        repaint();
        
    }
}
