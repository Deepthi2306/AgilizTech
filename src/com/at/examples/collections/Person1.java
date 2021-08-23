package com.at.examples.collections;

import java.io.Serializable;
//Java Bean - implements Serializable
//POJO - does not implement Serializable
public class Person1 implements Comparable<Person1> {
	
	int pid;	
	String pname;
	String pcharacter;
	
	public Person1(int pid, String pname,String pcharacter) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcharacter=pcharacter;
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

	public String getPcharacter() {
		return pcharacter;
	}

	public void setPcharacter(String pcharacter) {
		this.pcharacter = pcharacter;
	}

	@Override
	public int compareTo(Person1 o) {
		// TODO Auto-generated method stub
		//return 0;
		return this.pid - o.pid;
	}

	/*
	 * @Override public String toString() { return "Person [pid=" + pid + ", pname="
	 * + pname + "]"; }
	 */
	//mainly used for performance improvement
	  public int hashCode() { 
		  //Object class 
		  return this.pid; 
	  }
	 
	  }
	 

