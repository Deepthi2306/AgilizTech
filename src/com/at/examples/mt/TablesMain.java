package com.at.examples.mt;

public class TablesMain {
	public static void main(String[] args) {
		Tables tables = new Tables();		
		Runnable ref1 = () -> {		
			synchronized(tables) {
				tables.printTable(10);	
			}
		};
		Runnable ref2 = () -> {	
			synchronized(tables) {
				tables.printTable(4);
			}
		};		
		Thread threadOne = new Thread(ref1);
		Thread threadTwo = new Thread(ref2);
		threadOne.start();
		threadTwo.start();
	}
}
