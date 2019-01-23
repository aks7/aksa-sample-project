package com.aksa.sample.proj.test1;

import com.aksa.sample.proj.test.TestClass1;

public class TestClass2 extends TestClass1 {
	String name3=name2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass1 tc1=new TestClass1();
		//System.out.println(tc1.name);
		System.out.println(tc1.getName());
	}
}

class TestClass3 extends TestClass2
{
	TestClass2 tc2=new TestClass2();
	String s=name2;
	void m1() {
		String s="qweerty";
		byte b=8;
		b=(byte) (b+8);
		int b1=6&8;
		
	}
}
