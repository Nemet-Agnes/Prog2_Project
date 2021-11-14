package pack1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.DecimalFormat;
import javax.swing.JLabel;

public class Draw_Upgrades extends JLabel{
    
    Gui gui = new Gui();
    int textWidth;
    DecimalFormat df= new DecimalFormat("###,###,###");
    
    @Override
    protected void paintComponent(Graphics g){
        

        
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        if(Gui.bUpgrades.active){
            for(int i =0; i<Gui.upgrade.length;i++){
                g.setColor(new Color(43,61,79,150));
                g.fillRect(Gui.upgrade[i].x+1, Gui.upgrade[i].y, Gui.upgrade[i].width, Gui.upgrade[i].height);
                
                g.setColor(new Color(255,255,255,150));
                g.drawLine(gui.width/2+1, Gui.upgrade[i].y, gui.width, Gui.upgrade[i].y);
                g.drawLine(gui.width/2+1, Gui.upgrade[i].y+150, gui.width, Gui.upgrade[i].y+150);
                
                g.setColor(Color.WHITE);
                
                //Number
                g.setFont(new Font("Arial", Font.PLAIN,20));
                textWidth=g.getFontMetrics().stringWidth(Integer.toString(Gui.upgrade[i].number));
                g.drawString(Integer.toString(Gui.upgrade[i].number),(gui.width/2)+(((gui.width/2)/3)/2)-textWidth/2,Gui.upgrade[i].y+60);
            }
        }
        
        
        
        repaint();
    }
}
