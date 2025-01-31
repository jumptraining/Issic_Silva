import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
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
					
					int die1 = 0;
					int die2 = 0;
					
					System.out.println("You have rolled the following:");
					
					//call method to roll each die
					System.out.println("First Die: " + throwDie(die1));
					System.out.println("Second Die: " + throwDie(die2));
				
					System.out.println("Play Again? Push Y to play again, any other key to Quit.");
					String input = scan.nextLine();
					//condition to end loop if user does not want to play again.
					if(!input.equalsIgnoreCase("y")) {
						playAgain = true;
				}
			}
			
			}while(!playAgain);
	}
	
	//method to simulate rolling one die 
	public static  int throwDie(int result){
		
		int max = 6;
		int min = 1;
		
		int range = max-min +1;
		
		int rand = (int)(Math.random() * range) + min;
		
		return rand;
		
	}

}
