package com.at.examples.mt;

class MultiThreadImplement implements Runnable{

	@Override
	public void run() {
		//System.out.println("..."+Thread.currentThread().getId());		
		System.out.println("..." +Thread.currentThread().getName());
	}	
}

public class MultiThreadDemo2 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
		MultiThreadImplement objR = new MultiThreadImplement();
		Thread objT = new Thread(objR);
		objT.start();
		}

	}

}
