package com.training.uppercase;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Class to test UpperCaseConverter class
 * 
 * @author mnivedi1
 *
 */
public class TestUpperCaseConverter {

	private UpperCaseConverter upper;

	/**
	 * Executes before every test case
	 */
	@Before
	public void setup() {
		upper = new UpperCaseConverter();
	}

	/**
	 * Test case to check whether upper case converter returns correct result
	 */
	@Test
	public void testUpperCaseConverter() {
		List<String> words = new ArrayList<>();
		words.add("hello");
		words.add("bottle");
		words.add("laptop");
		words.add("phone");
		words.add("card");

		List<String> expected = new ArrayList<>();
		expected.add("HELLO");
		expected.add("BOTTLE");
		expected.add("LAPTOP");
		expected.add("PHONE");
		expected.add("CARD");

		assertEquals(expected, upper.upperCase(words));
	}

	/**
	 * Executes after every test case
	 */
	@After
	public void tearDown() {
		upper = null;
	}
}
