package com.at.examples.basic;
//null reference
//different obj ref assignment
//anonymous object
public class GarbageCollector {

	public static void main(String[] args) {
		GarbageCollector g1 = new GarbageCollector();
		GarbageCollector g2 = new GarbageCollector();
		g1=null;
		g2=null;
		//run the JVM's garbage collector
		System.gc();
	}
	public void finalize() {
		System.out.println("Garbage collector executed...");
	}

}
