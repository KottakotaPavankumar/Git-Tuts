package basics;

import java.util.Arrays;
import java.util.Scanner;

public class SortNames {

	public static void main(String[] args) {
// Create a scanner object to read input from the user
		Scanner s = new Scanner(System.in);
		
		//Prompt the user to enter names sepaterd by semicolons
		System.out.println("Enter names separated by semicolons:");
		String input = s.nextLine();
		
		// Split the input string into an array of names
		String[] names = input.split(";");
		
		//Trim whitespace from each name 
		for (int i = 0; i < names.length; i++) {
			names[i] = names[i].trim();
		}
		
		//Sort the names in alphabetical order 
		Arrays.sort(names);
		
		//Print the sorted names
		System.out.println("Names in sorted order:");
		for(String name : names) {
			System.out.println(name);
		}
		
		//Close the scanner
	}

}