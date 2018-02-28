package com.athensoft.util.generic;


/**
 * The definition and use of generic interface and generic class are basically the same.
 * 
 *  let's define a generic interface
 * */
public interface GenericInterface<T1> {
	
	    public T1 showManyInfo(T1 t);
	    public T1 displayOtherThings(T1 t);
}


	/**
	 * situation 1: 
	 *  a class implementing a generic interface  while does not pass a generic argument
	 * 
	 *    erros : T cannot be resolved to a type
	 *
	 */
 /*class Genericlass implements GenericInterface<T>{

	public T showManyInfo(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	public T displayOtherThins(T t) {
		// TODO Auto-generated method stub
		return null;
	}


}*/

	/** situation 2:
	 * 
	 * declare a Generic when we create a subclass 
	 * 
	 */
class Genericlass<T> implements GenericInterface<T>{

		public T showManyInfo(T t) {
			// TODO Auto-generated method stub
			return null;
		}

		public T displayOtherThings(T t) {
			// TODO Auto-generated method stub
			return null;
		}
	
}
/**
 * situation 3: 
 *  a class implementing a generic interface  and  passing  generic arguments
 * 
 *	compile success
 *
 */
class Genericlass2 implements GenericInterface<String>{

	public String showManyInfo(String t) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String displayOtherThings(String t) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
/**
 *  in this case we could pass whatever types that we need.
 * 
 *  however we need to replace all the parameter types as the same with T we passed at the interface generic 

 */
	class Genericlass3 implements GenericInterface<Integer>{

		public Integer showManyInfo(Integer t) {
			// TODO Auto-generated method stub
			return null;
		}
		
		public Integer displayOtherThings(Integer t) {
			// TODO Auto-generated method stub
			return null;
		}
	}


