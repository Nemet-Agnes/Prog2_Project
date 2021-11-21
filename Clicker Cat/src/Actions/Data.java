 package Actions;

import GUI.Gui;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

public class Data {
    
    File folder = new File("data");
    File file = new File("data/save.txt");
    StringBuilder sb= new StringBuilder();
    
    
    public static void saveData(){
        
        Data data = new Data();
        // létrehoz
        if(!data.folder.exists()){
            data.folder.mkdirs();
            
        }
        
        if(!data.file.exists()){
            try {
                data.file.createNewFile();
                
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        }
        //mentés
        data.sb.append(Main.coins); 
        data.sb.append("\n");
        data.sb.append(Main.cps); 
        data.sb.append("\n");
        data.sb.append(Main.cpc); 
        data.sb.append("\n");
        data.sb.append(Main.ugClickerCost); 
        data.sb.append("\n");
        
        for(int i= 0; i<Gui.upgrade.length;i++){
            data.sb.append(Gui.upgrade[i].getNumber());
            data.sb.append("\n");
            data.sb.append(Gui.upgrade[i].getCost());
            data.sb.append("\n");
        }
        
        data.sb.append(Main.clickCount);
        data.sb.append("\n");
        
        for(int i=0; i< Main.achievementNumber;i++){
            if(Gui.achievement[i].isUnlocked()){
                data.sb.append("1");
                data.sb.append("\n");
            }else{
                data.sb.append("0");
                data.sb.append("\n");
            }
        }
        
        try{
        OutputStream stream = new FileOutputStream(data.file);
        String s = data.sb.toString();
        
         stream.write(s.getBytes());
         stream.close();
         
            System.out.println(s);
            System.out.println("Data saved!");
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
    public static void loadData(){
        
        JFileChooser chooser = new JFileChooser();
        
        int temp = chooser.showOpenDialog(null);
        if(temp == JFileChooser.APPROVE_OPTION){
            String s = chooser.getSelectedFile().getAbsolutePath();
           if( s.endsWith("save.txt")){
               File file = new File(s);
                try {
                    Scanner sc = new Scanner(file);
                    Main.coins = Double.parseDouble(sc.nextLine());
                    Main.cpc= Double.parseDouble(sc.nextLine());
                    Main.cps = Double.parseDouble(sc.nextLine());
                    Main.ugClickerCost = Integer.parseInt(sc.nextLine());
                    
                    for(int i=0; i<Gui.upgrade.length;i++){
                        Gui.upgrade[i].setNumber(Integer.parseInt(sc.nextLine()));
                        Gui.upgrade[i].setCost(Integer.parseInt(sc.nextLine()));
                    }
                    
                     Main.clickCount = Integer.parseInt(sc.nextLine());
                     for(int i=0; i<Main.achievementNumber;i++){
                         if(sc.nextLine().equals("1")){
                             Gui.achievement[i].setUnlocked(true);
                            
                         }else{
                             Gui.achievement[i].setUnlocked(false);
                         }
                     }
                    
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }else{
               System.out.println("Error when loading file");
           }
        }
        
        
        
    }
    
}
