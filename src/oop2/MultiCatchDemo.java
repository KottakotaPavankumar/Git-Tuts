package oop2;

class MultiCatchDemo {
	public static void main(String args[]) {
		String num = "123";
		try {
			int v = Integer.parseInt(num);
			int result = 100 / v;
			System.out.println(result);
		} catch (NumberFormatException ex) {
			// Take action
		} catch (ArithmeticException ex) {
			// Take action
		}

		try {
			int v = Integer.parseInt(num);
			int result = 100 / v;
			System.out.println(result);
		}
		// multi-catch
		catch (NumberFormatException | ArithmeticException ex) {
			// Take action
		}
	}
}