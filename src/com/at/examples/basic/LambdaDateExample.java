package com.at.examples.basic;

interface DateInt {
	int dateDisplay();
}

public class LambdaDateExample {
 public static void main(String[] args) {
	 DateInt d = () -> {	
		 System.out.println("displaying int value...");
			return 100;
		};
d.dateDisplay();
}
}

//displaying int value.. 100
