package com.eduAthen.adt.list;

import java.util.ArrayList;

public class AdtArrayList {

	/*
	 * ArrayList is an implementation of List interface, it bases on array as
	 * well, and a dynamic array of queues. But it is not the same as the array
	 * in Java, its capacity can be automatically increased, similar to the C
	 * language dynamic application of memory, dynamic growth of memory!
	 * 
	 * the index of an element is the order of added it, for the first time to
	 * add the element index is 0, the second index is added to 1 .
	 * 
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("java");
		list.add("python");
		list.add("c#");

		System.out.println(list); // [java, python, c#]

		list.add(1, "C++");

		System.out.println(list); // [java, C++, python, c#]

		list.remove(0);

		System.out.println(list); // [C++, python, c#]

		System.out.println(list.subList(1, 2));// [python]

		list.set(1, new String("go"));

		System.out.println(list); // [C++, go, c#]

		System.out.println(list.indexOf(new String("C"))); // -1

		/* Important 
		 * List determines whether the two objects are equal by equals method
		 * returns true
		 * 
		 * and class A overwrite the equals method.
		 * 
		 */
		ArrayList<Object> list2 = new ArrayList<Object>();
		list2.add("java");
		list2.add("python");
		list2.add("c#");

		list2.remove(new A());
		System.out.println(list2);// [python, c#]
		list2.remove(new A());
		System.out.println(list2);// [c#]
	}

}

class A {
	@Override
	public boolean equals(Object obj) {
		return true;
	}
}
