package lib1;

import java.util.Scanner;

public class concatenateStrings {

	public static void main(String[] args) {
		 
		 StringBuffer names = new StringBuffer("");
		 
		 Scanner S = new Scanner(System.in);
		 
		 while(true)
		 {
			 System.out.print("Enter Name [End to Stop]:");
			 String Name = S.nextLine();
			 if(Name.equals("End"))
				  break;
			 
			 names.append(Name + " ");
		 }
		 
         System.out.println(names);		 
	}

}