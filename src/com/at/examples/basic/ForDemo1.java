package com.at.examples.basic;

public class ForDemo1 {

	public static void main(String[] args) {
		//for(initialization; condition; increment/decrement)
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();//printing new line
		}
	}

}
