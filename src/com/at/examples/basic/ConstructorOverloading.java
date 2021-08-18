package com.at.examples.basic;
//Demonstrating constructor overloading
class Box {	
	double width, height, depth;
	Box(){
		System.out.println("Invoked no-arg constructor...");
		width=height=depth=0.0;
	}
	
	Box(double len){
		System.out.println("Invoked single-parameter constructor..");
		width=height=depth=len;
	}
	Box(double width, double height, double depth){
		System.out.println("Invoked parameterized constructor..");
		this.width = width; //this refers to box3
		this.height = height;
		this.depth = depth;
	}	
	void show() {
		//write any business logic here
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		Box box1 = new Box();
		box1.show();
		Box box2 = new Box(8.0);
		Box box3 = new Box(1,2,3);		
	}

}
