package com.CucumberParabank;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClassParabank {
	@Before
	public static void setUp() {
		HelperClassParabank.setUpDriver();
	}
	@After
	public static void tearDown() {
		HelperClassParabank.teardown();
	}
}
