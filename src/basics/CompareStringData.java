package basics;

import java.util.Scanner;

public class CompareStringData {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		System.out.println("Enter The First String : ");
		String str1 = S.nextLine();
		
		System.out.print("Enter The Second String : ");
		String str2 =  S.nextLine();
				if(str1.equals(str2)) {
			System.out.println("The 2 Strings contain the same data.");
		}
				else {
			System.out.println("The 2 strings do not contain the same data.");
		}
		
		S.close();
	}
}