package com.at.examples.exceptions;

public class ExecDemo10 {

	public static void main(String[] args) {
		try {
		int number = 100/0;
		System.out.println("Answer is: "+number);
		} catch(NullPointerException e) {
			System.out.println("Possibility of divide by zero...");
		} finally {
			System.out.println("inside finally..");
		}

	}

}
