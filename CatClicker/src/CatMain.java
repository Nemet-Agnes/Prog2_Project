import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class CatMain {
    
    JLabel counterLabel, perSecondLabel;
    JButton button1, button2, button3, button4;
    int catCoinCounter, timerSpeed;
    double persecond;
    boolean timerOn;
    Font fontOne, fontTwo;
    CatHandler cHandler = new CatHandler();
    Timer pawtimer;
    
    public static void main(String[] args){
        new CatMain();
    }
    public CatMain(){
        
        timerOn=false;
        persecond=0;
        catCoinCounter=0;
        
        createFont();
        createUI();
    }
    public void createFont(){
        fontOne= new Font("Comic Sans MS", Font.PLAIN, 30);
        fontTwo= new Font("Comic Sans MS", Font.PLAIN, 15);
    }
    public void createUI(){
        JFrame window = new JFrame();
        window.setSize(1000,700);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        
        JPanel catPanel = new JPanel();
        catPanel.setBounds(0,0,700,700);
        catPanel.setBackground(null);
        window.add(catPanel);
        
        ImageIcon cat = new ImageIcon(getClass().getClassLoader().getResource("kitty700x700Basic face.png"));
        
        JButton catButton = new JButton();
        catButton.setBackground(null);
        catButton.setFocusPainted(false);
        catButton.setBorder(null);
        catButton.setIcon(cat);
        catButton.addActionListener(cHandler);
        catButton.setActionCommand("cat");
        catPanel.add(catButton);
        
        JPanel counterPanel = new JPanel();
        counterPanel.setBounds(800,100,200,100);
        counterPanel.setBackground(null);
        counterPanel.setLayout(new GridLayout(2,1));
        window.add(counterPanel);
        
        counterLabel = new JLabel(catCoinCounter + " Cat coins!");
        counterLabel.setForeground(Color.white);
        counterLabel.setFont(fontOne);
        counterPanel.add(counterLabel);
        
        perSecondLabel = new JLabel();
        perSecondLabel.setForeground(Color.white);
        perSecondLabel.setFont(fontTwo);
        counterPanel.add(perSecondLabel);
        
        JPanel cursorShop = new JPanel();
        cursorShop.setBounds(800,170,250,250);
        cursorShop.setBackground(null);
        cursorShop.setLayout(new GridLayout(4,1));
        window.add(cursorShop);
        
        button1 = new JButton("One Paw");
        button1.setFont(fontOne);
        button1.setFocusPainted(false);
        button1.addActionListener(cHandler);
        button1.setActionCommand("Cursor");
        cursorShop.add(button1);
        
        button2 = new JButton("Two Paw");
        button2.setFont(fontOne);
        button2.setFocusPainted(false);
        button2.addActionListener(cHandler);
        button2.setActionCommand("Cursor");
        cursorShop.add(button2);
        
        button3 = new JButton("Three Paw");
        button3.setFont(fontOne);
        button3.setFocusPainted(false);
        button3.addActionListener(cHandler);
        button3.setActionCommand("Cursor");
        cursorShop.add(button3);
        
        button4 = new JButton("Four Paw");
        button4.setFont(fontOne);
        button4.setFocusPainted(false);
        button4.addActionListener(cHandler);
        button4.setActionCommand("Cursor");
        cursorShop.add(button4);
        
        window.setVisible(true);
        
    }
    public void setTimer(){
        pawtimer = new Timer(timerSpeed,new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                catCoinCounter++;
                counterLabel.setText(catCoinCounter + " Cat coins!");
            }
        });
        
    }
    public void timerUpdate(){ //milyen gyakran növeli a coin numbert
        
        if(timerOn==false){
            timerOn=true;
        }
        else if(timerOn==true){
            pawtimer.stop();
        }
        double speed = 1/persecond*1000;
        timerSpeed=(int)Math.round(speed);
        
        perSecondLabel.setText("per second: "+ persecond);
        
        setTimer();
        pawtimer.start();
    }
    
    public class CatHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            
            String action = event.getActionCommand();
            
            switch(action){
                case "cat":
                    catCoinCounter++;
                    counterLabel.setText(catCoinCounter + " Cat coins!");
                    break;
                case "Cursor":
                    persecond = persecond + 0.1;
                    timerUpdate();
            }
            
        } 
    }
}

