package Draw;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import GUI.Gui;
import GUI.IL;
import Actions.Main;

public class Draw_Main extends JLabel{

        IL i = new IL();
        Gui gui = new Gui();
        
        DecimalFormat df = new DecimalFormat("###,###,###");
        DecimalFormat df2 = new DecimalFormat("###,###,###.###");
        
        String s;
        int textWidth;
        
    protected void paintComponent(Graphics g){
        

        
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        //Háttér
        g.drawImage(i.ibg, 0, 0, null);
        
        //Fenti menü
        g.setColor(new Color(43,61,79,100));
        g.fillRect(0, 0, gui.width, 100);
        
        //Vonalka
        g.setColor(Color.white);
        g.drawLine(gui.width/2, 100, gui.width/2, gui.height);
        g.drawLine(0, 100, gui.width, 100);
        
        //Szöveg
        g.setFont(new Font("Arial", Font.BOLD,37));
        s = df.format(Main.coins)+ " CatCoins";
        textWidth = g.getFontMetrics().stringWidth(s);
        g.drawString(s , gui.width/4 - textWidth /2 , 62);
        
        g.setFont(new Font("Arial", Font.BOLD,20));
        s=df2.format(Main.cps)+ " CatCoins/s";
        g.drawString(s, 10, 88);
        
        
        
        repaint();
        
    }
    
}
