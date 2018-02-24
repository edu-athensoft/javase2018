package com.eduAthen.adt.set;

import java.util.TreeSet;

import org.junit.Test;

public class AdtTreeSet {

	/* Class TreeSet<E>
	 * 
	 * java.lang.Object
			java.util.AbstractCollection<E>
				java.util.AbstractSet<E>
					java.util.TreeSet<E>
					
	 * A NavigableSet implementation based on a TreeMap. 
	 * The elements are ordered using their natural ordering,
	 *  or by a Comparator provided at set creation time, depending on which constructor is used.
	 */

	public void treeSet() {
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(-14);
		treeSet.add(5);
		treeSet.add(8);
		treeSet.add(6);
		treeSet.add(9);

		System.out.println(treeSet); // [-14, 1, 2, 5, 6, 8, 9]

		// first element
		System.out.println("treeSet.first() = " + treeSet.first()); // treeSet.first()
																	// = -14

		// last element
		System.out.println("treeSet.last() = " + treeSet.last()); // treeSet.last()
																	// = 9

		// return a SortedSet which contains elements that smaller than the
		// given element
		// the result excludes the same given element
		System.out.println(treeSet.headSet(5)); // [-14, 1, 2]

		// return a SortedSet which contains elements that greater than the
		// given element
		// the result includes the same given element
		System.out.println(treeSet.tailSet(5)); // [5, 6, 8, 9]

		// testing comparing objects without interface Comparable

		TreeSet<Object> treeSet2 = new TreeSet<Object>();

		treeSet2.add(new obj());
		treeSet2.add(new obj()); // Exception!
		// java.lang.ClassCastException

		// solution
		// class obj implements interface Comparable

		// testing comparing objects with different types

		TreeSet<Object> treeSet3 = new TreeSet<Object>();
		treeSet3.add(1);
		treeSet3.add("hello"); // Exception!

		// java.lang.ClassCastException java.lang.Integer cannot be cast to
		// java.lang.String

		// notice: elements must be the same type

	}

}

class obj {

}
