package oop2;

public class AverageOfNumbers {

	public static void main(String[] args) {
		String nums[] = { "123", "A343", "11", "D89", "30" };
		int total = 0, count = 0;

		for (String n : nums) {
			try {
				total += Integer.parseInt(n);
				count++;
			} catch (Exception ex) {
				System.out.println("Invalid Number : " + n);
			}
		}

		if (count > 0) {
			double average = (double) total / count;
			System.out.println("Average : " + average);
		} else {
			System.out.println("No Valid Numbers To Calculate the Average ");
		}

	}

}
