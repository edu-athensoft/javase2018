package com.athensoft.util.test.generic;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.athensoft.util.generic.GenericsType;

import junit.framework.Assert;

public class GenericTypeTest {
	
	private GenericsType generic=new GenericsType();
	
	@Test
	public void testIntroduceGeneric() {
		generic.introduceGeneric();
	}

	@Test
	public void testAfterCompile() {
		generic.afterCompile();	
		}

	@Test
	public void testCustomizedType(){
		generic.customizedType();
		
	}

}
