package com.at.examples.collections;

import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {
		//sorting based on any member of the class is possible by implementing
		// Comparator interface
		TreeSet<Person1> ts = new TreeSet<Person1>(new SortByCharacter());
		ts.add(new Person1(1,"Vinay","Simple"));
		ts.add(new Person1(3, "Nihal", "Silent"));
		ts.add(new Person1(4, "Bhargavi","Dedicated"));
		ts.add(new Person1(2, "Aishwarya","Focused"));
		
		for(Person1 p: ts) {
			System.out.println(p.getPid());
			System.out.println(p.getPname());
			System.out.println(p.getPcharacter());
			System.out.println("--------------");
		}

	}

}
