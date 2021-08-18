package com.at.examples.arrays;

import java.util.Arrays;

public class CopyArraySimple3 {

	public static void main(String[] args) {
		int[] n1 = {1,2,3,4,5,6};
		int[] n2 = new int[6];
		int[] n3 = new int[n1.length];
		
		System.arraycopy(n1, 0, n2, 0, n1.length);
		System.out.println("Copied array: "+Arrays.toString(n2));
		//refer arraycopy API for arguments
		System.arraycopy(n1, 2, n3, 2, 4);
		System.out.println("Copied array: "+Arrays.toString(n3)); //0,0,3,4,5,6
		
		//Try copyOfRange

	}

}
