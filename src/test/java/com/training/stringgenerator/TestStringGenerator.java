package com.training.stringgenerator;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestStringGenerator {

	private StringGenerator sg;

	/**
	 * Executes before every test case
	 */
	@Before
	public void setup() {
		sg = new StringGenerator();
	}

	/**
	 * Method to test the generate() method of String Generator class
	 */
	@Test
	public void testGenerate() {
		List<String> words = new ArrayList<>();
		words.add("This");
		words.add("is");
		words.add("iTransform");
		words.add("training");
		words.add("for");
		words.add("Java");

		String expected = "TiitfJ";
		Assert.assertEquals(expected, sg.generate(words));
	}
	
	/**
	 * Method to test the generate() method of String Generator class
	 * for incorrect 'expected' output
	 */
	@Test
	public void testGenerateForInvalidExpectedOutput() {
		List<String> words = new ArrayList<>();
		words.add("This");
		words.add("is");
		words.add("iTransform");
		words.add("training");
		words.add("for");
		words.add("Java");

		String expected = "tiitfj";
		Assert.assertNotEquals(expected, sg.generate(words));
	}
	
	/**
	 * Executes after every test case
	 */
	@After
	public void tearDown() {
		sg = null;
	}
}
