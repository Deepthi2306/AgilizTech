package com.at.examples.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person {

	private int pid;
	private String pname;
	private Integer page;

	public Person(int pid, String pname, int page) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.page = page;
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

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", page=" + page + "]";
	}
}

public class PersonMain {

	public static int compareByName(Person p1, Person p2) {
		return p1.getPname().compareTo(p2.getPname());
	}

	public static int compareByAge(Person p1, Person p2) {
		return p1.getPage().compareTo(p2.getPage());
	}

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person(1, "Rakshit", 25));
		personList.add(new Person(3, "Rahul", 23));
		personList.add(new Person(2, "Rohit", 22));

		// System.out.println(personList);
		//Collections.sort(personList, PersonMain::compareByName);
		//System.out.println("Sorting by name... ");
		for (Person p : personList) {
			//System.out.println(p.getPname());
		}
		Collections.sort(personList, PersonMain::compareByAge);
		System.out.println("Sorting by age... ");
		/*for (Person p : personList) {
			System.out.println(p.getPage());
		}*/
		//to display all data
		personList.stream().forEach(System.out::println);
		//to display specific data
		//personList.stream().map(x->x.getPname()).forEach(System.out::println);
	}

}
