package com.at.examples.basic;

public class ConstructorExample {
	String demo;

	// int i;
	ConstructorExample(String str) {
		// i=5;
		demo = str;
		System.out.println("Constructor is called...");
	}

	public static void main(String[] args) {
		ConstructorExample c = new ConstructorExample("Java");
		System.out.println("Value of variable i is:" + c.demo);
	}
}
