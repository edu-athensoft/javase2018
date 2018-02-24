package com.eduAthen.adt.utils;


import java.text.CollationKey;
import java.text.Collator;
import java.util.Comparator;


// implements Comparator interface
public class CollatorComparator implements Comparator {
	// Instantiate Collator 
	Collator collator = Collator.getInstance();
	
	//rewrite compare function
	public int compare(Object element1, Object element2) {
		
	    CollationKey key1 = collator.getCollationKey(element1.toString());
	    CollationKey key2 = collator.getCollationKey(element2.toString());
	    
	    return key1.compareTo(key2);
	}
}
