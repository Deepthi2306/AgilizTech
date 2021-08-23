package com.at.examples.collections;

import java.util.ArrayList;

public class ArrayListExample2 {
	public static void main(String[] args) {
		ArrayList<String> arrayStrings = new ArrayList<String>();
		arrayStrings.add("Welcome");
		arrayStrings.add(" to");
		arrayStrings.add(" TechnoElevate");
		arrayStrings.add(3, " here");
		// System.out.println(arrayStrings.size());
		// System.out.println(arrayStrings);
		//ArrayList can be converted into an Array
		String[] stringarray = new String[arrayStrings.size()];
		for (int i = 0; i < arrayStrings.size(); i++) {
			stringarray[i] = arrayStrings.get(i);
			System.out.print(stringarray[i]);
		}
	}
}
