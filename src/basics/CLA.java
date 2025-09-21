package basics;

//Program to display command-line parameters  
public class CLA {

	public static void main(String[] args) {
		System.out.printf("Args Count: %d\n", args.length);
		// Display parameters
	for (String s : args)
			System.out.println(s);
	}// End of main

}


