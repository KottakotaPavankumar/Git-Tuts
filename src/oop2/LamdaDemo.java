package oop2;

public class LamdaDemo {

	public static void main(String[] args) {

		Runnable r = () -> System.out.println("Run method!");
		System.out.println(r.getClass());
	}

}