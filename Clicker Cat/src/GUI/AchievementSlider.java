package GUI;

import java.awt.image.BufferedImage;
import java.util.Timer;
import java.util.TimerTask;

public class AchievementSlider {
    
    Gui gui = new Gui();
    int x=0, y, width=200, height=50;
    BufferedImage image;
    String text;
    boolean visible = false;
    
    public AchievementSlider(Achievement achievement){
        this.y=gui.height;
        this.image= achievement.getImage();
        this.text= achievement.getText();
    }
    
    public static void slideIn(AchievementSlider achievementSlider){
        Timer time = new Timer();
        time.scheduleAtFixedRate(new TimerTask(){
        int temp =0;
        @Override
        public void run(){
            if(temp<80){
                achievementSlider.y -=1;
                temp++;
            }else{
                slideOut(achievementSlider);
                try{
                time.cancel();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    },0,30);
        
    }
    
    public static void slideOut(AchievementSlider achievementSlider){
        Timer time = new Timer();
        time.scheduleAtFixedRate(new TimerTask(){
        int temp =80;
        @Override
        public void run(){
            if(temp>0){
                achievementSlider.y +=1;
                temp--;
            }else{
                achievementSlider.setVisible(false);
                try{
                time.cancel();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    },0,30);
        
    }
    
    

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

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}
