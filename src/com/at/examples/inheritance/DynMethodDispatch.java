package com.at.examples.inheritance;
//Demonstrates Dynamic method dispatch - resolving the reference variable type @ runtime
class Super {
	void who() {
		System.out.println("who inside Super class..");
	}
}
class Sub1 extends Super {
	void who() {
		System.out.println("who inside subclass1 ...");
	}
}
class Sub2 extends Super {
	void who() {
		System.out.println("who inside subclass2...");
	}
}
public class DynMethodDispatch {
	public static void main(String[] args) {
		Super superObj = new Super();
		Sub1 sub1Obj = new Sub1();
		Sub2 sub2Obj = new Sub2();
		//superObj.who();
		Super supRef; //reference variable
		supRef = superObj;
		supRef.who();
		
		supRef = sub1Obj;
		supRef.who();
		
		supRef = sub2Obj;
		supRef.who();
	}

}
