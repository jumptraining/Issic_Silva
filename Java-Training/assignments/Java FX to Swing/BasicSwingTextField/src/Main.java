// Use a text field.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Main implements ActionListener {
	JTextField jtf;
	JButton jbtnRev;
	JLabel jlabPrompt, jlabContents;

	Main() {
		// Create a new JFrame container.
		JFrame jfrm = new JFrame("Textfield Demo");
		
		JPanel panel = new JPanel();
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		// Give the frame an initial size.
		jfrm.setSize(350, 150);
		// Terminate the program when the user closes the application.
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Create a text field.
		jtf = new JTextField();
		// Set the action commands for the text field.
		
		// Create the Reverse button.
		JButton jbtnRev = new JButton("Get Search String");
		// Add action listeners.
		jtf.addActionListener(this);
		jbtnRev.addActionListener(this);
		// Create the labels.
		jlabPrompt = new JLabel("TextField Demo");
		jlabContents = new JLabel("Search String:");
		// Add the components to the content pane.
		
		panel.add(jlabPrompt);
		panel.add(jtf);
		panel.add(jbtnRev);
		panel.add(jlabContents);
		jfrm.add(panel);
		
		// Display the frame.
		jfrm.setVisible(true);
	}
	// Handle action events.
	public void actionPerformed(ActionEvent ae) {
		jlabContents.setText("Search String: " + jtf.getText());
		
	}

	public static void main(String args[]) {
	// Create the frame on the event dispatching thread.
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Main();
			}
		});
	}
}