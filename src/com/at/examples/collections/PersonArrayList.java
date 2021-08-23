package com.at.examples.collections;

import java.util.ArrayList;
import java.util.Collections;

public class PersonArrayList {

	public static void main(String[] args) {
		//Use JavaBean/Data class
		Person p1 = new Person(1,"Vinay");
		Person p2 = new Person(4,"Aishwarya");
		Person p3 = new Person(3,"Bhargavi");
		Person p4 = new Person(2,"Nihal");
		ArrayList<Person> parraylist = new ArrayList<Person>();
		parraylist.add(p1);
		parraylist.add(p2);
		parraylist.add(p3);
		parraylist.add(p4);
		//System.out.println(parraylist);
		//For sorting class/object type of data, the data class must implement Comparable interface
		Collections.sort(parraylist);
		for(Person p: parraylist) {
			System.out.print(p.getPid());
			System.out.println(p.getPname());
		}
		//Collections.sort(parraylist);
	}
}
