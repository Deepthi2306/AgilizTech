package com.at.examples.basic;

public class BreakContinue {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			if(i==5)
				continue; //use break here and check the difference in execution
			System.out.println(i);
		}

	}

}
