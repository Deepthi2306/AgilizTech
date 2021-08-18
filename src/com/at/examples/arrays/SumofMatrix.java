package com.at.examples.arrays;

public class SumofMatrix {

	public static void main(String[] args) {
		int[][] matrix1 = {{10,20,30},{40,50,60}};
		int[][] matrix2 = {{1,2,3},{4,5,6}};
		int[][] sum = new int[2][3];
		int rows,cols;
		//matrix1.length -> 2
		//matrix2.length -> 2
		//matrix1[0].length -> 3
		//matrix2[0].length -> 3
		for(rows=0;rows<matrix1.length;rows++) {
			for(cols=0;cols<matrix1[0].length;cols++) {
				sum[rows][cols] = matrix1[rows][cols] +  matrix2[rows][cols];
			}
		}
		System.out.println("Sum of two matrices is:");
		for(rows=0;rows<matrix1.length;rows++) {
			for(cols=0;cols<matrix1[0].length;cols++) {
				System.out.print("   "+ sum[rows][cols]);
			}
			System.out.println();
		}
	}

}
