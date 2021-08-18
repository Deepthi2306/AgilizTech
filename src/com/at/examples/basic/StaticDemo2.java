package com.at.examples.basic;

class StaticTest {
	// non-static data member/instance variable
	int min = 0;
	// static data member/instance variable
	static int max = 10;
	// non-static method
	int add(int a, int b) {
		return a + b;
	}
	// static method
	static int subtract(int a, int b) {
		return a - b;
	}
}

public class StaticDemo2 {
	public static void main(String[] args) {
		StaticTest object = new StaticTest();
		System.out.println("adding..." + object.add(10, 20));
		System.out.println("subtracting..." + StaticTest.subtract(10, 20));
		System.out.println("Min.." + object.min);
		System.out.println("Max.." + StaticTest.max);
	}
}
