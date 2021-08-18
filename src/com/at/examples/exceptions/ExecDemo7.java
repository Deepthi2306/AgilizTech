package com.at.examples.exceptions;

import java.util.Scanner;

public class ExecDemo7 {
	// check age limit for casting the vote
	public static void validateAge(int age) {
		if (age < 18) {
			// creating a exception
			try {
				throw new Exception();
			} catch (Exception e) {
				System.out.println("Not eligible for casting vote..");
			}
		} else {
			System.out.println("Eligible for casting the vote..");
		}
	}

	public static void main(String[] args) {
		Scanner scannerObj = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = scannerObj.nextInt();
		validateAge(age);
		System.out.println("Other business logic..");
	}

}
