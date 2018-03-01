package com.athensoft.util.generic;


/**
 * created for demonstrated purpose.
 * a modified version of class box
 * modify Class Box to Box2 by adding <T> just Box class name
 * 
 *  it was in a inner class at GenericType ,since I need to use it at junit test ,I have to declared it as a normal class;
 *  so Junit could see it .
 *  
 **/
public class Box2 <T> {

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}


}
