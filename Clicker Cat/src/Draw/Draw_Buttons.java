package Draw;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;
import GUI.Gui;
import GUI.IL;

public class Draw_Buttons extends JLabel{
    
    Gui gui = new Gui();
    IL il = new IL();
    int textWidth;
    
    protected void paintComponent(Graphics g){
        

        
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Cat Button
        if(Gui.bCat.isActive()){
            g.drawImage(il.iCat2, Gui.bCat.getX() + 15, Gui.bCat.getY() + 15, Gui.bCat.getWidth() - 30, Gui.bCat.getHeight()-30,null);
        }else{
            g.drawImage(il.iCat1, Gui.bCat.getX(), Gui.bCat.getY(), Gui.bCat.getWidth(), Gui.bCat.getHeight(),null);
        }
        
        //Menu Bar
        
        g.setFont(new Font ("Arial", Font.BOLD, 32));
        
        
        //Button Upgrades
        
        if(Gui.bUpgrades.isHover()){
            g.setColor(new Color(84,84,84,150));
            g.fillRect(Gui.bUpgrades.getX(),Gui.bUpgrades.getY(), Gui.bUpgrades.getWidth(), Gui.bUpgrades.getHeight());
        }else{
            g.setColor(Color.white);
        }
        
        if(Gui.bUpgrades.isActive()){
            g.setColor(new Color(22,135,128));
            g.fillRect(Gui.bUpgrades.getX(),Gui.bUpgrades.getY(), Gui.bUpgrades.getWidth(), Gui.bUpgrades.getHeight());
        }
        
        g.setColor(Color.white);
        g.drawString("Upgrades", gui.width/2+25,60);
        
        
        //Button Achievement
        
        if(Gui.bAchievements.isHover()){
            g.setColor(new Color(84,84,84,150));//150
            g.fillRect(Gui.bUpgrades.getX(),Gui.bUpgrades.getY(), Gui.bUpgrades.getWidth(), Gui.bUpgrades.getHeight());
        }else{
            g.setColor(Color.white);
        }
        
        if(Gui.bAchievements.isActive()){
            g.setColor(new Color(22,135,128));
            g.fillRect(Gui.bUpgrades.getX(),Gui.bUpgrades.getY(), Gui.bUpgrades.getWidth(), Gui.bUpgrades.getHeight());
        }
        
        g.setColor(Color.white);
        textWidth = g.getFontMetrics().stringWidth("Achievements");
        g.drawString("Achievements", 3*(gui.width/4)-(textWidth/2)+10,60);
        
        
        //Button Options
        
        if(Gui.bOptions.isHover()){
            g.setColor(new Color(84,84,84,150));
            g.fillRect(Gui.bOptions.getX(), Gui.bOptions.getY(), Gui.bOptions.getWidth(), Gui.bOptions.getHeight());
        }else{
            g.setColor(Color.white);
        }
        
        if(Gui.bOptions.isActive()){
            g.setColor(new Color(22,135,128));
            g.fillRect(Gui.bOptions.getX(), Gui.bOptions.getY(),  Gui.bOptions.getWidth(),  Gui.bOptions.getHeight());
        }
        
        g.setColor(Color.white);
        textWidth = g.getFontMetrics().stringWidth("Options");
        g.drawString("Options", gui.width - textWidth - 25 ,60);
        
        
        repaint();
    }
}
