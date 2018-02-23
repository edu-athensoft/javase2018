package com.eduAthen.adt.set;

import java.util.LinkedHashSet;

public class AdtLinkedHashSet {

	/*
	 * LinkedHashSet is a subclass of HashSet , it also depends on the element's
	 * hashCode to determine the storage location of the element, but it uses
	 * the linked list to maintain the order of the elements so that the
	 * elements appear to be saved in the inserted order.
	 */

	public static void main(String[] args) {

		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("Java SE");
		set.add("Java EE");
		set.add("Java WEB");
		set.add("Java Frameworks");
		System.out.println(set);
		// output [Java SE, Java EE, Java WEB, Java Frameworks]

		set.add("Java SE");

		System.out.println(set);

	}
}
