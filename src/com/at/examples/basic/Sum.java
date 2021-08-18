package com.at.examples.basic;

//Demonstrating method overloading
public class Sum {	
	public int sum(int num1, int num2) {
		return (num1+num2);
	}
	public int sum(int num1, int num2, int num3) {
		return (num1+num2+num3);
	}
	public double sum(double num1, double num2) {
		return (num1+num2);
	}

	public static void main(String[] args) {
		Sum s = new Sum();//invocation to the constructor
		System.out.println(s.sum(10,20));
		System.out.println(s.sum(10, 20, 30));
		System.out.println(s.sum(10.5, 20.5));
	}

}
