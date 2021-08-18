package com.at.examples.inheritance;

class SuperClass{
	SuperClass(){
		System.out.println("Constructor of super class..");
	}
}
public class SubClass extends SuperClass {
	SubClass() {
		//compiler will add call to super class constructor
		//super();
		System.out.println("Constructor of sub class..");
	}
	
	SubClass(int i){
		//compiler will add call to super class constructor
		//super();
		System.out.println("Parameterized constructor in sub class..");
	}
	
	void show() {
		System.out.println("TechnoElevate..");
	}

	public static void main(String[] args) {
		SubClass object1 = new SubClass();
		object1.show();
		
		SubClass object2 = new SubClass(100);
		object2.show();

	}

}
