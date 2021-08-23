package com.at.examples.collections;

import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		LinkedList<String> planguages = new LinkedList<String>();
		planguages.add("C");
		planguages.add("C++");
		planguages.add("Java");
		planguages.add("Python");
		//System.out.println(planguages);
		//planguages.set(2, "PHP"); //replaces an element
		//C, C++, Java, Python, HTML
		planguages.set(3, "HTML");
		String got_element = planguages.get(0);
		System.out.println(got_element);
		/*for(String i:planguages) {			
			System.out.println(i);
		}*/

	}

}
