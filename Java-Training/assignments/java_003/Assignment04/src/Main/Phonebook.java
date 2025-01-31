package Main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Phonebook {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String getName="";
		String getNumber="";
		String getCity="";
		String getConfirmation;
		int count = 1;
		Scanner scan = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Issic\\Desktop\\phonebook.txt"));
		String[][] array = new String[7][7];
		
		array[0][0] = "Name       ";
		array[0][1] = "Phone           ";
		array[0][2] = "City     ";
			
		do {
			System.out.println("This is a phonebook application.");
			System.out.println("Please enter the required information for five contacts.");
				getConfirmation = "";
			do {
				boolean nameLoop= false;
				boolean numberLoop= false;
				boolean cityLoop= false;
				do {
					try {
					System.out.println("Name?");
					getName = scan.nextLine();
					inputException(getName);
					
					}catch(InputException e){
						System.out.println("You have to enter a name.");
					}
					if(!getName.isEmpty()) {
						nameLoop = true;
					}
				}while(nameLoop == false);
				
				do {
					try {
						System.out.println("Phone Number?");
						getNumber = scan.nextLine();
						inputException(getNumber);
						
						}catch(InputException e){
							System.out.println("You have to enter a phone number.");
						}
						if(!getNumber.isEmpty()) {
							numberLoop = true;
						}
				}while(numberLoop == false);
			    
				do {
					try {
						System.out.println("City?");
						getCity = scan.nextLine();
						inputException(getCity);
						
						}catch(InputException e){
							System.out.println("You have to enter a City.");
							//loop = true;
					    	//continue;
						}
						if(!getCity.isEmpty()) {
							cityLoop = true;
						}
				}while(cityLoop == false);
				
			    System.out.println("You have entered, Name: " + getName + " Phone Number: " + getNumber + " City: " + getCity);
			    System.out.println("Confirm entry.(Y for yes)");
			    getConfirmation = scan.nextLine();
			    
			}while(!getConfirmation.equalsIgnoreCase("y"));
			
			getName = String.format("%-10s", getName);
			getNumber = String.format("%-15s", getNumber);
			getCity = String.format("%-10s", getCity);
			array[count][0] = getName;
		    array[count][1] = getNumber;
		    array[count][2] = getCity;
		  
			//array = enterInformation(getName, getNumber, getCity, count);
			count++;
		}while(count <= 5);
		
		for(int i = 0; i < 6; i++){
	        for(int j = 0; j < 3; j++){
	        	if(j == 2) {
	        		System.out.print(array[i][j] + "\r\n");
		            writer.write(array[i][j] + "\r\n");
	        	}else {
	        		System.out.print(array[i][j]);
		            writer.write(array[i][j]);
	        	}
//	            System.out.print(array[i][j] + "\r\n");
//	            writer.write(array[i][j] + "\r\n");
	        }
	       
	    }
		
		writer.close();
		scan.close();
	}
	
	static void inputException(String string) throws InputException{
		if(string.isEmpty()) {
			throw new InputException();
			}
	}
	
	//was trying to do it in a function for more practice for functions but could not figure it out
//public static String[][] enterInformation(String name, String number, String city, int count) {
//		
//		final int columns = 6;
//	    final int rows = 6;
//		
//	    String[][] phoneBook = new String[columns][rows];
//	    phoneBook[0][0] = "Name ";
//	    phoneBook[0][1] = "Phone ";
//	    phoneBook[0][2] = "City ";
//	  
////	    phoneBook[1][0] = "";
////	    phoneBook[1][1] = "";
////	    phoneBook[1][2] = "";
////	    
////	    
////	    phoneBook[2][0] = "";
////	    phoneBook[2][1] = "";
////	    phoneBook[2][2] = "";
////	   
////	    
////	    phoneBook[3][0] = "";
////	    phoneBook[3][1] = "";
////	    phoneBook[3][2] = "";
////	   
////	    
////	    phoneBook[4][0] = "";
////	    phoneBook[4][1] = "";
////	    phoneBook[4][2] = "";
////	   
////	    
////	    phoneBook[5][0] = "";
////	    phoneBook[5][1] = "";
////	    phoneBook[5][2] = "";
//	   	    
//	   System.out.println(count);
//	    
//	    
//	    for(int i = count; i < count + 1; i++){
//	        for(int j = 0; j < columns; j++){
//	            phoneBook[i][j++] = name;
//	            phoneBook[i][j++] = number;
//	            phoneBook[i][j] = city;
//	            //System.out.println(phoneBook[i][j]);
//	           //System.out.println(i);
//	           //System.out.println(j);
//	        }
//	        //System.out.println();
//	    }
//	    
//	    return phoneBook;
//	}

}
