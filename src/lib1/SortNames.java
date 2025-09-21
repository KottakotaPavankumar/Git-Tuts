package lib1;

import java.util.Arrays;

public class SortNames {

	public static void main(String[] args) {
		String input = "Java;c;javascript;python;typescript";
		String names [] = input.split(";");
		Arrays.sort(names);
		
		for(String name : names)
			System.out.println(name);
	}

}
