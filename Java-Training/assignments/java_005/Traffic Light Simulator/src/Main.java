import java.util.Scanner;

//Traffic Light Simulator
//Issic Silva

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		TrafficLightThread mainThread = new TrafficLightThread("");
		
		String endProgram = scan.nextLine();
		
		if(endProgram.isEmpty()) {
			TrafficLightThread.myStop();
			System.out.println("Traffic Light Simulator is Done!");
		}
	}

}
