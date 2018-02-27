package com.athensoft.util.adt.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class AdtHashMap {

	/*
	 * HashMap is Hash table based, and an implementation of the Map interface
	 * Hashmap provides all of the map functions, and allows null values and the
	 * null key.
	 * 
	 * A Key corresponds to a Value.
	 *
	 * Class HashMap<K,V>
	 *  java.lang.Object 
	 *  	java.util.AbstractMap<K,V>
	 * 			java.util.HashMap<K,V> 
	 * 
	 * Type Parameters: 
	 * 				 K - the type of keys maintained
	 * 				 V - the type of mapped values
	 *
	 * 
	 * 
	 * four constructors:
	 * HashMap()
	 *   Constructs an empty HashMap with the default initial capacity
	 *   (16) and the default load factor (0.75). 
	 *   
	 * HashMap(int initialCapacity)
	 *   Constructs an empty HashMap with the specified initial capacity and the
	 * 	 default load factor (0.75). 
	 * 
	 * HashMap(int initialCapacity, floatloadFactor) 
	 *   Constructs an empty HashMap with the specified initial
	 *    capacity and load factor.
	 *    
	 * HashMap(Map<? extends K,? extends V> m)
	 *   Constructs a new HashMap with the same mappings as the specified Map.
	 */

	public void hashMap() {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		/* Adding elements to HashMap */
		hmap.put(6, "Chen");
		hmap.put(8, "Liu");
		hmap.put(12, "Wang");
		hmap.put(9, "Zhang");
		hmap.put(3, "Zhao");

		/* Display content using Iterator */
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.print("key is: " + mentry.getKey() + " & Value is: ");
			System.out.println(mentry.getValue());
		}
		/*
		 * key is: 3 & Value is: Zhao 
		 * key is: 6 & Value is: Chen 
		 * key is: 8 &  Value is: Liu 
		 * key is: 9 & Value is: Zhang
		 * key is: 12 & Value is: Wang
		 * 
		 */

		System.out.println("contains key 1 ? " + hmap.containsKey(1));

		/* Get values based on key */
		String var = hmap.get(3); 				//contains key 1 ? false
		System.out.println("Value at index 3 is: " + var);   //Value at index 3 is: Zhao

		/* Remove values based on key */
		hmap.remove(3);
		System.out.println("Map key and values after removal:");
		Set set2 = hmap.entrySet();

		Iterator iterator2 = set2.iterator();
		while (iterator2.hasNext()) {
			Map.Entry mentry2 = (Map.Entry) iterator2.next();
			System.out.print("Key is: " + mentry2.getKey() + " & Value is: ");
			System.out.println(mentry2.getValue());
		}
		/*
		 *  Key is: 6 & Value is: Chen
		 *	Key is: 8 & Value is: Liu
		 *	Key is: 9 & Value is: Zhang
		 *	Key is: 12 & Value is: Wang
		 * */
		
		hmap.put(null, "3333");
		
		System.out.println(hmap.get(null));
		

		hmap.put(null, "4444");
		hmap.put(3, "555");
		
		System.out.println(hmap.get(null));
	}
}
