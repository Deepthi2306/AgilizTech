package com.at.examples.mt;

public class Tables {
	public void printTable(int number) {
		for(int i=1;i<=10;i++) {
			System.out.println(i*number);
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
