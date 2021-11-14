package pack1;
public class Main {
    
    static double coins = 0;
    static double cps = 10; // coins per sec
    static double cpc = 1; // coins per click
    static int ugNumber =2; // upgrade number
    
    public static void main(String[] args){
        
        Gui g = new Gui();
        g.createGui();
        
        new CoinCounter();
    }
    
}
