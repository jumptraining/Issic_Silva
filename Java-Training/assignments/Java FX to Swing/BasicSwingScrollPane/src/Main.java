import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
  
public class Main {  
  
    private static void createAndShowGUI() {  
  
        // Create and set up the window.  
        final JFrame frame = new JFrame("Scroll Pane Example");  
  
        // Display the window.  
        frame.setSize(400, 400);  
        frame.setVisible(true);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
  
        // set flow layout for the frame  
        frame.getContentPane().setLayout(new FlowLayout());  
  
        JLabel label = new JLabel("ScrollPane Demo");
        JTextArea textArea = new JTextArea(10, 20);
        textArea.setText("A ScrollPane streamlines the process\n"
        		+ "of adding darn scrollbars to a window whose contents\n"
        		+ "exceed the vieweing area dimension of the window\n"
        		+ "It also enables a control to fit in\n"
        		+ "Such as this label control in Java Swing\n"
        		+ "Without it, we could not really view well the content\n"
        		+ "of a control if it overflowed, so using scrollbars helps lots!");
        JScrollPane scrollableTextArea = new JScrollPane(textArea);  
        textArea.setEditable(false);
        
        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
  
        frame.add(label);
        frame.getContentPane().add(scrollableTextArea);  
    }  
    public static void main(String[] args) {  
  
  
        javax.swing.SwingUtilities.invokeLater(new Runnable() {  
  
            public void run() {  
                createAndShowGUI();  
            }  
        });  
    }  
}  