package basics;

import java.util.Scanner;

public class AverageStringLength {

	public static void main(String[] args) {
		// Create a scanner object to read input from the user
		Scanner s = new Scanner(System.in);

		//Array to store 5 strings
		String[] strings = new String[5];
		int totalLength = 0;
		
		//Loop to accept 5 strings from the user 
		System.out.println("Enter 5 Strings: ");
		for(int i = 0; i < 5; i++) {
			System.out.println("String" + (i + 1)+":" );
			strings[i] = s.nextLine();
			totalLength += strings[i].length(); //Add the length of the string to the total
		}
		//Calculate the average length
		double averageLength = (double) totalLength / 5;
		
		//Display the average length
		System.out.println("The average length of the entered strings is:" + averageLength);
		
		//Close the scanner
		s.close();
	}
	
}