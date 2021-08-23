package com.at.examples.collections;

import java.util.Comparator;

public class SortByCharacter implements Comparator<Person1> {

	@Override
	public int compare(Person1 o1, Person1 o2) {
		// TODO Auto-generated method stub
		//return 0;
		return o2.pcharacter.compareTo(o1.pcharacter);
	}

}
