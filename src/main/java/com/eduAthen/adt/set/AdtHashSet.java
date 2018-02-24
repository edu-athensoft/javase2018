package com.eduAthen.adt.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

/*
 * Class HashSet<E>
 * java.lang.Object
	java.util.AbstractCollection<E>
		java.util.AbstractSet<E>
			java.util.HashSet<E>
			
 *  Elements in Set is unordered, and unique.
 *  
 *  This class implements the Set interface, backed by a hash table (actually a HashMap instance)
 *  , so it is also an unordered collection that does not contain duplicate elements, 
 *  allowing null, with only one  null!
 *  
 * */
public class AdtHashSet{
	public void hashSet() {
		
		String [] strings = {"Bob","Martin","Jack","Rose"};
		HashSet<String> hashSet = new HashSet<String>();
		
		for (String string : strings) {
			hashSet.add(string);
		}
		
		System.out.println("size of set :"+hashSet.size());//size of set :4
		System.out.println("hashCode of set :"+hashSet.hashCode());//hashCode of set :-1992509026
		System.out.println("print :"+hashSet);//cast set to string :[Bob, Rose, Martin, Jack]
		System.out.println("Contains bob ? "+hashSet.contains("bob"));//Contains bob ? false
		System.out.println("Contains Bob ? "+hashSet.contains("Bob"));//Contains Bob ? true
		
		
	
		Set<String> hashSet2 = new HashSet<String>();
		hashSet2.add("Simon");
		hashSet2.add("Cater");
		//Adds all of the elements in the specified collection
		hashSet.addAll(hashSet2);
		
		Iterator<String> iterator = hashSet.iterator();
		System.out.println("size of set after addAll :"+hashSet.size());//size of set :4
		
		//iterate all the elements in the hashset
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+" "); //Bob Simon Rose Martin Jack Cater 
		}
			
		/* Output from Console: Bob Simon Rose Martin Jack Cater
		 * The orders of elements in HashSet is obviously different with the order we added.
		 * This is because Hashcode of elements in the HashSet.
		 * Value of Hashcode decides the location in the HashSet and also keep the unique of every elements. 
		 * When the value of hashcode from an element is same with another element
		 * the hashset won't add the element
		 * */
		
		
	}
	
	
}
