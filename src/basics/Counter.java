package basics;

// Define the counter class 
public class Counter {
	private int count; //Variable to store the counter value
	
	//Constructor to initialize the counter
	public Counter(int startValue) {
		count = startValue;
	}

	//Method to increment the counter
	public void increment() {
		count++;
	}
	
	// Method to decrement the counter
	public void decrement() {
		count--;
	}
	
	//Method to get the current  value of the counter
	public int getValue() {
		return count;
	}
	
	//Main method to test the counter class
	public static void main(String[] args) {
		
		// Create a counter object with a starting value of 10
		Counter c = new Counter(10);
		
		// Display the initial value
		System.out.println("Initial counter value:" + c.getValue());
		
		//Increment the counter
		c.increment();
		System.out.println("After Increment: " +c.getValue());
		
		//Decrement the counter
		c.decrement();
		System.out.println("After Decrement: "+c.getValue());
	}

}
