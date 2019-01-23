package com.aksa.sample.proj.test;

import java.util.HashSet;

public class HashSetUse {

	public static void main(String[] args) {

		HashSet<Book> hsb=new HashSet<>();
		hsb.add(new Book("book1",100.00));
		hsb.add(new Book("book2",200.00));
		hsb.add(new Book("book1",100.00));
		System.out.println(hsb);
		
		testEqualAndEquals();
		
		
	}

	private static void testEqualAndEquals() {
		Integer i1=1000;
		Integer i2=1000;
		
		Integer i3=1000;
		Integer i4=1000;
		if(i1!=i2)
		{
			System.out.println("diff object");
		}
		if(i3 == i4)
		{
			System.out.println("same object");
		}
		if(i3.equals(i4))
		{
			System.out.println("meaning fully equal");
		}
	}

}

class Book
{
	String bookName;
	Double price;
	
	
	public Book(String bookName, Double price) {
		super();
		this.bookName = bookName;
		this.price = price;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", price=" + price + "]";
	}
	
}
