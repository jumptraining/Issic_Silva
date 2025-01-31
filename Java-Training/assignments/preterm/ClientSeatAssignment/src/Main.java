import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	
    static List<AssignedClient> assignedClientList = new ArrayList<AssignedClient>();
    static Room room = new Room();

	public static void getInput() throws NumberFormatException, IOException {
		
		Room room = new Room();
		Client client = new Client("", "", "");
		AssignedClient assignedClient = new AssignedClient("", "", "", "");
		
		client.getData();
		room.fillSeats();
		
		Integer[] arr = new Integer[101];
	    for (int i = 0; i < arr.length; i++) {
	        	arr[i] = i;
	    }
	    Collections.shuffle(Arrays.asList(arr));
		for(int i = 0; i < client.clientList.size(); i ++) {
			room.theatreRoom.get(arr[i]).setId(Integer.parseInt(client.clientList.get(i).getClientId()));
			room.theatreRoom.get(arr[i]).setSeatInitials(client.clientList.get(i).getClientInitials());
			
			AssignedClient listObj = new AssignedClient(null, null, null, null);
			
			listObj.setFirstName(client.clientList.get(i).getClientFirstName());
			listObj.setLastName(client.clientList.get(i).getClientLastName());
			listObj.setId(client.clientList.get(i).getClientId());
			listObj.setSeatNumber(room.theatreRoom.get(arr[i]).getSeatName());
			
			assignedClientList.add(listObj);
		}
		
		room.drawMatrix();
		for(AssignedClient listItem : assignedClientList){
		    System.out.println(listItem);
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		getInput();
	}

}
