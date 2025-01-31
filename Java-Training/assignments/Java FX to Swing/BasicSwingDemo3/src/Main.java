import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main{

	JLabel label;
	Main(){
		// Create a new JFrame container.
		JFrame jframe = new JFrame("Basic Swing Demo");
		jframe.setSize(300, 150);
		// Terminate the program when the user closes the application.
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		label = new JLabel("Push a Button!");
		
		JButton alphaButton = new JButton("Alpha");
		alphaButton.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent event) {
	            label.setText("Alpha was pressed.");
	        }
	    });
		
		JButton betaButton = new JButton("Beta");
		betaButton.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent event) {
	            label.setText("Beta was pressed");
	        }
	    });
		panel.add(alphaButton);
		panel.add(betaButton);
		panel.add(label);
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
