package com.at.examples.basic;
@FunctionalInterface
interface DateInt {
	int dateDisplay();//SAM
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
