import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Main {
	
  public static void main(String args[]) {
    JFrame frame = new JFrame("Grouping Example");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel(new GridLayout(0, 1));

    JLabel title = new JLabel("Radio Buttons");
    JLabel label = new JLabel();
    ButtonGroup group = new ButtonGroup();
    JRadioButton aRadioButton = new JRadioButton("Train");
    JRadioButton bRadioButton = new JRadioButton("Car");
    JRadioButton cRadioButton = new JRadioButton("Plane");
    JRadioButton dRadioButton = new JRadioButton("Boat");

    ActionListener sliceActionListener = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
        AbstractButton aButton = (AbstractButton) actionEvent.getSource();
        label.setText(aButton.getText());
      }
    };

    panel.add(title);
    panel.add(aRadioButton);
    group.add(aRadioButton);
    panel.add(bRadioButton);
    group.add(bRadioButton);
    panel.add(cRadioButton);
    group.add(cRadioButton);
    panel.add(dRadioButton);
    group.add(dRadioButton);
    panel.add(label);

    aRadioButton.addActionListener(sliceActionListener);
    bRadioButton.addActionListener(sliceActionListener);
    cRadioButton.addActionListener(sliceActionListener);
    dRadioButton.addActionListener(sliceActionListener);


    frame.add(panel);
    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}