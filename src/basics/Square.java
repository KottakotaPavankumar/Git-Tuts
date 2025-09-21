package basics;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		int num, square;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter A Number :");
		num = s.nextInt(); // Read an int
		
		square = num * num;
		
		System.out.println("Square =" + square);
		System.out.printf("Square of %d is %d",num,square);
		
		s.close();

	}

}