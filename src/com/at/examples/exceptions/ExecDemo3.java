package com.at.examples.exceptions;
//one try can have multiple catch blocks
public class ExecDemo3 {

	public static void main(String[] args) {
		int[] numer = { 4, 8, 16, 32, 64 };
		int[] denom = { 2, 0, 4, 4, 0 };

		for (int i = 0; i < numer.length; i++) {
			try {
				System.out.println(numer[i] / denom[i]);
			} catch (ArithmeticException e) {
				System.out.println("Cant divide by zero..");
			} catch(Exception e) {
				System.out.println("Catching any general exception...");
			}
		}
	}

}
//2
//Cant divide by zero..
//4
//8
//Cant divide by zero..
//No matching denominator found..
//No matching denominator found..
//No matching denominator found..