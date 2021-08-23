package com.at.examples.java8features;

import java.util.Date;

interface SampleInterface {
	int process();// SAM

	static Date currentDate() {
		return new Date();
	}
	
	default String formatDate(Date date) {
		return date.toString();
	}
	
	default int calculate(int a, int b){
		return a+b;
	}
}

public class LambdaExample {

	public static void main(String[] args) {
		SampleInterface ref = () -> {
			return 100;			
		};
		System.out.println(ref.process());
		
		System.out.println(ref.formatDate(new Date()));
		System.out.println(ref.calculate(10, 20));
		System.out.println(SampleInterface.currentDate());
	}

}
