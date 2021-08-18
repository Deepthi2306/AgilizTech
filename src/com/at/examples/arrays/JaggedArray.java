package com.at.examples.arrays;

import java.util.Arrays;

public class JaggedArray {

	public static void main(String[] args) {
		int[][] arr=new int[3][];
		//jagged array
		arr[0]=new int[] {1,2,3};//first row
		arr[1]=new int[] {4,5,6,7}; //second row
		arr[2]=new int[] {8,9}; //third row
		//Using for-each
		for(int[] x:arr) {
			System.out.println(Arrays.toString(x));
		}

	}

}
