package com.at.examples.arrays;

public class SumAvg {

	public static void main(String[] args) {
		short[] numbers = {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		double avg=0.0;
		
		for(short x:numbers) {
			sum = sum + x;
		}
		System.out.println("Summation value of array elements: "+sum);
		avg = sum/numbers.length;
		System.out.println("Average value of array elements: "+avg);
	}

}
