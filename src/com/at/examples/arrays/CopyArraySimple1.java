package com.at.examples.arrays;

public class CopyArraySimple1 {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6};
		int[] copiednumbers = numbers;		
		numbers[0] = 100;		
		for(int number: copiednumbers) {
			System.out.println(number+ " ");
		}

	}

}
