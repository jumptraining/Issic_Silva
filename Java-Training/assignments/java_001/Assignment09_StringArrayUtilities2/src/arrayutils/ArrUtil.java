package arrayutils;

public class ArrUtil {

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
