package oop;

public class Circle {
	// Instance variable
	private double radius;
	
	//Constructor
	public Circle(double r) {
		radius = r;
	}
	
	public double getArea() {
		return Math.PI*radius *radius;
		
	}

}
