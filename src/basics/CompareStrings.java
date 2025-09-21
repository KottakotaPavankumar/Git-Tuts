package basics;

import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	System.out.println("Enter The First String : ");
	String str1 = S.nextLine();
	
	System.out.println("Enter The Second String : ");
	String str2 = S.nextLine();
	
	int result = str1.compareToIgnoreCase(str2);
	
	if(result < 0) {
		System.out.println("\""+str1 + "\" Is Lexicographically less than \"" + str2 + "\"." );
	}else if (result > 0) {
		System.out.println("\"" + str1 + "\" Is Lexicographically greater than  \"" + "\".");
	}else {
		System.out.println("\"" + str1 + "\" Is Lexicographically equal to \"" + str2 + "\".");
	}

	S.close();
	}

}
