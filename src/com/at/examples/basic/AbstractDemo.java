package com.at.examples.basic;
abstract class DemoAbstract {
	//abstract method
	abstract void method1();//abstraction
	//concrete method
	void method2() {
		System.out.println("This is inside method2");
	}
}
class ChildClass extends DemoAbstract{
	@Override
	void method1() {		
		System.out.println("This is inside method1");
	}	
}
public class AbstractDemo {
	public static void main(String[] args) {
		ChildClass childClassObject = new ChildClass();
		childClassObject.method1();
		childClassObject.method2();
	}
	
	
}
