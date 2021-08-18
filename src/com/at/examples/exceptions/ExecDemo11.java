package com.at.examples.exceptions;

public class ExecDemo11 {
	
	public static int myMethod() {
		try {
			return 100;
		} finally {
			System.out.println("Logged out successfully!");
			System.out.println("Server shutdown!");
			//creating an exception/error
		}
	}

	public static void main(String[] args) {
		ExecDemo11.myMethod();
		System.out.println("Continuation..");
	}
}
