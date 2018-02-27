package com.athensoft.util.generic;

import java.util.ArrayList;

import org.junit.experimental.theories.Theories;

/**
 *  Generic is  "parameterized type ".
 *  
 * The essence of generics  is to parameterize types (the types of formal constraints that are controlled
 * by different types of generics without creating new types). That is to say in the process of generic use, 
 * the data type of the operation is specified as a parameter, this type of parameters can be used in classes,
 * interfaces and methods, respectively known as generic classes, generic interfaces, generic methods
 */

public class GenericsType {

	
	/**
	 * an introduce to Generic
	 */
	public void introduceGeneric() {
		
		/**
		 *   non-generic version of Box class.
		 *  
		 *  Begin by examining a non-generic Box class 
		 *  that operates on objects of any type. 
		 *  
		 */
		 class Box{
				
			 private Object object;

			public Object getObject() {
				return object;
			}

			public void setObject(Object object) {
				this.object = object;
			}
				
			};
			
			/**
			 *  Generic version of the Box class.
			 * 
			 * Since its methods accept or return an Object, 
			 * you are free to pass in whatever you want,
			 **/
			Box  box = new Box();
			box.setObject(11);
			System.out.println(box.getObject());

			box.setObject("22");
			System.out.println(box.getObject());
			
			
			/**
			 * now I'd like to modify Class Box to Box2 by adding <T> just Box class name
			 * 
			 **/
			
			class Box2<T>{
				
				private T t;

				public T getT() {
					return t;
				}

				public void setT(T t) {
					this.t = t;
				}
				
			}
			/** 
			 * now there is a warning in Box2 Class says : 
			 *  Box2 is a raw type. References to generic type Box2<T> should be 
	 		 *	parameterized.
			 */
			Box2  box2 = new Box2();
			
			box2.setT(111);
			System.out.println(	box2.getT());
			
			box2.setT("222");
			System.out.println(	box2.getT());
			
			
			/**
			 * They Type I set is Object , that means we are free to pass in whatever we want, 
			 * and now the warning is gone. 
			 **/
			Box2<Object> box2Fixed = new Box2<Object>();
			
			box2Fixed.setT(1111);
			System.out.println(box2Fixed.getT());
			
			box2Fixed.setT("2222");
			System.out.println(	box2Fixed.getT());
			
			/**
			 * now I have a question, If I set the other type instead of Object 
			 * but set the same data that I set before.
			 * then what will happen?
			 * 
			 */

			Box2<Integer> box2Integer = new Box2<Integer>();
			
			box2Integer.setT(1);
			//box2Integer.setT("1");
			//Error : The method setT(Integer) in the type Box2<Integer> is not applicable for the arguments (String)
			
			/**
			 *  once we set a type as a parameter of <T> , the compiler only need to help us to check if there are compilation problem 
			 *  ,otherwise a lot of class casting and auto-boxing work will have to be done.
			 *  
			 */
	
	}
	
	/**
	 * 
	 *	take a look inside of what's after the compilation 
	 */
	public void afterCompile() {
		
		ArrayList<String> arrayList1 = new ArrayList<String>();
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		if(arrayList1.getClass()==arrayList2.getClass()){
			
			System.out.println("after compilation , arraylist1 and arraylist2 is the same ");
		}
	}
	
	/**
	 *  customized Generic Type
	 *  
	 */
	public void customizedType(){
	
		class Clazz{
			
		}
		
		ArrayList<Clazz> arrayList = new ArrayList<Clazz>();
		
		Clazz c1 =new Clazz();
		
		arrayList.add(c1);
		
		if (arrayList.contains(c1)) {
			System.out.println("customized class can be as a generic type");
		}
		
	}
	
	
	
}
