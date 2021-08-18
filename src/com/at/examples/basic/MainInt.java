package com.at.examples.basic;

@FunctionalInterface
interface MyInt {
	// Single abstract method
	void display(int param);
}

//Lambda Expression
//Boilerplate code
public class MainInt {

	public static void main(String[] args) {

		MyInt refInt = (int param) -> {
			System.out.println("Inside display method...");
			// Other business logic
		};
		refInt.display(100);
	}
}
