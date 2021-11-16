package Actions;

import java.util.Timer;
import java.util.TimerTask;

public class CoinCounter {
    
    Timer count;
    
    public CoinCounter(){
        count = new Timer();
        count.scheduleAtFixedRate(new TimerTask(){
            
            @Override
            public void run(){
                Main.coins += Main.cps/100;
            }
        },0,10);
    }
}
