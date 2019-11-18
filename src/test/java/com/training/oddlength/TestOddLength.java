package com.training.oddlength;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for testing odd length splicer
 * @author mnivedi1
 *
 */
public class TestOddLength {

	List<String> words;
	OddLengthSplicer ols;
	
	/**
	 * Executes before every test case
	 */
	@Before
	public void setup() {
		words = new ArrayList<>();
		ols = new OddLengthSplicer();
		words.add("Hello");
		words.add("Hi");
		words.add("Java");
		words.add("Ola");
	}
	
	/**
	 * Method to test splice() method of OddLengthSplicer class 
	 */
	@Test
	public void testOddLengthSplicer() {
		List<String> expected = new ArrayList<>();
		expected.add("Hi");
		expected.add("Java");
		Assert.assertEquals(expected, ols.splice(words));
	}
}
