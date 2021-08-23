package com.at.examples.mt;

class Sample extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
	}
}
//java.lang.IllegalThreadStateException(start() method cannot be invoked twice on the same thread object
public class MultiThreadDemo6 {
	public static void main(String[] args) {
		Sample sampleObj1= new Sample();
		Sample sampleObj2= new Sample();
		sampleObj1.start();
		sampleObj1.start();
	}
}
