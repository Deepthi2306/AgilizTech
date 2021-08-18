package com.at.examples.exceptions;

//Demonstrating error propogation
class ExceptionProp {
	void method1() {
		int number = 100 / 0;
	}
	void method2() {
		method1();
	}
	void method3() {
		try {
			method2();
		} catch (Exception e) {
			System.out.println("Exception handled here..");
		}
	}
}

public class ExecDemo5 {
	public static void main(String[] args) {
		ExceptionProp obj = new ExceptionProp();
		obj.method3();
		System.out.println("Some other business logic goes on..");
	}
}
