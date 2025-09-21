package adv;

public class Person {
//Private Fields (Encapsulation)
	private String name;
	private int age;
	
	// Getter For 'Name'
	public String getName() {
		return name;
	}
	
	// Setter For'Name'
	public void SetName(String name) {
		this.name = name;
	}
	
	// Getter For'Age'
	public int getAge() {
		return age;
	}
	// SetterFor'Age' With Validation Logic
	
	public void SetAge(int age) {
		if (age > 0) {	// Ensure Age Is Positive
			this.age =  age;
		}
		else {
			System.out.println("Age Must Be Positive.");
		}

	}

}
