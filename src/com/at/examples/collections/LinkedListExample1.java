package com.at.examples.collections;

import java.util.LinkedList;

public class LinkedListExample1 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		System.out.println(list);
		list.addFirst(1);
		System.out.println("adding an element at the start" +list);
		list.addLast(100);
		System.out.println("adding an element at the end" +list);
		System.out.println("Checking if 50 is present: " +list.contains(10));
		LinkedList<Integer> sublist = new LinkedList<Integer>();
		sublist.add(21);
		sublist.add(25);
		System.out.println("Another list: " +sublist);		
		System.out.println("Checking for sublist presence: "+list.containsAll(sublist));
		list.add(7, 1000);
		System.out.println("Re-printing the list: " +list);
		Integer removedelement = list.remove();
		System.out.println(removedelement);
		System.out.println("Re-printing the list: " +list);
		list.remove(6);
		System.out.println("Re-printing the list after removal: " +list);
		//try other methods
	}

}
