package com.at.examples.basic;

public class BoxingExample {
//converting primitive to wrapper class
	public static void main(String[] args) {
		int number = 50;//primitive
		Integer number_Integer = new Integer(number); //Wrapper Class
		
		System.out.println(number +"    "+number_Integer);
	}

}
