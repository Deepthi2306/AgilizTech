package com.at.examples.strings;

import java.util.Scanner;

public class StringSwitch {
static final String USA = "USA";
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the country name: ");
		String country = scanner.nextLine();
		System.out.println("Entered value is: " + country);
		switch (country) {
		case USA:System.out.println("American");
			break;
		case "UK":System.out.println("Britisher");
			break;
		case "India":System.out.println("Indian");
			break;
		case "Japan":System.out.println("Japanese");
			break;
		default:System.out.println("Invalid country");
			break;
		}

	}

}
