package com.at.examples.inheritance;

//usage of 'super' keyword for accessing the data member of the parent class
class First {
	int i;
	//over-ridden method
	void display() {
		System.out.println("Display inside parent..");
	}
}

class Second extends First {
	int i;

	Second(int a, int b) {
		super.i = a;// i from First
		i = b; // i from Second
	}
	//over-riding method
	void display() {
		super.display();
		//System.out.println("Display inside child..");
	}

	/*
	 * void show() { System.out.println("i value in superclass: " + super.i);
	 * System.out.println("i value in subclass: " + i); }
	 */
}

public class SuperUsage1 {

	public static void main(String[] args) {
		Second secondObject = new Second(10, 20);
		//secondObject.show();
		secondObject.display();
	}

}
