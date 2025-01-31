import java.awt.event.*;
import java.util.ArrayList;
import java.awt.*; 
import javax.swing.*; 
class Main extends JFrame{ 
  
    // frame 
    static JFrame frame; 
  
    // label 
    static JLabel label; 
  
    // checkbox 
    static JButton button1, button2, button3, button4, button5, button6; 
  
    // main class 
    public static void main(String[] args) 
    { 
        // create a new frame 
        frame = new JFrame("frame"); 
  
        // create a object 
        Main s = new Main(); 
  
        // set layout of frame 
        frame.setLayout(new FlowLayout()); 
  
        // create buttons
        button1 = new JButton("Button 1"); 
        button2 = new JButton("Button 2"); 
        button3 = new JButton("Button 3"); 
        button4 = new JButton("Button 4"); 
        button5 = new JButton("Button 5"); 
        button6 = new JButton("Button 6"); 
  
        // create labels 
        label = new JLabel("Push a Button"); 
  
        // create a new panel 
        JPanel panel = new JPanel();
        GridLayout gridLayout = new GridLayout(2,3);
        panel.setLayout(gridLayout);
        
        JPanel panelMain = new JPanel();
        
        panelMain.add(label);
        panel.add(button1); 
        panel.add(button2); 
        panel.add(button3);
        panel.add(button4); 
        panel.add(button5); 
        panel.add(button6);
         
  
        // add panel to frame 
        frame.add(panelMain);
        frame.add(panel); 
  
        // set the size of frame 
        frame.setSize(300, 200); 
  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    } 
} 