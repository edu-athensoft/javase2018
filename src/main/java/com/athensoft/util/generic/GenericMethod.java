package com.athensoft.util.generic;

/**
 * 
 * A generic method is a method that specifies a concrete type of a generic
 *  at the time the method is called
 * 
 */
public class GenericMethod {

	/**
	 * Wrong practice 1
	 * 
	 * This is not a generic method, this is a common method uses <Number>
	 * generic type only.
	 *
	 */
	public void showValue1(Box2<Number> obj) {

		System.out.println(obj.getT());

	}

	/**
	 * Wrong practice 2
	 * 
	 * This is not a generic method, which is also an ordinary method, but using
	 * wildcard <?>
	 */
	public void showValue2(Box2<?> obj) {
		System.out.println(obj.getT());

	}

	/**
	 * 
	 * Wrong practice 3
	 * 
	 * This method has an error, the compiler will prompt us with the error
	 * message: "UnKnown class 'E'" Although we declared <T>, we also show that
	 * this is a generic method that handles generic types. But only the generic
	 * type T is declared and the generic type E is not declared, so the
	 * compiler does not know what to do with this type of E.
	 * 
	 * 
	 * public <T> T showValue3(Box2<E> obj){ System.out.println(obj.getT()); }
	 */

	/**
	 * Wrong practice 4
	 * 
	 * This method has an eroor as well, the compiler will prompt us with the
	 * error message: "UnKnown class 'T'". This type T is not declared in the
	 * project for compilers, so compilation does not know how to compile this
	 * class. So this is not a correct generic method statement either.
	 * 
	 * public void showValue4(T obj){
	 * 
	 * }
	 */

	/**
	 * This is a true generic method.     
	 * First, the <T> must between the public
	 * and the return value is a must, which indicates that this is a generic
	 * method and declares a generic T     
     * Second,This T can appear anywhere in this generic method.   
     * Last, The number of generics can be many
	 * as well
	 */
	public <T> T showName(Box2<T> obj) {
		System.out.println(obj.getT());
		T test = obj.getT();
		return test;
	}

	/**
	 * Of course, this is not all of the generic methods, generic methods can
	 * appear to be used anywhere and in any scenario.
	 * 
	 * However, there is a special case, when the generic method appears in the
	 * generic class, we will look at an example
	 **/

	public void showSpecialCase() {

		Cat cat = new Cat();
		Human human = new Human();

		Box3<Animal> box3 = new Box3<Animal>();
		box3.show_1(cat);
		// error : because the generic type is Animal, however human is not
		// anything with animal
		// box3.show_1(human);

		// but rest of the functions work perfectly
		box3.show_2(cat);
		box3.show_2(human);

		box3.show_3(cat);
		box3.show_3(human);

	}
}

class Animal {
	@Override
	public String toString() {
		return "animal";
	}
}

class Cat extends Animal {
	@Override
	public String toString() {
		return "cat";
	}
}

class Human {
	@Override
	public String toString() {
		return "human";
	}
}

/**
 * Declare a generic method in a generic class,
 */
class Box3<T> {

	public void show_1(T t) {
		System.out.println(t.toString());
	}

	/**
	 * Declare a generic method in a generic class, using generic T, note that
	 * this T is a completely new type that can not be the same type as T
	 * declared in a generic class.
	 */
	public <T> void show_2(T t) {
		System.out.println(t.toString());
	}

	/**
	 * using generic E, which can be of any type. Can be of the same type as T,
	 * or different. because generics declare generics <E> at the time of
	 * declarations, the compiler can correctly recognize generics recognized in
	 * generic methods, even when generic types are not declared in generic
	 * classes.
	 * 
	 */
	public <E> void show_3(E t) {

		System.out.println(t.toString());

	}
	
	/**
	 * Static method and Generic
	 * 
	 * 
	 *  There is a situation to be aware of,
	 *  which is static methods in the class use generic:
	 *   static methods can not access the generic class definition; 
	 *   if the static method operation reference data type is not sure, you must to define generic in the method.
	 * 
	   eroor :
	   Cannot make a static reference to the non-static type T
	
	public static void name(T t) {
		
	} 
	  
	  correct practice:
	   */
	public static <T> void name(T t) {
		
	} 
	

}
