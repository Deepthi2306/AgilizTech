package com.at.examples.java8features;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>();

		for (int i = 1; i <= 10; i++) {
			values.add(i);
		}
		for (int i = 0; i < values.size(); i++) {
			//System.out.println(values.get(i));
		}
		
		for(Integer i:values) {
			//System.out.println(i);
		}
		
		//values.forEach(i->System.out.println(i));
		
		//values.forEach(System.out::println);
		
		values.stream().forEach(System.out::println);
		
		//values.parallelStream().forEach(System.out::println);

	}
}
