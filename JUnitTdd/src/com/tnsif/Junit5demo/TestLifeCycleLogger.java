package com.tnsif.Junit5demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import java.util.logging.Logger;

//@TestInstance(TestLifecycle.PER_CLASS)
interface TestLifeCycleLogger {
	
	@BeforeAll
	default void beforeAllTests() {
		System.out.println("Before all Test");
		
	}
	
	@AfterAll
	default void afterAllTests() {
		System.out.println("After all Test");
		
	}
	
	@Test
	default void testMethod() {
		System.out.println("This is  Test method......");
		
	}
	
	

}
