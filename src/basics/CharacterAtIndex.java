package basics;

import java.util.Scanner;

public class CharacterAtIndex	{

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);

		System.out.println("Enter A String : ");
		String inputString = S.nextLine();

		System.out.println("Enter An Index : ");
		int index = S.nextInt();
		
		try {
		char Character = inputString.charAt(index);
			System.out.println("Character At Index" + index + ":" + Character);
		} catch(StringIndexOutOfBoundsException  e) {
			System.out.println("Index Out Of Range.Please Enter An Index Between 0 & inputString.length()-1");
		}
		S.close();
	}
}