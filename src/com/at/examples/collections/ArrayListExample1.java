package com.at.examples.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(4,40);
		arrayList.add(5,50);
		System.out.println(arrayList);
		
		List<Integer> extracted_subList = arrayList.subList(1, 3); //upperbound is excluded
		System.out.println(extracted_subList);
		arrayList.remove(4);	
		System.out.println(arrayList);	
		//Try other methods inside ArrayList class
	}

}
