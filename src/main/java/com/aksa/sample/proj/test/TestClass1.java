package com.aksa.sample.proj.test;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestClass1 {
	String name;
	protected String name2 = "Amit";

	public static void main(String[] args) throws InterruptedException {

		HashSet<Person> hs1 = new HashSet<>();
		Person p1 = new Person("Sumit", 30);
		Person p2 = new Person("Amit", 27);
		Person p3 = new Person("Sachin", 24);
		hs1.add(p1);
		hs1.add(p2);
		hs1.add(p3);
		hs1.add(p1);
		System.out.println(hs1);
		TreeSet<Person> ts1 = new TreeSet<>();
		ts1.add(p1);
		ts1.add(p2);
		ts1.add(p3);
		ts1.add(p1);
		System.out.println(ts1);
		// TreeNode
		TreeMap<Person, Integer> tm1 = new TreeMap<>();
		// tm1.put(p1, tm1.get(p1) == null ? 1 : tm1.get(p1) + 1);
		put(p1, tm1);
		put(p2, tm1);
		put(p3, tm1);
		put(p1, tm1);
		
		System.out.println(tm1);

	}

	public static void put(Person p, TreeMap<Person, Integer> tm1) {
		tm1.put(p, tm1.get(p) == null ? 1 : tm1.get(p) + 1);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class Person implements Comparable<Person> {
	String name;
	int age;

	Person() {

	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;

	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person p) {
		return (this.age - p.age);
	}

}
