package com.tnsif.Junit5demo;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo {
	
	@Test
	void TestOnDevelopment() {
		System.setProperty("Enviroment", "Development"); //True
		Assumptions.assumeTrue("Development".equals(System.getProperty("Environment")));
	}
	
	@Test
	void TestOnDev() {
		System.setProperty("Enviroment", "Development"); //False
		Assumptions.assumeFalse("Product".equals(System.getProperty("Environment")));
	}
	
	@Test
	void TestOnProduct() {
		System.setProperty("Enviroment", "Product"); //E=P
		Assumptions.assumeTrue("Development".equals(System.getProperty("Environment")), AssumptionDemo::message);
	}

	@Test
	void TestOnProducts() {
		System.setProperty("Enviroment", "Product"); //True
		Assumptions.assumingThat("Development".equals(System.getProperty("Environment")), AssumptionDemo::message);
	}

	private static String message() {
		return "Test is failed::";
	}
}
