package Main;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class FileComparer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String getFile1 = "";
		String getFile2 = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the names of your files.");
		System.out.println("File 1:");
	    getFile1 = scan.nextLine();
	    System.out.println("File 2:");
	    getFile2 = scan.nextLine();
		
		
		//String filePath = "C:\Users\Issic\Desktop\matrix1.txt";
		//String filePath2 = "C:\Users\Issic\Desktop\matrix2.txt";
		String containsFileInformation;
		String containsFileInformation2;
		
		containsFileInformation = readFileAsString(getFile1);
	    containsFileInformation2 = readFileAsString(getFile2);
	    String result = "";
	    System.out.println("Output: " + getFile1 + " and " + getFile2 + ":");
	    if(containsFileInformation.length() == containsFileInformation2.length()) {
		    result = "Identical Content";
		    System.out.println("Result: " + result);
		    System.out.println("character length for both: " + containsFileInformation.length());
	    }else {
	    	result = "Different Content";
		    System.out.println("Result: " + result);
		    System.out.println("character length for" + getFile1 + ": " + containsFileInformation.length());
		    System.out.println("character length for" + getFile2 + ": " + containsFileInformation2.length());
	    }
	   
	}
	
	public static String readFileAsString(String fileName) {
	    String text = "";
	    try {
	      text = new String(Files.readAllBytes(Paths.get(fileName)));
	    } catch (IOException e) {
	      e.printStackTrace();
	    }

	    return text;
	  }

}
