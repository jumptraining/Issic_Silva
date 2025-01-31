import java.awt.*;
import java.awt.event.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Main{

	
	JLabel label;
	Main(){
		// Create a new JFrame container.
		JFrame jframe = new JFrame("Basic Swing Demo");
		jframe.setSize(200, 400);
		// Terminate the program when the user closes the application.
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		
		label = new JLabel();
		
		JButton buttonFungi = new JButton("Fungi");
		try {
		    Image img = ImageIO.read(getClass().getResource("fungi.png"));
		    Image newImg = img.getScaledInstance( 20, 20,  java.awt.Image.SCALE_SMOOTH ) ; 
		    buttonFungi.setIcon(new ImageIcon(newImg));
		  } catch (Exception ex) {
		    System.out.println(ex);
		  }
		buttonFungi.setVerticalTextPosition(JButton.TOP);
		buttonFungi.setHorizontalTextPosition(JButton.LEFT);
		buttonFungi.addActionListener(new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent event) {
	            label.setText("Fungi");
	        }
	    });
		
		JButton buttonDairy = new JButton("Dairy");
		try {
		    Image img = ImageIO.read(getClass().getResource("dairy.png"));
		    Image newImg = img.getScaledInstance( 20, 20,  java.awt.Image.SCALE_SMOOTH ) ; 
		    buttonDairy.setIcon(new ImageIcon(newImg));
		  } catch (Exception ex) {
		    System.out.println(ex);
		  }
		buttonDairy.setVerticalTextPosition(JButton.TOP);
		buttonDairy.setHorizontalTextPosition(JButton.RIGHT);
		buttonDairy.addActionListener(new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent event) {
	            label.setText("Dairy");
	        }
	    });
		
		JButton resetButton = new JButton("Reset");
		buttonFungi.setSize(new Dimension(50, 50));
		
		resetButton.addActionListener(new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent event) {
	            label.setText("");
	        }
	    });
		
		
		panel.add(buttonFungi);
		panel.add(buttonDairy);
		panel.add(label);
		panel.add(resetButton);
		jframe.add(panel);
		
		// Display the frame.
		jframe.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Main();
				
			}
		});
		
	}

}
