package Actions;

import Actions.CoinCounter;
import GUI.Gui;

public class Main {
    
    public static double coins = 0;
    public static double cps = 0; // coins per sec
    public static double cpc = 1; // coins per click
    public static int ugNumber =4; // upgrade number
    
    public static int ugClickerCost = 10;
    
    public static void main(String[] args){
        
        Gui g = new Gui();
        g.createGui();
        
        new CoinCounter();
    }
    
}
