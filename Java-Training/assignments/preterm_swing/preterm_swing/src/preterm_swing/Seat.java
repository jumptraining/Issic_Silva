package preterm_swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

public class Seat {

	JButton jbutton;
	JLabel jlabel;
	
	//create variables for object
	private boolean bookUnbook;
	private int id;
	private String initials;
	private String seatName;
	private String row;
	private int column;
	private int jListID;
	
	
	Seat(int i, String lf, boolean assignment, String r, int c, String name, int k, JButton button, JLabel label, int j){
		setId(i);
		setSeatInitials(lf);
		setBooking(assignment);
		setRow(r);
		setColumn(c);
		setSeatName(name);
		setButton(button);
		setLabel(label);
		setJListID(j);
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public boolean getBooking() {
		return bookUnbook;
	}
	
	public void setBooking(boolean bookUnbook) {
		this.bookUnbook = bookUnbook;
	}
	
	public String getSeatName() {
		return seatName;
	}

	public void setSeatName(String seatName) {
		this.seatName = seatName;
	}
	
	public String getSeatInitials() {
		return initials;
	}
	
	public void setSeatInitials(String initials) {
		this.initials = initials;
	}

	public String getRow() {
		return row;
	}

	public void setRow(String string) {
		this.row = string;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	public JButton getButton() {
		return jbutton;
	}
	
	public void setButton(JButton button) {
		this.jbutton = button;
	}
	
	public JLabel getLabel() {
		return jlabel;
	}
	
	public void setLabel(JLabel label) {
		this.jlabel = label;
	}
	
	public int getJListID() {
		return jListID;
	}
	
	public void setJListID(int jlistId) {
		this.jListID = jlistId;
	}
	
	@Override
	   public String toString() {
	        return ("ID: "+this.getId()+
	                " Seat Initials: "+ this.getSeatInitials() +
	                " Seat Name: "+ this.getSeatName());
	   }
	
}
