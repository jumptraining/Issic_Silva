import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;


class ClientJList {
	JList<String> jlst;
	JLabel jlab;
	JScrollPane jscrlp;
	JPanel listPanel;
	
	private String lastName;
	private String firstName;
	private String id;
	private String seatName;
	List<ClientJList> clientList = new ArrayList<ClientJList>();
	
	ClientJList(String l, String f, String i) {
		setClientLastName(l);
		setClientFirstName(f);
		setClientId(i);
	}
	
	
	public String getClientId() {
		return id;
	}
	
	public void setClientId(String personCsv) {
		this.id = personCsv;
	}
	
	public String getClientLastName() {
		return lastName;
	}
	
	public void setClientLastName(String lastname) {
		this.lastName = lastname;
	}
	
	public String getClientFirstName() {
		return firstName;
	}
	
	public void setClientFirstName(String firstname) {
		this.firstName = firstname;
	}
	
	@Override
	   public String toString() {
	        return ("ID: "+this.getClientId()+
	                " Last Name: "+ this.getClientLastName() +
	                " First Name: "+ this.getClientFirstName());
	   }
	
	String getClientInitials() {
		char[] initialsArr = {' ', ' '};
		initialsArr[0] = firstName.charAt(0);
		initialsArr[1] = lastName.charAt(0); 
		return new String(initialsArr);
	}

	String getFullClientString() {
		String full = ("" + lastName + " " + firstName);
		return full;
	}
	
	public void getData() throws NumberFormatException, IOException {
		String file = "clients_list.csv";
		boolean first = true;
		
		BufferedReader br = new BufferedReader(new FileReader(file));  
		List<ClientJList> personList = new ArrayList<>();
		String line;
		while ((line = br.readLine()) != null) {  
				// skip the first line of the CSV 
				// it contains the field names
				if(first == true) {
					first = false;
					continue;
				}
			
		       // split on comma(',')  
		       String[] personCsv = line.split(",");  

		       // create client object to store values  
		       ClientJList clientObj = new ClientJList(line, line, id);  

		       // add values from csv to client object  
		       clientObj.setClientId(personCsv[0]);  
		       clientObj.setClientLastName(personCsv[1]);  
		       clientObj.setClientFirstName(personCsv[2]);   

		       // adding client objects to a list  
		       personList.add(clientObj);
		} 
		clientList = personList;
	}	
	// Create an array of names.
	//String[] names = { "Sherry", "Jon", "Rachel", "Sasha", "Josselyn", "Randy", "Tom", "Mary", "Ken", "Andrew", "Matt", "Todd" };

	ClientJList() throws NumberFormatException, IOException {
		//get the client list
		getData();
		
		//create model necessary to add list to JList
		DefaultListModel<String> listModel = new DefaultListModel<>();
		
		//add client list to model
		for(int i = 0; i < clientList.size(); i++) {
			listModel.add(i, clientList.get(i).getFullClientString());
		}
		
		listPanel = new JPanel();
        BoxLayout boxlayout = new BoxLayout(listPanel, BoxLayout.Y_AXIS); 
		listPanel.setLayout(boxlayout);
		// Create a JList.
		jlst = new JList<String>(listModel);
		// Set the list selection mode to single-selection.
		jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		// Add list to a scroll pane.
		jscrlp = new JScrollPane(jlst);
		
		// Make a label that displays the selection.
		jlab = new JLabel("Please choose a name");
		// Add list selection handler.
		jlst.addListSelectionListener( ListSelectionEvent -> {
			// Get the index of the changed item.
			int idx = jlst.getSelectedIndex();
			// Display selection, if item was selected.
			if(idx != -1) {
				//jlab.setText("Current selection: " + names[idx]);
				jlab.setText("Current Selection: " + clientList.get(idx).firstName);
			} else {
				// Otherwise, reprompt.
				jlab.setText("Please choose a name");
			}
		});
		// Add the list and label to the content pane.
		listPanel.add(jscrlp);
		listPanel.add(jlab);
	}
}
