package com.at.examples.basic;

class Example {
	void display1() {
		System.out.println("Hello from display1()..");
	}

	void display2() {
		this.display1();
		System.out.println("Hello from display2()...");
	}
}

public class ThisDemo2 {
	public static void main(String[] args) {
		Example example = new Example();
		example.display2();
	}

}
