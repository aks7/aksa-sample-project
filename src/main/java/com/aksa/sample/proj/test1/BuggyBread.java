package com.aksa.sample.proj.test1;
public class BuggyBread {
   static class A {
      A() {
         f();
         f1();
      }

      public void f() {
         System.out.println("A ctor");
      }
      public void f1() {
          System.out.println("A f1 ctor");
       }
   }

   static class B extends A {
      B() {
         f();
      }

      public void f() {
         System.out.println("B ctor");
      }
   }
   static class C extends B {
	      C() {
	         f();
	      }

	      public void f() {
	         System.out.println("C ctor");
	      }
	   }

   public static void main(String[] args) {
		/*
		 * B b = new B(); b.f(); A a = new A(); a.f();
		 */
	   C c = new C();
	   c.f();
   }
}