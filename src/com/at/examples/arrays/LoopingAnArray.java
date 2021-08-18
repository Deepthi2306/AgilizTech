package com.at.examples.arrays;

public class LoopingAnArray {

	public static void main(String[] args) {
		int[] age = {25,30,35,40,45};
		//loop thru the array
		/*for(int i=0;i<age.length;i++) {
			System.out.println(age[i]);
		}*/
		//Enhanced for-loop/for-each loop
		for(int a: age) {
			System.out.println(a);
		}
	}

}
