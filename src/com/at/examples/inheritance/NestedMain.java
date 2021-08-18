package com.at.examples.inheritance;

class Outer {
	//Inner non-static class
	//Inner class is always inside the scope of the outer class - hiding the visibility
	class Inner {
		public void display() {
			System.out.println("Inside the nested class...");
		}
	}	
}
public class NestedMain {
	public static void main(String[] args) {
		Outer outer = new Outer();
		//Inner inner = new Inner();
		//Outer.Inner inner = new Outer().new Inner();
		Outer.Inner inner = outer.new Inner();
		inner.display();
	}
}
