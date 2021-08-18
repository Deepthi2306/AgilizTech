package com.at.examples.inheritance;

class Main{
	int number;	
	Main(int i){
		number = i;
	}
}
class SubMain extends Main{
	int number;
	SubMain(int i){
		super(i);
		number = i;
	}
}
public class IncompatibleRefDemo {
	public static void main(String[] args) {
		Main m1 = new Main(100);
		Main m2; //reference variable
		Main s1 = new SubMain(50);
		m2 = m1;
		m2 = s1;
		//s1 = m2;//incompatible references
	}

}
