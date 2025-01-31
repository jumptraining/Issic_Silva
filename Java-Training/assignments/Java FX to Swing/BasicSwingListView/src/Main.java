import java.awt.event.*;
import java.util.ArrayList;
import java.awt.*; 
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener; 

class Main extends JFrame  
{ 
    //frame 
    static JFrame frame; 
    //lists 
    static JList list; 
   
    static DefaultListModel model;
    
    //main class 
    public static void main(String[] args) 
    { 
        //create a new frame  
        frame = new JFrame("frame"); 
          
        //create a object 
        Main s=new Main(); 
        
        //create a panel 
        JPanel panel =new JPanel(); 
        GridLayout gridLayout = new GridLayout(0,1);
        panel.setLayout(gridLayout);
        
        //create a new label 
        JLabel label= new JLabel("Select Transport Type"); 
        JLabel label2= new JLabel("Nothing selected"); 
        //String array to store weekdays 
        //String transport[]= { "Train","Car","Airplane"}; 
        ArrayList<String> transport = new ArrayList<String>();
        transport.add("Train");
        transport.add("Car");
        transport.add("Airplane");
        
          
        
        JButton button1 = new JButton("Add an Item");
        JButton button2 = new JButton("Remove first Item");
        
        button1.addActionListener(new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent event) {
	            //list.add("test");
	        }
	    });
        button2.addActionListener(new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent event) {
	        	//list.remove(0); 
	        }
	    });
        
        model = new DefaultListModel();
        model.addAll(transport);
        list= new JList();
        list.setModel(model);
        list.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				label2.setText(transport.get(list.getSelectedIndex()));
			}
        });
        
        //add list to panel 
        panel.add(label);
        panel.add(list); 
        panel.add(label2);
        panel.add(button1);
        panel.add(button2);
   
        frame.add(panel); 
          
        //set the size of frame 
        frame.setSize(400,400); 
           
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); 
    } 
      
      
} 