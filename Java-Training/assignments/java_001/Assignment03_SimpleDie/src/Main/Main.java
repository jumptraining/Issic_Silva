package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean playAgain = false;
		boolean askOnlyOnce = false;
		String throwDie = null;
		
		do {
			
			//boolean to ask to quit only once
			if(askOnlyOnce == false) {
			System.out.println("Press any key to throw a die and press enter (or q and Enter to quit)");
			throwDie = scan.nextLine();
			askOnlyOnce = true;
			}
			
				//if program not terminated throw die and continue
				if(throwDie.equalsIgnoreCase("q")) {
					System.out.println("Program Terminated.");
					System.exit(0);
				}else {
					int max = 6;
					int min = 1;
					
					int range = max-min +1;
					
					int rand = (int)(Math.random() * range) + min;
					
					System.out.println("You have rolled a " + rand);
				
					System.out.println("Play Again? Push Y to play again, any other key to Quit.");
					String input = scan.nextLine();
					//condition to end loop if user does not want to play again.
					if(!input.equalsIgnoreCase("y")) {
						playAgain = true;
				}
			}
			
			}while(!playAgain);
		
		

	}

}
