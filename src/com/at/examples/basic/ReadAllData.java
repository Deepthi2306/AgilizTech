package com.at.examples.basic;

import java.awt.DisplayMode;
import java.util.Scanner;

public class ReadAllData {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("-----Student Details -----");
		System.out.println("Enter your ID: ");
		// Scanner.nextInt does not read the newline
		// character in the input when "Enter" button is pressed
		String student_id_String = scanner.nextLine();
		int student_id_int = Integer.parseInt(student_id_String);
		System.out.println("Student ID: " + student_id_int);
		System.out.println("Enter your name: ");
		String student_name = scanner.nextLine();
		System.out.println("Student Name: " + student_name);
		System.out.println("Enter your CGPA: ");
		double student_cgpa = scanner.nextDouble();
		System.out.println("Student CGPA: " + student_cgpa);
		scanner.close();

	}

}
