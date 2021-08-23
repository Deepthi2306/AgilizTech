package com.at.examples.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("One", 1);
		hm.put("Two", 2);
		hm.put("Three", 3);
		//System.out.println(hm);
		
		Set<Map.Entry<String, Integer>> m1 = hm.entrySet();
		for(Entry<String, Integer> e: m1) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		System.out.println("---------------------------------");
		Set<String> allKeys = hm.keySet();
		for(String s: allKeys) {
			System.out.println(s);
		}
		System.out.println("---------------------------------");
		Collection<Integer> allValues = hm.values();
		for(Integer i: allValues) {
			System.out.println(i);
		}
		System.out.println("---------------------------------");
		if(hm.containsKey("two")) {
			System.out.println("Contains the Two key");
		}
			else {
			System.out.println("Does not contain the key");
		}

	}

}
