package oop2;

public class SumOfNumbers {

	public static void main(String[] args) {
		String nums[] = { "A123", "343", "11", "D89", "30" };
		int total = 0, Count = 0;

		for (String n : nums) {
			try {
				total += Integer.parseInt(n);
			} catch (Exception ex) {
				System.out.println("Invalid Number : " + n);
			}
		}
		System.out.println(total);
		// System.out.println(Count);
	}

}
