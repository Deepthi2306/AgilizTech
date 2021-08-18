package com.at.examples.exceptions;

import java.util.Scanner;
//demonstrating usage of throws keyword
class ThrowsExample {
	int divide(int num, int den) throws ArithmeticException {
		int quotient = num / den;
		System.out.println("Quotient is: " + quotient);
		return quotient;
	}
}

public class ExecDemo8 {

	public static void main(String[] args) throws Exception{
		ThrowsExample obj = new ThrowsExample();
		int variable1, variable2;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numerator: ");
		variable1 = s.nextInt();
		System.out.println("Enter the denominator: ");
		variable2 = s.nextInt();
		// try {
		obj.divide(variable1, variable2);
		// } catch(Exception e) {
		// System.out.println("Division by zero not possible..");
		// }

	}

}
