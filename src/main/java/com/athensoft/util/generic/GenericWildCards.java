package com.athensoft.util.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 
 *  In generic code, the question mark (?), called the wildcard, 
 *  represents an unknown type. The wildcard can be used in a variety of situations:
 *   as the type of a parameter, field, or local variable; sometimes as a return type 
 *   (though it is better programming practice to be more specific).
 *  
 *  Because of wildcard Number, String, Integer are the same as an actual type,
 *  you can put ? As all types of parent class. Is a real type. 
 *  
 *  
 **/
public class GenericWildCards {

	public void showValue1(Box2<Number> obj){
	    System.out.println(obj.getT());
	}
	
	/**
	 *   we modify our function showKeyValue by using  wildcard
	 * 
	 **/
	public void showValue2(Box2<?> obj){
	   System.out.println(obj.getT());
	}
	
	public void testWildcard(){
			
			Box2<Number> bNumber=new Box2<Number>();
			Box2<Integer> bInteger = new Box2<Integer>();
			Box2<Boolean> bBool=new Box2<Boolean>();
			bNumber.setT(1);
			bInteger.setT(11);
			bBool.setT(false);
			
			
			showValue1(bNumber);
			/**
			 * here is an error , The method showValue1(Box2<Number>) in
			 * the type GenericWildCards is not applicable for the
			 * arguments (Box2<Integer>)
			 * 
			 * */
			//showValue1(bInteger); 
			//showValue1(bBool);
			
			
			
			//compile success
			showValue2(bNumber);
			showValue2(bInteger); 
			showValue2(bBool);
			
		}
	
	public void addElementWhileUsingWildCard() {
		
		List<?> names = new ArrayList();
		//error :The method add(int, capture#2-of ?) in the type List<capture#2-of ?> is not applicable for the arguments (int)
		//names.add(1);
	}
	
}
class Box2<T>{
	
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
} 