package com.at.examples.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(100);
		hs.add(100);//ignored
		hs.add(200);
		hs.add(300);
		hs.add(null);//only one null value allowed
		hs.add(true);
		hs.add("AgilizTech");
		hs.add("TechnoElevate");
				
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
