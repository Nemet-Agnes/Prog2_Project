package Actions;

import GUI.AchievementSlider;
import GUI.Achievement;
import GUI.Gui;
import java.util.Timer;
import java.util.TimerTask;

public class AchievementCheck {
    Timer time;
    public AchievementCheck(){
        time = new Timer();
        time.schedule(new TimerTask(){
            
            @Override
            public void run(){
                
                //achievement 1
                if(!Gui.achievement[0].isUnlocked()){
                    if(Main.coins >=10000){
                        unlock(Gui.achievement[0],Gui.achievementSlider[0]);
                    }
                }
                // Achievement 2
				if (!Gui.achievement[1].isUnlocked()) {

					if (Main.coins >= 1000000) {
						unlock(Gui.achievement[1], Gui.achievementSlider[1]);
					}
				}

				// Achievement 3
				if (!Gui.achievement[2].isUnlocked()) {

					if (Main.coins >= 100000000) {
						unlock(Gui.achievement[2], Gui.achievementSlider[2]);
					}
				}

				// Achievement 4
				if (!Gui.achievement[3].isUnlocked()) {

					int temp = 0;

					for (int i = 0; i < Gui.upgrade.length; i++) {
						if (Gui.upgrade[i].getNumber() > 0) {
							temp++;
						}
					}

					if (temp == Main.ugNumber) {
						unlock(Gui.achievement[3], Gui.achievementSlider[3]);
					}
				}

				// Achievement 5
				if (!Gui.achievement[4].isUnlocked()) {

					int temp2 = 0;

					for (int i = 0; i < Gui.upgrade.length; i++) {
						temp2 += Gui.upgrade[i].getNumber();

					}

					if (temp2 >= 100) {
						unlock(Gui.achievement[4], Gui.achievementSlider[4]);
					}
				}
				
				
				// Achievement 6
				if (!Gui.achievement[5].isUnlocked()) {
					
					if (Gui.upgrade[0].getNumber() >= 100) {
						unlock(Gui.achievement[5], Gui.achievementSlider[5]);
					}
				}
				
				
				// Achievement 7
				if (!Gui.achievement[6].isUnlocked()) {
					
					if (Main.clickCount >= 1000) {
						unlock(Gui.achievement[6], Gui.achievementSlider[6]);
					}
				}
				
				// Achievement 8
				if (!Gui.achievement[7].isUnlocked()) {
					
					if (Main.clickCount >= 10000) {
						unlock(Gui.achievement[7], Gui.achievementSlider[7]);
					}
				}
				
				// Achievement 9
				if (!Gui.achievement[8].isUnlocked()) {
					
					if (Main.cps >= 1000) {
						unlock(Gui.achievement[8], Gui.achievementSlider[8]);
					}
				}
				
				// Achievement 10
				if (!Gui.achievement[9].isUnlocked()) {
					
					if (Main.cps >= 10000) {
						unlock(Gui.achievement[9], Gui.achievementSlider[9]);
					}
				}
                
            }
        },1000,1000);
    }
    public static void unlock(Achievement achievement, AchievementSlider slider){
        achievement.setUnlocked(true);
        slider.setVisible(true);
        AchievementSlider.slideIn(slider);
        
    }
}
