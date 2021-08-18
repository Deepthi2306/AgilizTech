package com.at.examples.arrays;

public class LengthDemo {

	public static void main(String[] args) {
		int[] list=new int[10];
		int[] num= {1,2,3};
		int[][] table = {{1,2,3},{4,5},{6,7,8,9}};
		
		System.out.println("Length of list is: "+list.length); //10
		System.out.println("Length of num is: "+num.length); //3
		System.out.println("Length of table is: " +table.length);//3
		System.out.println("Length of table[0] is: "+table[0].length); //3
		System.out.println("Length of table[1] is: "+table[1].length); //2
		System.out.println("Length of table[2] is: "+table[2].length);//4
		}

	}


