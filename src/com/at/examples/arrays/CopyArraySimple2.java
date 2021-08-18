package com.at.examples.arrays;

import java.util.Arrays;

public class CopyArraySimple2 {

	public static void main(String[] args) {
		int[] numbers = {6,1,2,3,4};
		int[] copiedNumbers = new int[5];
		numbers[0]=0;
		for(int i = 0;i<numbers.length;i++) {
			copiedNumbers[i] = numbers[i];
		}
		//changing array object to string
		System.out.println(Arrays.toString(copiedNumbers));
	}

}
