package com.at.examples.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Vinay");
		ts.add("Nihal");
		ts.add("Aishwarya");
		//ts.add(null);//does not allow null value
		ts.add("Bhargavi");
		//displays in the natural order
		Iterator i = ts.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
