package com.at.examples.mt;

public class MultiThreadDemo3 implements Runnable {

	public static void main(String[] args) {
		Thread thread1 = new Thread("my-thread");
		Thread thread2 = new Thread("your-thread");
		thread1.start();
		thread2.start();
		System.out.println(thread1.getName());
		System.out.println(thread2.getName());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
