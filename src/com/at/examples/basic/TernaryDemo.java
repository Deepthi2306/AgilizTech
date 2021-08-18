package com.at.examples.basic;

public class TernaryDemo {
public static void main(String[] args) {
	int number1 = 5;
	int number2 = 4;
	//usage of ternary operator instead of if-else construct
	int min=(number1<number2)?number1:number2;
	System.out.println(min);
	/*if(number1<number2) {
		min=number1;
	} else {
		min=number2;
	}*/
}
}
