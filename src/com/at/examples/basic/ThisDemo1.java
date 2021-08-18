package com.at.examples.basic;

public class ThisDemo1 {
	int number;
	
//Constructor chaining	
	public ThisDemo1() {
		System.out.println("This is my no-arg constructor..");
	}
	public ThisDemo1(int number) {
		// super();
		this();
		this.number = number;
		System.out.println("This is my parameterized constructor..");		
	}
	
	public static void main(String[] args) {
		ThisDemo1 thisDemo = new ThisDemo1(100);
		//System.out.println("Value of number is: "+thisDemo.number);
	}

}
