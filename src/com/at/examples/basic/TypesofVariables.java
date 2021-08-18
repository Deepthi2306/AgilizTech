package com.at.examples.basic;

class Demo {
	int variable1 = 10; //instance variable
	public double display(int i, int j) { //formal parameters
		double salary = 10000.0*i+j; //local variable		
		return salary;
	}
}

public class TypesofVariables {

	public static void main(String[] args) {
		Demo demo = new Demo(); //reference variable
		System.out.println("Salary is: "+demo.display(10, 20)); //actual arguments
	}
}
