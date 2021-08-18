package com.at.examples.basic;

public class ShortCircuitOperators {

	public static void main(String[] args) {
		// if(false && true && true) {
		if (true || false || false) {
			System.out.println("This will be printed");
		} else {
			System.out.println("This will never be printed");
		}

	}

}
