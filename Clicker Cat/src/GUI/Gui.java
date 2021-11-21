package GUI;

import Draw.Draw_Buttons;
import Draw.Draw_Main;
import Draw.Draw_Upgrades;
import javax.swing.JFrame;
import Actions.Main;
import Actions.MouseHandler;
import Draw.Draw_Options;

public class Gui {
    
    JFrame jf;
    Draw_Main d;
    Draw_Buttons db;
    Draw_Upgrades du;
    Draw_Options dop;
    IL il = new IL();
    
    public final int width= 1200;
    public final int height=720;
    
    public static int maxHeight, actualHeight=0;
    
    public static Button bUpgrades;
    public static Button bAchievements;
    public static Button bOptions;
    
    public static Button ugClicker, bCat;
    public static Button bSave, bLoad;
    
    
    
    public static Button ugButton[]= new Button[Main.ugNumber];
   
    public static Upgrade upgrade [] = new Upgrade[Main.ugNumber];
    
    public void createGui(){
        
        bUpgrades = new Button(width/2,0,146+50,100);
        bUpgrades.active = true;
        bAchievements = new Button(width/2+196,0,219+50,100);
        bOptions = new Button(width - 175 ,0 ,175,100);
        
        bCat = new Button(width/4-96,150,192,192 );
        ugClicker=new Button(width/4-75, 500, 150,50);
        
        bSave = new Button((width/4)*3-100,200,200,50);
        bLoad = new Button((width/4)*3-100,400,200,50);
        
        for(int i=0; i<upgrade.length;i++){
            ugButton[i] = new Button();
            ugButton[i].y =150+(i*200)+85;
            ugButton[i].x=(width/2)+ (((width/2)/3)*2)+20;
            ugButton[i].width=170;
            ugButton[i].height=40;
            
        }
        
        upgrade[0]= new Upgrade(150,"Cat Bed!",il.iug[0],0,50); //
        upgrade[1]= new Upgrade(350,"Cat Tower",il.iug[1],0,100);
        
        upgrade[2]= new Upgrade(550,"CatNip",il.iug[0],0,5000);
        upgrade[3]= new Upgrade(750,"Mousetrap ",il.iug[0],0,50000);
        
        maxHeight = (upgrade.length *(150+50));
        
        
        jf= new JFrame("Cat Clicker");
        jf.setSize(width,height);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.addMouseWheelListener(new MouseHandler());
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
        
        dop= new Draw_Options();
        dop.setSize(width,height);
        dop.setVisible(true);
        dop.requestFocus();
        dop.addMouseListener(new MouseHandler());
        dop.addMouseMotionListener(new MouseHandler());
        jf.add(dop);
        
        
        
        d= new Draw_Main();
        d.setSize(width,height);
        d.setVisible(true);
        d.requestFocus();
        d.addMouseListener(new MouseHandler());
        d.addMouseMotionListener(new MouseHandler());

        jf.add(d);
        
        
        
        
        jf.setVisible(true);
        
        
    }
}
