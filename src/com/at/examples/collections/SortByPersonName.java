package com.at.examples.collections;

import java.util.Comparator;

public class SortByPersonName implements Comparator<Person1> {

	@Override
	public int compare(Person1 o1, Person1 o2) { //0,+,-
		return o1.pname.compareTo(o2.pname);
		//return 0;
	}

}
