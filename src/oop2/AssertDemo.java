package oop2;

public class AssertDemo {

	public static boolean isEven(int n) {
		return n % 2 == 0;
	}

	public static void main(String[] args) {
		assert isEven(10) == true : "IsEven() returned false for 10";
		assert isEven(11) == true : "IsEven() returned true for 11";
	}

}
