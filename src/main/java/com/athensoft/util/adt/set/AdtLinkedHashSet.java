package com.athensoft.util.adt.set;

import java.util.LinkedHashSet;

import org.junit.Test;

public class AdtLinkedHashSet {

	/*Class LinkedHashSet<E>
	 * java.lang.Object
		java.util.AbstractCollection<E>
			java.util.AbstractSet<E>
				java.util.HashSet<E>
					java.util.LinkedHashSet<E>
	 *Hash table and linked list implementation of the Set interface, 
	 *with predictable iteration order. It also depends on the element's
	 * hashCode to determine the storage location of the element, but it uses
	 * the linked list to maintain the order of the elements so that the
	 * elements appear to be saved in the inserted order.
	 */
	public void linkedHashSet() {
		
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
