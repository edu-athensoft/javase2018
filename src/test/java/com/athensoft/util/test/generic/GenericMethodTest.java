package com.athensoft.util.test.generic;

import static org.junit.Assert.*;

import org.junit.Test;

import com.athensoft.util.generic.Box2;
import com.athensoft.util.generic.GenericMethod;

public class GenericMethodTest {

	private GenericMethod genericMethod = new GenericMethod();
	Box2<Number> box2 = new Box2<Number>();
	
	@Test
	public void testShowValue1() {
		genericMethod.showValue1(box2);
	}

	@Test
	public void testShowValue2() {
		genericMethod.showValue2(box2);
	}

	@Test
	public void testShowName() {
		genericMethod.showName(box2);
	}

	@Test
	public void testShowSpecialCase() {
		
		genericMethod.showSpecialCase();
	}

}
