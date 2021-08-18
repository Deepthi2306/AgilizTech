package com.at.examples.arrays;

public class MinMax {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		int min, max;
		numbers[0] = 99;
		numbers[1] = 9;
		numbers[2] = 18;
		numbers[3] = -9;
		numbers[4] = 999;

		min = max = numbers[0];

		for (int i = 0; i <= 4; i++) {
			if (numbers[i] < min)
				min = numbers[i];
			if (numbers[i] > max)
				max = numbers[i];
		}
		System.out.println("Min and Max values are: " + min + " " + max);

	}

}
