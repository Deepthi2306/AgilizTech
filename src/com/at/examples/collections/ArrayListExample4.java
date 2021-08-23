package com.at.examples.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample4 {

	public static void main(String[] args) {
		ArrayList<String> array_strings = new ArrayList<String>();
		array_strings.add("Orange");
		array_strings.add("Apple");
		array_strings.add("Grapes");
		array_strings.add("Banana");
		array_strings.add("Mango");
		System.out.println(array_strings);
		
		//array_strings.sort(null);
		Collections.sort(array_strings);
		for(String element: array_strings) {
			System.out.println(element);
		}

	}

}
