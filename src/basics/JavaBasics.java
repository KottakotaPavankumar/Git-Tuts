package basics;

import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        
        // 1. Data Types and Variables
        int integerVar   = 10;                   // Integer Data Type
        double doubleVar = 20.5;        	    // Double Data Type
        char charVar     = 'A';                // Character Data Type
        boolean boolVar  = true;          	  // Boolean Data Type
        String stringVar = "Hello Java";     // String Data Type

        // Displaying Values
        System.out.println("Integer Value   : " + integerVar);
        System.out.println("Double Value    : " + doubleVar);
        System.out.println("Character Value : " + charVar);
        System.out.println("Boolean Value   : " + boolVar);
        System.out.println("String Value    : " + stringVar);
        
        // 2. Operators
        int a = 15, b = 5;

        // Arithmetic operators
        System.out.println("Addition	   : " + (a + b));
        System.out.println("Subtraction    : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division       : " + (a / b));
        System.out.println("Modulus        : " + (a % b));

        // Relational operators
        System.out.println("a Is Greater Than b : " + (a > b));
        System.out.println("a Is Equal To b	    : " + (a == b));

        // Logical operators
        System.out.println("Both conditions are true : " + (a > 10 && b < 10));
        
        // 3. Arrays
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.print("Array elements : ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 4. Control Structures
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to check if it's even or odd : ");
        int userNumber = s.nextInt();

        // If-Else Statement
        if (userNumber % 2 == 0) {
            System.out.println(userNumber + " Is even. ");
        } else {
            System.out.println(userNumber + " Is odd. ");
        }

        // Switch Statement
        System.out.print("Enter a grade (A, B, C, D, or F) : ");
        char grade = s.next().charAt(0);
        switch (grade) {
            case'A':
                System.out.println("Excellent! ");
                break;
            case 'B':
                System.out.println("Good job! ");
                break;
            case 'C':
                System.out.println("Fair. ");
                break;
            case 'D':
                System.out.println("Needs improvement. ");
                break;
            case 'F':
                System.out.println("Failed.");
                break;
            default:
                System.out.println("Invalid grade. ");
        }

        // For loop
        System.out.println("For loop example : ");
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        // While loop
        System.out.println("While loop example : ");
        int count = 0;
        while (count < 3) {
            System.out.println("Count = " + count);
            count++;
        }

        // Do-while Loop
        System.out.println("Do-while Loop example : ");
        int doCount = 0;
        do {
            System.out.println("DoCount = " + doCount);
            doCount++;
        } while (doCount < 3);

        // Closing the scanner
        s.close();
    	}
}
