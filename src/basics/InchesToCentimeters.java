package basics;

import java.util.Scanner;

public class InchesToCentimeters {

	public static void main(String[] args) {
		// Create a scanner object to read input from the user
		Scanner s = new Scanner(System.in);

		//Prompt the user to enter a value in inches 
		System.out.println("Enter A Value In Inches:");
		double inches = s.nextDouble();
		
		//Convert inches to centimeters ( 1 inch = 2.54 centimeters )
		double centimeters = inches*2.54;
		
		// Display the result
		System.out.println(inches + "Inches is equal to "+ centimeters +"Centimeters.");
		
		//Close the scanner
		s.close();
	}

}
