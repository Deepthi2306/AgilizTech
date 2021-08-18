package com.at.examples.arrays;

public class TwoDArray {
//displaying a 2-Dimensional array in the form of a matrix
	public static void main(String[] args) {
		int[][] table = new int[3][4];
		for(int i =0;i<3;i++) {
			for(int j=0;j<4;j++) {
				//to print elements in the same line use print instead of println
				System.out.print(table[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
