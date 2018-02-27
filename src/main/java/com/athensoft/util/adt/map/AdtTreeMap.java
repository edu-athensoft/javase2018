package com.athensoft.util.adt.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.athensoft.util.adt.utils.CollatorComparator;


public class AdtTreeMap {

	/*
	 * Class TreeMap<K,V>
	 *	java.lang.Object
	 *		java.util.AbstractMap<K,V>
	 *			java.util.TreeMap<K,V>
	 *	Type Parameters:
	 *		K - the type of keys maintained by this map
	 *		V - the type of mapped values
	 * 
	 * 
	 *  A Red-Black tree based NavigableMap implementation.
	 *  The map is sorted according to the natural ordering of its keys, 
	 *  or by a Comparator provided at map creation time, 
	 *  depending on which constructor is used.
	 *  
	 *  Four Constructors:
	 *  
	 *  TreeMap()
	 *	Constructs a new, empty tree map, using the natural ordering of its keys.
	 *	
	 *	TreeMap(Comparator<? super K> comparator)
	 *	Constructs a new, empty tree map, ordered according to the given comparator.
	 *	
	 *	TreeMap(Map<? extends K,? extends V> m)
	 *	Constructs a new tree map containing the same mappings as the given map, ordered according to the natural ordering of its keys.
	 *	
 	 *	TreeMap(SortedMap<K,? extends V> m)
	 *	Constructs a new tree map containing the same mappings and using the same ordering as the specified sorted map.
	 * */
	
	public void treeMap(){
		/*
		 *  if don't give parameter comparator,
		 *  the Chinese character is not ordered
		 * 
		 * */
		TreeMap<String, String> tmap = new TreeMap<String, String>();

		/* Adding elements to Hastmap */
		tmap.put("��", "��");
		tmap.put("��", "��");
		tmap.put("��", "��");
		tmap.put("��", "��");
		tmap.put("��", "��");

		System.out.println("\ntreeMap Constructor without comparator: \n");
		/* Display content using Iterator */
		Set set = tmap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.print("key is: " + mentry.getKey() + " & Value is: ");
			System.out.println(mentry.getValue());
		}
		/*
		 * 
		key is: �� & Value is: ��
		key is: �� & Value is: ��
		key is: �� & Value is: ��
		key is: �� & Value is: ��
		key is: �� & Value is: ��
		 * 
		 */

		System.out.println("contains key �� ? " + tmap.containsKey("��"));

		/* Get values based on key */
		String var = tmap.get("��"); 				//contains key �� ? false
		System.out.println("Value of Key �� is: " + var);   //Value of Key �� is: ��

		/* Remove values based on key */
		tmap.remove("��");
		System.out.println("Map key and values after removal:");
		Set set2 = tmap.entrySet();

		Iterator iterator2 = set2.iterator();
		while (iterator2.hasNext()) {
			Map.Entry mentry2 = (Map.Entry) iterator2.next();
			System.out.print("Key is: " + mentry2.getKey() + " & Value is: ");
			System.out.println(mentry2.getValue());
		}
		/*
		Key is: �� & Value is: ��
		Key is: �� & Value is: ��
		Key is: �� & Value is: ��
		Key is: �� & Value is: ��

		 * */
		
		//----------------with comparator
		System.out.println("\ntreeMap Constructor with comparator: \n");
				CollatorComparator comparator = new CollatorComparator();
				TreeMap<String, String> tmap2 = new TreeMap<String, String>(comparator);

				/* Adding elements to Hastmap */
				tmap2.put("��", "��");
				tmap2.put("��", "��");
				tmap2.put("��", "��");
				tmap2.put("��", "��");
				tmap2.put("��", "��");

				/* Display content using Iterator */
				Set set3 = tmap2.entrySet();
				Iterator iterator3 = set3.iterator();
				while (iterator3.hasNext()) {
					Map.Entry mentry = (Map.Entry) iterator3.next();
					System.out.print("key is: " + mentry.getKey() + " & Value is: ");
					System.out.println(mentry.getValue());
				}
				/*
				 * 
				 	key is: �� & Value is: ��
					key is: �� & Value is: ��
					key is: �� & Value is: ��
					key is: �� & Value is: ��
					key is: �� & Value is: ��
				 * 
				 */

				System.out.println("contains key �� ? " + tmap2.containsKey("��"));

				/* Get values based on key */
				String var2 = tmap2.get("��"); 				//contains key �� ? false
				System.out.println("Value of Key �� is: " + var2);   //Value of Key �� is: ��

				/* Remove values based on key */
				tmap2.remove("��");
				System.out.println("Map key and values after removal:");
				Set set4 = tmap2.entrySet();

				Iterator iterator4 = set4.iterator();
				while (iterator4.hasNext()) {
					Map.Entry mentry4 = (Map.Entry) iterator4.next();
					System.out.print("Key is: " + mentry4.getKey() + " & Value is: ");
					System.out.println(mentry4.getValue());
				}
				/*
				Key is: �� & Value is: ��
				Key is: �� & Value is: ��
				Key is: �� & Value is: ��
				Key is: �� & Value is: ��

				 * */
		
	}
		
		
		
		
		
	
}
