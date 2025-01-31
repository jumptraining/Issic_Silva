import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Main{

	JLabel label;
	Main(){
		// Create a new JFrame container.
		JFrame jframe = new JFrame("Basic Swing Demo");
		jframe.setSize(200, 200);
		// Terminate the program when the user closes the application.
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		label = new JLabel();
		
		JButton button = new JButton("Say 'Hello World'");
		button.setSize(new Dimension(50, 50));
		button.addActionListener(new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent event) {
	            label.setText("Hello World");
	        }
	    });
		
		JButton resetButton = new JButton("Reset");
		button.setSize(new Dimension(50, 50));
		
		resetButton.addActionListener(new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent event) {
	            label.setText("");
	        }
	    });
		
		panel.add(button, BorderLayout.NORTH);
		panel.add(label, BorderLayout.CENTER);
		panel.add(resetButton, BorderLayout.SOUTH);
		jframe.add(panel);
		
		// Display the frame.
		jframe.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				System.out.println("Run method running.");
				new Main();
				
			}
		});
		
	}

}
