package com.at.examples.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample3 {

	public static void main(String[] args) {
		ArrayList<Integer> array_list = new ArrayList<Integer>();
		array_list.add(25);
		array_list.add(5);
		array_list.add(30);
		array_list.add(9);

		System.out.println("-----------Use for loop-----------");
		for (int i = 0; i < array_list.size(); i++) {
			System.out.println(array_list.get(i) + " ");
		}

		System.out.println("--------Use for-each loop--------------");
		for (Integer i : array_list) {
			System.out.println(i);
		}

		System.out.println("--------Use Iterator------------");
		Iterator<Integer> iterator = array_list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("--------Use List Iterator------------");
		ListIterator<Integer> listiterator1 = array_list.listIterator();
		while (listiterator1.hasNext()) {
			System.out.println(listiterator1.next());
		}
		
		System.out.println("------Use List Iterator(backwards)---------");
		ListIterator<Integer> listiterator2 = array_list.listIterator(array_list.size());
		while (listiterator2.hasPrevious()) {
			System.out.println(listiterator2.previous());
		}
	}
}
