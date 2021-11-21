package GUI;

import Actions.Main;
import GUI.Gui;
import java.awt.image.BufferedImage;

public class Upgrade {
    
    Gui gui= new Gui();
    
    int x,y;
    int width=gui.width/2;
    int height=150;
    String name;
    BufferedImage image;
    int number;
    int cost;
    
    public Upgrade(int y, String name, BufferedImage imgage, int number, int cost){
        this.x=gui.width/2;
        this.y=y;
        this.name=name;
        this.image=image;
        this.number=number;
        this.cost=cost;
        
    }
    public static void cpsUpgrade(int index){
        switch(index){
            case 0:
                Main.cps +=2;
                break;
            case 1:
                Main.cps +=10;
                break;
            case 2:
                Main.cps +=50;
                break;
            case 3:
                Main.cps +=100;
                break;
           
        }
    }
   
    //getterek setterek
    

    public Gui getGui() {
        return gui;
    }

    public void setGui(Gui gui) {
        this.gui = gui;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    
    
}
