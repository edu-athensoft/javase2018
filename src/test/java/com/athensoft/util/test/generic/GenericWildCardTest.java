package com.athensoft.util.test.generic;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.athensoft.util.generic.GenericWildCards;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Wildcard;

public class GenericWildCardTest {
	
	GenericWildCards Wildcard = new GenericWildCards();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTestWildcard() {
		
		Wildcard.testWildcard();
		
	}

}
