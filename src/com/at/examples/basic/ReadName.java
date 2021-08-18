package com.at.examples.basic;

import java.util.Scanner;

public class ReadName {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String readname = scanner.nextLine();
		System.out.println("Name entered is: " +readname);
	}
}
