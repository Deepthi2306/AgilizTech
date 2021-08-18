package com.at.examples.mt;

public class MultiThreadDemo5 extends Thread {
	
	public void run() {		
	}

	public static void main(String[] args) {
		MultiThreadDemo5 thread1 = new MultiThreadDemo5();
		MultiThreadDemo5 thread2 = new MultiThreadDemo5();
		System.out.println("Thread priority: "+thread1.getPriority());
		thread1.setPriority(7);
		System.out.println("Thread priority now: "+thread1.getPriority());
		System.out.println("Thread priority of second thread object: "+thread2.getPriority());
		System.out.println("Main thread: " +Thread.currentThread().getName());
		System.out.println("Thread priority of main thread: " +Thread.currentThread().getPriority());
	}
}
