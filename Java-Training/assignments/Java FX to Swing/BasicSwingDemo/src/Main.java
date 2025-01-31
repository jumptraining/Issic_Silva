import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main implements ActionListener{

	Main(){
		// Create a new JFrame container.
		JFrame jframe = new JFrame("Basic Swing Demo");
		jframe.setSize(350, 350);
		// Terminate the program when the user closes the application.
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JButton button = new JButton("Say 'Hello World'");
		button.setSize(new Dimension(50, 50));
		
		button.addActionListener(this);
		
		panel.add(button, BorderLayout.CENTER);
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
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
	}

}
