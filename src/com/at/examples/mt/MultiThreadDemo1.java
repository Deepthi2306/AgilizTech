package com.at.examples.mt;

class MultithreadExtend extends Thread {
	public void run() {
		//System.out.println("..."+Thread.currentThread().getId());
		System.out.println("..." +Thread.currentThread().getName());
	}
}

public class MultiThreadDemo1 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
		MultithreadExtend multi = new MultithreadExtend();//creation of thread object
		multi.run(); //start internally invokes run method
		//no new thread is created when run() is called, bad practice
		//always invoke start() method on the thread object
		}
	}
}
