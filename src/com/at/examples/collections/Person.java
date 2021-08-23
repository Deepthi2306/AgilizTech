package com.at.examples.collections;

import java.io.Serializable;
//Java Bean - implements Serializable
//POJO - does not implement Serializable
public class Person implements Comparable<Person> {
	
	private int pid;	
	private String pname;
	
	public Person(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	/*
	 * @Override public String toString() { return "Person [pid=" + pid + ", pname="
	 * + pname + "]"; }
	 */

	@Override
	public int compareTo(Person o) { //returns zero, or positive number or negative number
		//used for object comparison - possible to compare based on integer only
		//return this.pid - o.pid;//ascending order
		return o.pid - this.pid; //descending order
		//return 0;
	}

	/*
	 * public int hashCode() { //Object class return this.pid; }
	 */
}
