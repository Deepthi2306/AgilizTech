package com.at.examples.java8features;

public class TestMain {
	
	public static void method1() {
		System.out.println("Inside method1...");
	}
//Static method reference example
	public static void main(String[] args) {
		//TestMain.method1();
		Reference refObj = TestMain::method1;
			refObj.doThing();
			
	}

}
