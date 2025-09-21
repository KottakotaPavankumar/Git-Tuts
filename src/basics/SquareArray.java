package basics;

public class SquareArray {

	public static void main(String[] args) {
		// Create an array to hold 10 elements
		int[] squares = new int [10];
		
		//Fill the array with the squares of a numbers from 1 to 10
		for (int i = 0; i<squares.length;i++) {
			squares[i] = (i + 1) * (i+1);
		}
// Print the array elements 
		System.out.println("Array Of Squares:");
		for (int i = 0; i < squares.length;i++) {
			System.out.println("Element" + (i + 1) + ":" + squares[i]);
		}
	}

}
