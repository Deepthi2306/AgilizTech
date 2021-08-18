package com.at.examples.basic;

import java.io.IOException;
import java.util.Scanner;

public class ReadSingleCharacter {
	static char ch;
	//char answer='u';
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type a character: ");
		//One-way
		//ch = scanner.next().charAt(0);
		//Second way
		try {
			ch = (char) System.in.read();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		System.out.println("You entered: "+ch);
	}

}
