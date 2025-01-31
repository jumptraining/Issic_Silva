package preterm_swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.*;

public class Main {

	static int gridColumn = 10;
	static int gridRow = 10;
	static int tempID;
	// Client class constructor
	static Client client = new Client("", "", 0, null);
	//create model necessary to add list to JList
	static	DefaultListModel<Client> listModel = new DefaultListModel<>();
	// create JList of objects of Clients
	static JList<Client> jlist;
	// holding list for clients
	static List<Client> tempList = new ArrayList<Client>();
	static JButton undoAll = new JButton("Reset Seats");
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		SwingUtilities.invokeLater(new Runnable() {
			Swing demo;
			JFrame frame;
			
			public void run() {
				demo = new Swing("Matrix Assignment Demo");
				
				frame = demo.getFrame();
				try {
					frame = setFrameStuff(frame, JFrame.EXIT_ON_CLOSE, 400, 200);
				} catch (NumberFormatException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				frame.setVisible(true);
			}
		});
	}
	
	public static JFrame setFrameStuff(JFrame frame, int onExit, int width, int height) throws NumberFormatException, IOException {
		
		centerAndSizeJFrameOnScreen(frame, gridColumn * 200, gridRow * 200);
		frame.setDefaultCloseOperation(onExit);
		
		JPanel panelMain = new JPanel(new BorderLayout(0,20));
		JPanel panelNorth = new JPanel(new BorderLayout());
		JPanel panelSouth = new JPanel(new BorderLayout());
		JPanel panelLeft = new JPanel(new BorderLayout());
	
		JLabel northLabel = new JLabel("2nd Matrix Demo");
		northLabel.setHorizontalAlignment(JLabel.CENTER);
		
		JButton printList = new JButton("Print List");
		printList.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				printList();
			}
			
		});
		
		panelLeft.add(ClientJList());		
		panelNorth.add(northLabel);
		panelSouth.add(undoAll, BorderLayout.WEST);
		panelSouth.add(printList, BorderLayout.EAST);
		panelMain.add(panelNorth, BorderLayout.NORTH);
		panelMain.add(SeatMatrix(), BorderLayout.CENTER);
		panelMain.add(panelSouth, BorderLayout.SOUTH);
		panelMain.add(panelLeft, BorderLayout.WEST);
		frame.add(panelMain);
		return frame;
}
	
