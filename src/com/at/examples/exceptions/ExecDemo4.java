package com.at.examples.exceptions;

public class ExecDemo4 {
//Nested -try
	public static void main(String[] args) {
		int[] numer = { 4, 8, 16, 32, 64, 128, 512 };
		int[] denom = { 2, 0, 4, 4, 0 };
		try { //outer try
			for (int i = 0; i < numer.length; i++) {
				try { //inner try
					System.out.println(numer[i] / denom[i]);
				} catch (ArithmeticException ae) {					
					System.out.println("Cant divide by zero..");
				}
			} //end of for loop
		} catch (ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("No matching denominator found...");
		}
	} // end of main
} // end of class
