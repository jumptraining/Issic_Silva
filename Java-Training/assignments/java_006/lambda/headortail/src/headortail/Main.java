//By Issic Silva
package headortail;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean exit = false;
		boolean firstPass = true;
		String breakLoop = null;
		String continueLoop = null;
		
		do {
			if(firstPass) {
				System.out.println("Welcome to the game of Head or Tail where you will flip your life away!");
				firstPass = false;
			}
			System.out.println("Press the F key and flip your luck!");
			
			continueLoop = scan.nextLine();
			
			if(continueLoop.equalsIgnoreCase("f")) {
				RandomNumber random = () -> (int)( Math.floor( Math.random() + 1.5 ) );
			
				HeadOrTail result = (number) -> {
					boolean flip;
					if(number == 2) {
						flip = true;
					}else {
						flip = false;
					}
					return flip;
				};
			
				boolean flip = result.decide(random.onetwo());
			
				if(flip) {
				System.out.println("The coin flip is Head!");
				}else {
				System.out.println("The coin flip is Tails!");
				}
			}
			
			System.out.println("Press the Q key to quit and any other key to continue.");
			breakLoop = scan.nextLine();
			
			if(breakLoop.equalsIgnoreCase("q")) {
				System.out.println("Thank you for playing.");
				exit = true;
			}
		}while(exit == false);
	}
}
