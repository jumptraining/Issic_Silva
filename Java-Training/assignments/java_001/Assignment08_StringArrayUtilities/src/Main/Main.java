package Main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String myList[] = {"Bozo", "Foobar", "Delta", "Foozball", "Demo", "Money", "Zoo"};
		int foundIndexes[];
		boolean found = false;
		
		
		System.out.println("This is the of the arrayHasExactMatch and indexOfOccurenceInArray methods");
		System.out.println("The array to test contains the following items:");
		for(int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}
		System.out.println();
		System.out.println("Scenario 1");
		found = arrayHasExactMatch (myList, "zo", false);
		System.out.println("arrayHasExactMatch " + found);
		System.out.println("Scenario 2");
		found = arrayHasExactMatch (myList, "zoo", false);
		System.out.println("Scenario 3");
		System.out.println("arrayHasExactMatch " + found);
		System.out.println("Scenario 4");
		found = arrayHasExactMatch (myList, "zoo", true);
		System.out.println("arrayHasExactMatch " + found);
		System.out.println("Scenario 5");
		found = arrayHasExactMatch (myList, "foo", true);
		System.out.println("arrayHasExactMatch " + found);
		System.out.println("Scenario 6");
		found = arrayHasExactMatch (myList, "foo", false);
		System.out.println("arrayHasExactMatch " + found);
		System.out.println("Scenario 7");
		found = arrayHasExactMatch (myList, "delta", true);
		System.out.println("arrayHasExactMatch " + found);
		System.out.println("Scenario 8");
		found = arrayHasExactMatch (myList, "Delta", true);
		System.out.println("arrayHasExactMatch " + found);
		
		System.out.println("Scenario 9");
		foundIndexes = indexOfOccuranceInArray (myList, "zo", false);
		System.out.println("indexOfOccuranceInArray  " + foundIndexes[0]);
		System.out.println("Scenario 10");
		foundIndexes = indexOfOccuranceInArray (myList, "zoo", false);
		System.out.println("indexOfOccuranceInArray  " + foundIndexes[0]);
		System.out.println("Scenario 11");
		foundIndexes = indexOfOccuranceInArray (myList, "zoo", true);
		System.out.println("indexOfOccuranceInArray  " + foundIndexes[0]);
		System.out.println("Scenario 12");
		foundIndexes = indexOfOccuranceInArray (myList, "foo", true);
		System.out.println("indexOfOccuranceInArray  " + foundIndexes[0]);
		System.out.println("Scenario 13");
		foundIndexes = indexOfOccuranceInArray (myList, "foo", false);
		System.out.println("indexOfOccuranceInArray  " + foundIndexes[0]);
		System.out.println("Scenario 14");
		foundIndexes = indexOfOccuranceInArray (myList, "delta", true);
		System.out.println("indexOfOccuranceInArray  " + foundIndexes[0]);
		System.out.println("Scenario 15");
		foundIndexes = indexOfOccuranceInArray (myList, "Delta", true);
		System.out.println("indexOfOccuranceInArray  " + foundIndexes[0]);
		
	}
	
	public static boolean arrayHasExactMatch(String [] structure, String search, boolean test) {
		
		String lookFor = search;
		String [] temp = structure;
		boolean check = test;
		boolean result = false;
		
		for(int i = 0; i < temp.length; i++) {
			//if false then capitalization matters, else it does not
			if(check == false) {
				lookFor= lookFor.substring(0,1).toUpperCase() + lookFor.substring(1).toLowerCase();
				if(lookFor.equals(temp[i])) {
					result = true;
				}
			}else {
				if(lookFor.equals(temp[i])) {
					result = true;
				}
			}
		}
		return result;
	}
	
	public static int[] indexOfOccuranceInArray (String [] array, String search, boolean test) {
		
		String lookFor = search;
		String [] temp = array;
		int [] index = {0};
		boolean check = test;
		
		for (int i = 0; i < temp.length; i++)
        {        
			//if false then capitalization should not matter
			if(check == false) {
				lookFor= lookFor.substring(0,1).toUpperCase() + lookFor.substring(1).toLowerCase();
				if(lookFor.equals(temp[i])){
					
					index[0] = i;
					//break;
				}else {
					index[0] = -1;
				}
			}else {
				
				if(lookFor.equals(temp[i]))
				{
					index[0] = i;
					break;
				}else {
					index[0] = -1;
				}
			}
        }
		return index;
	}
}



