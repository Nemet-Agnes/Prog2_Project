package pack1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

public class Draw_Buttons extends JLabel{
    
    Gui gui = new Gui();
    int textWidth;
    
    protected void paintComponent(Graphics g){
        

        
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        //Menu Bar
        
        g.setFont(new Font ("Arial", Font.BOLD, 32));
        
        
        //Button Upgrades
        
        if(Gui.bUpgrades.hover){
            g.setColor(new Color(84,84,84,150));
            g.fillRect(Gui.bUpgrades.x, Gui.bUpgrades.y, Gui.bUpgrades.width, Gui.bUpgrades.height);
        }else{
            g.setColor(Color.white);
        }
        
        if(Gui.bUpgrades.active){
            g.setColor(new Color(22,135,128));
            g.fillRect(Gui.bUpgrades.x, Gui.bUpgrades.y,  Gui.bUpgrades.width,  Gui.bUpgrades.height);
        }
        
        g.setColor(Color.white);
        g.drawString("Upgrades", gui.width/2+25,60);
        
        
        //Button Achievement
        
        if(Gui.bAchievements.hover){
            g.setColor(new Color(84,84,84,150));
            g.fillRect(Gui.bAchievements.x, Gui.bAchievements.y, Gui.bAchievements.width, Gui.bAchievements.height);
        }else{
            g.setColor(Color.white);
        }
        
        if(Gui.bAchievements.active){
            g.setColor(new Color(22,135,128));
            g.fillRect(Gui.bAchievements.x, Gui.bAchievements.y,  Gui.bAchievements.width,  Gui.bAchievements.height);
        }
        
        g.setColor(Color.white);
        textWidth = g.getFontMetrics().stringWidth("Achievements");
        g.drawString("Achievements", 3*(gui.width/4)-(textWidth/2)+10,60);
        
        
        //Button Options
        
        if(Gui.bOptions.hover){
            g.setColor(new Color(84,84,84,150));
            g.fillRect(Gui.bOptions.x, Gui.bOptions.y, Gui.bOptions.width, Gui.bOptions.height);
        }else{
            g.setColor(Color.white);
        }
        
        if(Gui.bOptions.active){
            g.setColor(new Color(22,135,128));
            g.fillRect(Gui.bOptions.x, Gui.bOptions.y,  Gui.bOptions.width,  Gui.bOptions.height);
        }
        
        g.setColor(Color.white);
        textWidth = g.getFontMetrics().stringWidth("Options");
        g.drawString("Options", gui.width - textWidth - 25 ,60);
        
        
        repaint();
    }
}
