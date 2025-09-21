package basics;

import java.util.Scanner;

public class VerticalString {

	public static void main(String[] args) {
		
		//Create a scanner object to read input from the user
		Scanner s = new Scanner(System.in);
		
		//Prompt the user to enter a string
		System.out.print("Enter a string: ");
		String input = s.nextLine();
		
		//Display the string vertically 
		System.out.println("The string displayed vertically is : ");
		for(int i = 0; i < input.length(); i++) {
			System.out.println(input.charAt(i));
		}

		//Close the scanner
		s.close();
	}

}