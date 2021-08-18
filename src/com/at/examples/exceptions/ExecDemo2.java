package com.at.examples.exceptions;
//Why should we go for Exception handling?
class ExceptionTest {
	//business logic
	static void generateException(){
		int[] number = new int[4];
		System.out.println("Before Exception occured...");
		number[5]=100;
		System.out.println("After Exception occured...");
	}
}
public class ExecDemo2 {

	public static void main(String[] args) {
		try {
		ExceptionTest.generateException();
		} catch(Throwable e) {
			System.out.println("Index out of bounds exception occured...");
			e.printStackTrace();
		}
		System.out.println("Successful..");
		System.out.println("Continue execution...");
		System.out.println("Calling some other method from a different class..");
		//any other business logic
	}

}
