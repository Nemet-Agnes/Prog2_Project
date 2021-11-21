package Draw;

import Actions.Main;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import GUI.Gui;
import GUI.IL;

public class Draw_Upgrades extends JLabel{
    
    Gui gui = new Gui();
    int textWidth;
    IL il= new IL();
    DecimalFormat df= new DecimalFormat("###,###,###");
    DecimalFormat df2= new DecimalFormat("###,###,###.#");
    
    @Override
    protected void paintComponent(Graphics g){
        

        
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        if(Gui.bUpgrades.isActive()){
            for(int i =0; i<Gui.upgrade.length;i++){
                
                if(Gui.upgrade[i].getY()>100){
                    
                
                
                g.setColor(new Color(43,61,79,150));
                g.fillRect(Gui.upgrade[i].getX()+1, Gui.upgrade[i].getY(), Gui.upgrade[i].getWidth(), Gui.upgrade[i].getHeight());
                
                g.setColor(new Color(255,255,255,150));
                g.drawLine(gui.width/2+1, Gui.upgrade[i].getY(), gui.width, Gui.upgrade[i].getY());
                g.drawLine(gui.width/2+1, Gui.upgrade[i].getY()+150, gui.width, Gui.upgrade[i].getY()+150);
                
                g.drawLine((gui.width/2) + ((gui.width/2)/3), Gui.upgrade[i].getY(), (gui.width/2) + ((gui.width/2)/3), Gui.upgrade[i].getY()+150);
                g.drawLine((gui.width/2) + (((gui.width/2)/3)*2), Gui.upgrade[i].getY(), (gui.width/2) + (((gui.width/2)/3)*2), Gui.upgrade[i].getY()+150);
                
                g.setColor(Color.WHITE);
                
                //Number
                g.setFont(new Font("Arial", Font.PLAIN,20));
                textWidth=g.getFontMetrics().stringWidth(Integer.toString(Gui.upgrade[i].getNumber()));
                g.drawString(Integer.toString(Gui.upgrade[i].getNumber()),(gui.width/2)+(((gui.width/2)/3)/2)-textWidth/2,Gui.upgrade[i].getY()+60);
                
                //Name
                g.setFont(new Font("Arial",Font.PLAIN,25));
                textWidth = g.getFontMetrics().stringWidth(Gui.upgrade[i].getName());
                g.drawString(Gui.upgrade[i].getName(), (gui.width/2)+(((gui.width/2)/3)/2)-textWidth/2, Gui.upgrade[i].getY()+110);
                
                //Image
                g.drawImage(Gui.upgrade[i].getImage(), (gui.width/2)+ ((gui.width/2)/3), Gui.upgrade[i].getY(), null);
                
                //Price
                String s= df.format(Gui.upgrade[i].getCost());
                textWidth = g.getFontMetrics().stringWidth(s + " CatCoins");
                g.drawString(s+ " CatCoins",(int)((gui.width/2)+((gui.width/2)*(5.0/6.0)) - textWidth/2) ,Gui.upgrade[i].getY()+55);
                
                //Upgrade Buttons
                g.setColor(new Color(255,255,255,75));
                g.drawRect(Gui.ugButton[i].getX(), Gui.ugButton[i].getY(), Gui.ugButton[i].getWidth(), Gui.ugButton[i].getHeight());
                
                if(Gui.ugButton[i].isHover()){
                    g.setColor(new Color(84,84,84,150));
                    g.fillRect(Gui.ugButton[i].getX(), Gui.ugButton[i].getY(), Gui.ugButton[i].getWidth(), Gui.ugButton[i].getHeight());
                }
                
                g.setColor(Color.WHITE);
                textWidth = g.getFontMetrics().stringWidth("Upgrade");
                g.drawString("Upgrade",(int)((gui.width/2)+((gui.width/2)*(5.0/6.0)) - textWidth/2) ,Gui.upgrade[i].getY()+113);
                
              }
            }
        }
        //Upgrade Clicker
        g.setFont(new Font("Arial",Font.PLAIN,25));
        g.setColor(new Color(255,255,255,75));
        g.drawRect(Gui.ugClicker.getX(),Gui.ugClicker.getY(),Gui.ugClicker.getWidth(),Gui.ugClicker.getHeight());
        
        if(Gui.ugClicker.isHover()){
            g.setColor(new Color(84,84,84,150));
            g.fillRect(Gui.ugClicker.getX(),Gui.ugClicker.getY(),Gui.ugClicker.getWidth(),Gui.ugClicker.getHeight());
        }else{
            g.setColor(Color.white);
        }
        
        g.setColor(Color.white);
        textWidth = g.getFontMetrics().stringWidth("Upgrade");
        g.drawString("Upgrade", gui.width/4 - textWidth/2,532);//480
        
        
        String s = df.format(Main.ugClickerCost)+ " CatCoins";
        textWidth = g.getFontMetrics().stringWidth(s);
        g.drawString(s, gui.width/4 - textWidth/2,480);
        
        g.setFont(new Font("Arial",Font.PLAIN,22));
        s=df2.format(Main.cpc)+" CatCoins/Click";
        textWidth = g.getFontMetrics().stringWidth(s);
        g.drawString(s, gui.width/4- textWidth /2,590);
        
        
        
        repaint();
    }
}
