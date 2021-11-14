package pack1;

import javax.swing.JFrame;

public class Gui {
    
    JFrame jf;
    Draw d;
    Draw_Buttons db;
    Draw_Upgrades du;
    IL il = new IL();
    
    final int width= 1200, height=720;
    
    static Button bUpgrades, bAchievements, bOptions;
    static Button ugButton[]= new Button[Main.ugNumber];
   
    static Upgrade upgrade [] = new Upgrade[Main.ugNumber];
    
    public void createGui(){
        
        bUpgrades = new Button(width/2,0,146+50,100);
        bUpgrades.active = true;
        bAchievements = new Button(width/2+196,0,219+50,100);
        bOptions = new Button(width - 175 ,0 ,175,100);
        
        for(int i=0; i<upgrade.length;i++){
            ugButton[i] = new Button();
            ugButton[i].y =150+(i*200)+85;
            ugButton[i].x=(width/2)+ (((width/2)/3)*2)+20;
            ugButton[i].width=170;
            ugButton[i].height=40;
            
        }
        
        upgrade[0]= new Upgrade(150,"Cat Bed!",il.iug[0],0,10);
        upgrade[1]= new Upgrade(350,"Cat Tower",il.iug[1],0,100);
        
        jf= new JFrame("Cat Clicker");
        jf.setSize(width,height);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);
        
        db= new Draw_Buttons();
        db.setSize(width,height);
        db.setVisible(true);
        db.requestFocus();
        db.addMouseListener(new MouseHandler());
        db.addMouseMotionListener(new MouseHandler());
        jf.add(db);
        
        du= new Draw_Upgrades();
        du.setSize(width,height);
        du.setVisible(true);
        du.requestFocus();
        du.addMouseListener(new MouseHandler());
        du.addMouseMotionListener(new MouseHandler());
        jf.add(du);
        
        
        
        d= new Draw();
        d.setSize(width,height);
        d.setVisible(true);
        d.requestFocus();
        d.addMouseListener(new MouseHandler());
        d.addMouseMotionListener(new MouseHandler());
        d.addMouseWheelListener(new MouseHandler());
        jf.add(d);
        
        
        
        
        jf.setVisible(true);
        
        
    }
}
