package com.tnsif.Junit5demo;




import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AssertDemo {
	
	@Test
	public void simple1() {
		int results =1;
		int expected = 1;
		assertEquals(results, expected);
	}
	
	@Test
	public void simple2() {
		int results =1;
		int expected = 2;
		assertNotEquals(results, expected);
	}
	
	@Test
	public void simple3() {
		String results ="Zain";
	    String expected = "Azain";
		assertNotSame(results, expected);
	}
	
	@Test
	public void simple4() {
		Boolean results = false;
	    String expected = "Azain";
		assertFalse(results, expected);
	}
	
	@Test
	public void simple5() {
		Boolean results = true;
	    String expected = "Azain";
		assertTrue(results, expected);
	}
	
	@Disabled
	@Test
	public void simple6() {
		Boolean results = true;
	    String expected = "Azain";
		assertNull(results, expected);
	}
	
	
	
}
