package com.at.examples.mt;

//Demonstrating the lifecyle of a thread
class RunnableDemo implements Runnable {
	private String threadname;

	public RunnableDemo(String tname) {
		threadname = tname;
		System.out.println("Creating a new thread..." + threadname);
	}

	@Override
	public void run() {
		System.out.println("Running...");
		System.out.println("Waiting now...");
		for (int i = 0; i < 4; i++) {
			try {
				System.out.println("***");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread terminating...");
	}

	public void start() {
		System.out.println("Runnable...");
	}

}

public class MultiThreadDemo4 {
	public static void main(String[] args) {
		RunnableDemo demo1 = new RunnableDemo("thread1");
		demo1.run();
	}
}
