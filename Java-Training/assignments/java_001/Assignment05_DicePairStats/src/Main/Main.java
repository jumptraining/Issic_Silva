package Main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tallyArray[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		//dice total 2
		Dice oneOne = new Dice();
		oneOne.tally = 0;
		oneOne.dieOne = 1;
		oneOne.dieTwo = 1;
		
		////dice total 3
		Dice oneTwo = new Dice();
		oneTwo.tally = 0;
		oneTwo.dieOne = 1;
		oneTwo.dieTwo = 2;
		
		//dice total 4
		Dice oneThree = new Dice();
		oneThree.tally = 0;
		oneThree.dieOne = 1;
		oneThree.dieTwo = 3;
		
		//dice total 4
		Dice twoTwo = new Dice();
		twoTwo.tally = 0;
		twoTwo.dieOne = 2;
		twoTwo.dieTwo = 2;
		
		//dice total 5
		Dice oneFour = new Dice();
		oneFour.tally = 0;
		oneFour.dieOne = 1;
		oneFour.dieTwo = 4;
		
		//dice total 5
		Dice twoThree = new Dice();
		twoThree.tally = 0;
		twoThree.dieOne = 2;
		twoThree.dieTwo = 3;
		
		//dice total 6
		Dice oneFive = new Dice();
		oneFive.tally = 0;
		oneFive.dieOne = 1;
		oneFive.dieTwo = 5;
		
		//dice total 6
		Dice twoFour = new Dice();
		twoFour.tally = 0;
		twoFour.dieOne = 2;
		twoFour.dieTwo = 4;
		
		//dice total 6
		Dice threeThree = new Dice();
		threeThree.tally = 0;
		threeThree.dieOne = 3;
		threeThree.dieTwo = 3;
		
		//dice total 7
		Dice oneSix = new Dice();
		oneSix.tally = 0;
		oneSix.dieOne = 1;
		oneSix.dieTwo = 6;
		
		//dice total 7
		Dice twoFive = new Dice();
		twoFive.tally = 0;
		twoFive.dieOne = 2;
		twoFive.dieTwo = 5;
		
		//dice total 7
		Dice threeFour = new Dice();
		threeFour.tally = 0;
		threeFour.dieOne = 3;
		threeFour.dieTwo = 4;
		
		//dice total 8
		Dice threeFive = new Dice();
		threeFive.tally = 0;
		threeFive.dieOne = 3;
		threeFive.dieTwo = 5;
		
		//dice total 8
		Dice fourFour = new Dice();
		fourFour.tally = 0;
		fourFour.dieOne = 4;
		fourFour.dieTwo = 4;
		
		//dice total 8
		Dice twoSix = new Dice();
		twoSix.tally = 0;
		twoSix.dieOne = 2;
		twoSix.dieTwo = 6;
		
		//dice total 9
		Dice threeSix = new Dice();
		threeSix.tally = 0;
		threeSix.dieOne = 3;
		threeSix.dieTwo = 6;
		
		//dice total 9
		Dice fourFive = new Dice();
		fourFive.tally = 0;
		fourFive.dieOne = 4;
		fourFive.dieTwo = 5;
		
		//dice total 10
		Dice fourSix = new Dice();
		fourSix.tally = 0;
		fourSix.dieOne = 4;
		fourSix.dieTwo = 6;
		
		//dice total 10
		Dice fiveFive = new Dice();
		fiveFive.tally = 0;
		fiveFive.dieOne = 5;
		fiveFive.dieTwo = 5;
		
		//dice total 11
		Dice fiveSix = new Dice();
		fiveSix.tally = 0;
		fiveSix.dieOne = 5;
		fiveSix.dieTwo = 6;
		
		//dice total 12
		Dice sixSix = new Dice();
		sixSix.tally = 0;
		sixSix.dieOne = 6;
		sixSix.dieTwo = 6;
		
		int count1 =0;
		//System.out.println("The array is of length " +tallyArray.length);
		
		//roll dice 1000 times
		for(int i =0; i<=999; i++){
			count1++;
			int die1 = 0;
			int die2 = 0;
			
			//get results from dice rolls
			die1 = throwDie(die1);
			die2 = throwDie(die2);
			
			
			int dieTotal = 0;
			
			//combine dice rolls for total
			dieTotal = die1 + die2;
			
			
			//if statements to get possible results
			if(dieTotal == 2) {
				if(die1 == 1 && die2 == 1) {
					oneOne.tally++;
				}
				
			}else if(dieTotal == 3) {
				if(die1 == 1 || die1 == 2) {
					oneTwo.tally++;
				}
				
			}else if(dieTotal == 4) {
				if(die1 == 1 || die1 == 3) {
					oneThree.tally++;
				}else if(die1 == 2 & die2 == 2) {
					twoTwo.tally++;
				}
				
			}else if(dieTotal == 5) {
				
				if(die1 == 1 || die1 == 4) {
					oneFour.tally++;
				}else if(die1 == 2 || die1 == 3) {
					twoThree.tally++;
				}
				
			}else if(dieTotal == 6) {
				
				if(die1 == 1 || die1 == 5) {
					oneFive.tally++;
				}else if(die1 == 2 || die1 == 4) {
					twoFour.tally++;
				}else if(die1 == 3 & die2 == 3) {
					threeThree.tally++;
				}
				
			}else if(dieTotal == 7) {
				if(die1 == 1 || die1 == 6) {
					oneSix.tally++;
				}else if(die1 == 2 || die1 == 5) {
					twoFive.tally++;
				}else if(die1 == 3 || die1 == 4) {
					threeFour.tally++;
				}
				
			}else if(dieTotal == 8) {
				if(die1 == 2 || die1 == 6) {
					twoSix.tally++;
				}else if(die1 == 3 || die1 == 5) {
					threeFive.tally++;
				}else if(die1 == 4 & die2 == 4) {
					fourFour.tally++;
				}
				
			}else if(dieTotal == 9) {
				if(die1 == 3 || die1 == 6) {
					threeSix.tally++;
				}else if(die1 == 4 || die1 == 5) {
					fourFive.tally++;
				}
				
			}else if(dieTotal == 10) {
				if(die1 == 4 || die1 == 6) {
					fourSix.tally++;
				}else if(die1 == 5 & die2 == 5) {
					fiveFive.tally++;
				}
				
			}else if(dieTotal == 11) {
				if(die1 == 5 || die1 == 6) {
					fiveSix.tally++;
				}
				
			}else if(dieTotal == 12) {
				if(die1 == 6 & die2 == 6) {
					sixSix.tally++;
				}
			}
			
		}
		
		//System.out.println("The loop is running " + count1 + " times.");
		
		//add tallies to array
		tallyArray[0] = oneOne.tally; 
		tallyArray[1] = oneTwo.tally; 
		tallyArray[2] = oneThree.tally; 
		tallyArray[3] = oneFour.tally; 
		tallyArray[4] = oneFive.tally; 
		tallyArray[5] = oneSix.tally; 
		tallyArray[6] = twoTwo.tally; 
		tallyArray[7] = twoThree.tally; 
		tallyArray[8] = twoFour.tally; 
		tallyArray[9] = twoFive.tally; 
		tallyArray[10] = twoSix.tally; 
		tallyArray[11] = threeThree.tally; 
		tallyArray[12] = threeFour.tally; 
		tallyArray[13] = threeFive.tally; 
		tallyArray[14] = threeSix.tally; 
		tallyArray[15] = fourFour.tally; 
		tallyArray[16] = fourFive.tally; 
		tallyArray[17] = fourSix.tally; 
		tallyArray[18] = fiveFive.tally; 
		tallyArray[19] = fiveSix.tally; 
		tallyArray[20] = sixSix.tally;
		
		
		//Print out results
		System.out.println("1000 Random 2 dice toss stats");
		
		if(tallyArray[0] == 0) {
			System.out.println("Dice 1 and 1: " + tallyArray[0] + " occurence");
		}else {
			System.out.println("Dice 1 and 1: " + tallyArray[0] + " times");
		}
		if(tallyArray[1] == 0) {
			System.out.println("Dice 1 and 2: " + tallyArray[1] + " occurence");
		}else {
			System.out.println("Dice 1 and 2: " + tallyArray[1] + " times");
		}
		if(tallyArray[2] == 0) {
			System.out.println("Dice 1 and 3: " + tallyArray[2] + " occurence");
		}else {
			System.out.println("Dice 1 and 3: " + tallyArray[2] + " times");
		}
		if(tallyArray[3] == 0) {
			System.out.println("Dice 1 and 4: " + tallyArray[3] + " occurence");
		}else {
			System.out.println("Dice 1 and 4: " + tallyArray[3] + " times");
		}
		if(tallyArray[4] == 0) {
			System.out.println("Dice 1 and 5: " + tallyArray[4] + " occurence");
		}else {
			System.out.println("Dice 1 and 5: " + tallyArray[4] + " times");
		}
		if(tallyArray[5] == 0) {
			System.out.println("Dice 1 and 6: " + tallyArray[5] + " occurence");
		}else {
			System.out.println("Dice 1 and 6: " + tallyArray[5] + " times");
		}
		if(tallyArray[6] == 0) {
			System.out.println("Dice 2 and 2: " + tallyArray[6] + " occurence");
		}else {
			System.out.println("Dice 2 and 2: " + tallyArray[6] + " times");
		}
		if(tallyArray[7] == 0) {
			System.out.println("Dice 2 and 3: " + tallyArray[7] + " occurence");
		}else {
			System.out.println("Dice 2 and 3: " + tallyArray[7] + " times");
		}
		if(tallyArray[8] == 0) {
			System.out.println("Dice 2 and 4: " + tallyArray[8] + " occurence");
		}else {
			System.out.println("Dice 2 and 4: " + tallyArray[8] + " times");
		}
		if(tallyArray[9] == 0) {
			System.out.println("Dice 2 and 5: " + tallyArray[9] + " occurence");
		}else {
			System.out.println("Dice 2 and 5: " + tallyArray[9] + " times");
		}
		if(tallyArray[10] == 0) {
			System.out.println("Dice 2 and 6: " + tallyArray[10] + " occurence");
		}else {
			System.out.println("Dice 2 and 6: " + tallyArray[10] + " times");
		}
		if(tallyArray[11] == 0) {
			System.out.println("Dice 3 and 3: " + tallyArray[11] + " occurence");
		}else {
			System.out.println("Dice 3 and 3: " + tallyArray[11] + " times");
		}
		if(tallyArray[12] == 0) {
			System.out.println("Dice 3 and 4: " + tallyArray[12] + " occurence");
		}else {
			System.out.println("Dice 3 and 4: " + tallyArray[12] + " times");
		}
		if(tallyArray[13] == 0) {
			System.out.println("Dice 3 and 5: " + tallyArray[13] + " occurence");
		}else {
			System.out.println("Dice 3 and 5: " + tallyArray[13] + " times");
		}
		if(tallyArray[14] == 0) {
			System.out.println("Dice 3 and 6: " + tallyArray[14] + " occurence");
		}else {
			System.out.println("Dice 3 and 6: " + tallyArray[14] + " times");
		}
		if(tallyArray[15] == 0) {
			System.out.println("Dice 4 and 4: " + tallyArray[15] + " occurence");
		}else {
			System.out.println("Dice 4 and 4: " + tallyArray[15] + " times");
		}
		if(tallyArray[16] == 0) {
			System.out.println("Dice 4 and 5: " + tallyArray[16] + " occurence");
		}else {
			System.out.println("Dice 4 and 5: " + tallyArray[16] + " times");
		}
		if(tallyArray[17] == 0) {
			System.out.println("Dice 4 and 6: " + tallyArray[17] + " occurence");
		}else {
			System.out.println("Dice 4 and 6: " + tallyArray[17] + " times");
		}
		if(tallyArray[18] == 0) {
			System.out.println("Dice 5 and 5: " + tallyArray[18] + " occurence");
		}else {
			System.out.println("Dice 5 and 5: " + tallyArray[18] + " times");
		}
		if(tallyArray[19] == 0) {
			System.out.println("Dice 5 and 6: " + tallyArray[19] + " occurence");
		}else {
			System.out.println("Dice 5 and 6: " + tallyArray[19] + " times");
		}
		if(tallyArray[20] == 0) {
			System.out.println("Dice 6 and 6: " + tallyArray[20] + " occurence");
		}else {
			System.out.println("Dice 6 and 6: " + tallyArray[20] + " times");
		}
		
		//count results
		int count = tallyArray[0] + tallyArray[1] + tallyArray[2] + tallyArray[3] + tallyArray[4] + tallyArray[5] + tallyArray[6] + tallyArray[7] + tallyArray[8] + tallyArray[9]
				+ tallyArray[10] + tallyArray[11] + tallyArray[12] + tallyArray[13] + tallyArray[14] + tallyArray[15] + tallyArray[16] + tallyArray[17] + tallyArray[18] + tallyArray[19] + tallyArray[20];
		System.out.println("Total: " + count);
		
	}
	
	
	//random method
	public static  int throwDie(int result){
		
		int max = 6;
		int min = 1;
		
		int range = max-min +1;
		
		int rand = (int)(Math.random() * range) + min;
		
		return rand;
		
	}
	
	

}