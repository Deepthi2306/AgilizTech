package com.at.examples.arrays;

public class SimpleArrayDemo {

	public static void main(String[] args) {
		// declaring an array of int type
		int[] age = new int[5];
		// initializing the array elements
		//Alternative way to declare and initialize the array
		int[] age1 = {25,30,35,40,45};
		age[0] = 25;
		age[1] = 30;
		age[2] = 35;
		// Reading/accessing the array elements
		System.out.println(age[0]);
		System.out.println(age[1]);
		System.out.println(age[2]);
		System.out.println(age[3]);
		System.out.println(age[4]);
		// System.out.println(age[5]); //ArrayIndexOutofBoundsException

	}

}