public static void centerAndSizeJFrameOnScreen(JFrame frame, int width, int height) {
		// set the size of the frame to half in width and height
		frame.setSize(width/2, height/2);
		// here's the part where the JFrame gets actually centered
		frame.setLocationRelativeTo(null);
}
	
	
public static JPanel SeatMatrix() throws NumberFormatException, IOException {
		
		//set the size and allocate space for tempList to hold removed clients
		for(int i = 0; i < client.clientList.size(); i ++) {
			tempList.add(client);
		}

		JPanel panelCenter = new JPanel(new GridLayout(gridRow, gridColumn, 5, 5));
		
		//render seat matrix and set initial attribute values
		for(int i = 1; i < gridRow + 1 ; i++) {
			for(int j = 1; j < gridColumn + 1; j++) {
				Seat seat = new Seat(0, null, false, null, 0, null, 0, null, null, 0);
				JPanel tempPanel = new JPanel();
				BoxLayout boxlayout = new BoxLayout(tempPanel, BoxLayout.Y_AXIS);
				tempPanel.setLayout(boxlayout);
				seat.setRow(getCharForNumber(i));
				seat.setColumn(j);
				seat.setSeatName(seat.getRow() + seat.getColumn());
				
				JLabel tempLabel = new JLabel(seat.getRow() + "-" + seat.getColumn(), JLabel.CENTER);
				JLabel clientLabel = new JLabel("Vacant");
				JButton tempButton = new JButton("book");
	
				
				//set tempID as -1 so user cannot book unless a name is selected
				tempID = -1;
				//booking / un-booking
				tempButton.addActionListener( ActionEvent -> {
					
					//get the index of selected name
					int idx = tempID;
					// if a name is not selected then booking can't be done
					if(idx != -1) {
						// if a selection option is empty, that option cannot be booked
						if(!listModel.get(idx).getClientFirstName().isEmpty()) {
							// if a seat is empty then booking is possible
							if(seat.getBooking() == false) {
								//book seat if vacant
								if(tempButton.getText().equals("book")) {
									listModel.get(idx).setSeat(seat.getSeatName());
									seat.setBooking(true);
									seat.setJListID(idx);
									seat.setId(listModel.get(idx).getClientId());
									seat.setSeatInitials(listModel.get(idx).getClientInitials());
									clientLabel.setText("id: " + seat.getId() + "/ " + seat.getSeatInitials());
									seat.setLabel(clientLabel);
									tempButton.setText("unbook");
									tempButton.setForeground(Color.RED);
									tempList.set(idx, listModel.get(idx));
									listModel.set(idx, client);
								}
							}else {
								//unbook seat if seat is occupied
								if(tempButton.getText().equals("unbook")) {
									seat.setBooking(false);
									seat.setId(0);
									seat.setSeatInitials(null);
									clientLabel.setText("Vacant");
									seat.setLabel(clientLabel);
									tempButton.setText("book");
									tempButton.setForeground(Color.black);
									listModel.set(seat.getJListID(), tempList.get(seat.getJListID()));
									tempList.set(seat.getJListID(), client);
								}
							}
						}else if(tempButton.getText().equals("unbook")) {
							seat.setBooking(false);
							seat.setId(0);
							seat.setSeatInitials(null);
							clientLabel.setText("Vacant");
							seat.setLabel(clientLabel);
							tempButton.setText("book");
							tempButton.setForeground(Color.black);
							listModel.set(seat.getJListID(), tempList.get(seat.getJListID()));
							tempList.set(seat.getJListID(), client);
						}
					}
				});
				
				undoAll.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// reset button works only if there are seats booked.
						if(seat.getBooking()) {
							seat.setBooking(false);
							seat.setId(0);
							seat.setSeatInitials(null);
							clientLabel.setText("Vacant");
							seat.setLabel(clientLabel);
							tempButton.setText("book");
							tempButton.setForeground(Color.black);
							listModel.set(seat.getJListID(), tempList.get(seat.getJListID()));
					
							tempList.set(seat.getJListID(), client);
						}
						
					}
				});
				
				//update GUI
				seat.setLabel(clientLabel);
				seat.setButton(tempButton);
				tempPanel.add(tempLabel);
				tempPanel.add(seat.getLabel());
				tempPanel.add(seat.getButton());
				panelCenter.add(tempPanel);
			}
		}
		panelCenter.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		return panelCenter;
	}

public static JPanel ClientJList() throws NumberFormatException, IOException {
		
	//create java swing components
	JScrollPane jscrlp;
	JPanel listPanel;
	
	//get the client list
	client.getData();
	
	//add clientList to model
	listModel.addAll(client.clientList);
	
	listPanel = new JPanel();
    BoxLayout boxlayout = new BoxLayout(listPanel, BoxLayout.Y_AXIS); 
	listPanel.setLayout(boxlayout);
	// Create a JList.
	jlist = new JList<Client>(listModel);
	// Set the list selection mode to single-selection.
	jlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

	jlist.setFixedCellWidth(175);
	// Add list to a scroll pane.
	jscrlp = new JScrollPane(jlist);
	
	jlist.addListSelectionListener( ListSelectionEvent -> {
		// Get the index of the changed item.
		tempID = jlist.getSelectedIndex();
	});
	// Add the list and label to the content pane.
	listPanel.add(jscrlp);
	return listPanel;
}
	
private static void printList() {
	System.out.format("%-30s%-10s%-10s\n", "Client", "Id", "Seat");
	for(int i = 0; i< tempList.size(); i++) {
		if(!tempList.get(i).getClientId().equals(0)) {
				System.out.format("%-30s%-10s%-10s\n", tempList.get(i).getFullClientString(), tempList.get(i).getClientId(),tempList.get(i).getSeat());
		}
	}		
}
	
private static String getCharForNumber(int i) {
	    return i > 0 && i < 27 ? String.valueOf((char)(i + 64)) : null;
	}
}
