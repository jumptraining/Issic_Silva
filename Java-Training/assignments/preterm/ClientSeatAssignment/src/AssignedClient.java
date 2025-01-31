import java.util.ArrayList;
import java.util.List;

public class AssignedClient {
	
	private String firstName;
	private String lastName;
	private String id;
	private String seatNumber;
	
	
	
	AssignedClient(String fn, String ln, String i, String sn){
		setFirstName(fn);
		setLastName(ln);
		setId(i);
		setSeatNumber(sn);
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getSeatNumber() {
		return seatNumber;
	}
	
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	
	String getFullClientString() {
		String full = (lastName + " " + firstName);
		return full;
	}
	
	@Override
	   public String toString() {
	        return ("Name: "+this.getFullClientString() +
	                " ID: "+ this.getId() +
	                " Seat: "+ this.getSeatNumber());
	   }
	
	
}
