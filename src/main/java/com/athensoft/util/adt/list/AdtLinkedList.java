package com.athensoft.util.adt.list;

import java.util.LinkedList;

import org.junit.Test;


public class AdtLinkedList {
	
	
	/*Class LinkedList<E>
		java.lang.Object
			java.util.AbstractCollection<E>
				java.util.AbstractList<E>
					java.util.AbstractSequentialList<E>
						java.util.LinkedList<E>
	 * 
	 * Doubly-linked list implementation of the List 
	 * and Deque interfaces. Implements all optional list operations,
	 *  and permits all elements (including null).
	 *  
	 * It has two pointers in each data node.
	 *  insert, delete only affect the node before it and the node after it.
	 *  
	 * This implementation is not synchronized.
	 * */
	
	
	public void linkedList(){
		 LinkedList<String> linkedList = new LinkedList<String>();

		 	/*
			  * add
				boolean add(E e)£ºadd an element at the end of linkedlist ,if succeed return true, or return false;
				void addFirst(E e)£º add an element at the beginning of linkedlist
				addLast(E e)£ºadd an element at the end of linkedlist
				void add(int index, E element)£ºadd an element at the index
		 	 * */
		 
	        linkedList.add("JAVA");
	        linkedList.add("C#");
	        linkedList.add("PHP");
	        System.out.println(linkedList); //[JAVA, C#, PHP]

	        linkedList.addFirst("C++");
	        System.out.println(linkedList);//[C++, JAVA, C#, PHP]

	        linkedList.addLast("RUBY");    
	        System.out.println(linkedList); //[C++, JAVA, C#, PHP, RUBY]

	        linkedList.add(2, "HTML5");
	        System.out.println(linkedList);//[C++, JAVA, HTML5, C#, PHP, RUBY]
	        
	        linkedList.add(null);
	        
	        System.out.println(linkedList);//[C++, JAVA, HTML5, C#, PHP, RUBY, null]
	        
	        linkedList.add(null);
	        
	        System.out.println(linkedList);//[C++, JAVA, HTML5, C#, PHP, RUBY, null,null]
	        
	        
	        /*
	         * remove
			 *	 remove()£»Remove the first element in linkedlist 
			 *	 boolean remove(Object o); remove a certain element 
			 *	 remove(int index)£ºremove an element from a certain index
			 *	 removeFirst() Remove the first element in linkedlist 
			 *	 removeLast()£ºRemove the last element in linkedlist 
	         * */
	        
	        linkedList.remove();
	        System.out.println("remove: " + linkedList); // remove: [JAVA, HTML5, C#, PHP, RUBY, null, null]

	        linkedList.remove("RUBY");
	        System.out.println("remove(Object): " + linkedList);// remove: [JAVA, HTML5, C#, PHP, null, null]

	        linkedList.remove("Php");
	        System.out.println("remove(Object) not exist: " + linkedList); //remove(Object) not exist: [JAVA, HTML5, C#, PHP, null, null]

	        linkedList.remove(2);
	        System.out.println("remove(index): " + linkedList); //remove(index): [JAVA, HTML5, PHP, null, null]

	        linkedList.removeFirst();
	        System.out.println("removeFirst: " + linkedList); //removeFirst: [HTML5, PHP, null, null]

	        linkedList.removeLast();
	        System.out.println("removeLast:" + linkedList); //removeLast:[HTML5, PHP, null]

	        
	        /*
	         * because Linkedlist implemented Deque interface,
	         *  it can be used as LIFO (Last-In-First-Out) stacks.
	         *  
	         *  see functions push¡¢pop¡¢poll 
	         * */
	        
	        System.out.println("linkedList: " + linkedList);  // linkedList: [HTML5, PHP, null]

	        System.out.println("pop: " + linkedList.pop()); // pop: HTML5
	        System.out.println("after pop: " + linkedList); //after pop: [PHP, null]

	        System.out.println("poll: " + linkedList.poll()); //poll: PHP
	        System.out.println("after poll: " + linkedList);// after poll: [null]
	        
	        
	        /*
	         *  let's have a look what will happen when we use pop and poll while a linkedlist is empty
	         * 
	         * */
	        LinkedList<String> linkedList2 = new LinkedList<String>();

	        System.out.println("poll: " + linkedList2.poll()); // poll null
	       // System.out.println("pop: " + linkedList2.pop()); // exception : java.util.NoSuchElementException
	        
	        
	        /*
	         * peek
			 * peek()£ºget the first element but not remove it 
	 		 * peekFirst()£ºget the first element but not remove it 
			 * peekLast()£ºget the last element but not remove it
	         * */
	        
	        /*	
	         * source code of LinkedList.class
	         *  line 785 
	         *    public void push(E e) {
			 *      addFirst(e);
			 *   }
			 *   
	         * */
	        linkedList2.push("JAVA");  
	        linkedList2.push("C#");
	        linkedList2.push("RUBY");
	        linkedList2.push("GO");
	        linkedList2.push("C++");
	        linkedList2.push("HTML5");
	        
	        System.out.println("linkedList2: " + linkedList2); //[HTML5, C++, GO, RUBY, C#, JAVA]

	        System.out.println("peek: " + linkedList2.peek()); //HTML5
	        System.out.println("peekFirst: " + linkedList2.peekFirst());//HTML5
	        System.out.println("peekLast: " + linkedList2.peekLast());//JAVA

	        System.out.println("linkedList2: " + linkedList2); //linkedList2: [HTML5, C++, GO, RUBY, C#, JAVA]
	        
	        
	}
}
