package com.training.calculate;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test class for calculation
 * @author mnivedi1
 *
 */
public class TestCalculation {

	/**
	 * Lambda expressions to implement 
	 * addition, subtraction, multiplication & division
	 */
	Calculator add = (a,b) -> a + b;
	Calculator subtract = (a,b) -> a - b;
	Calculator multiply = (a,b) -> a * b;
	Calculator divide = (a,b) -> a / b;
	
	/**
	 * Method to test addition
	 */
	@Test
	public void testAddition() {
		assertEquals(15,add.calculate(5, 10), 0.02);
	}
	
	/**
	 * Method to test subtraction
	 */
	@Test
	public void testSubtraction() {
		assertEquals(-5,subtract.calculate(5, 10), 0.02);
	}
	
	/**
	 * Method to test multiplication
	 */
	@Test
	public void testMultiplication() {
		assertEquals(50,multiply.calculate(5, 10), 0.02);
	}
	
	/**
	 * Method to test division
	 */
	@Test
	public void testDivision() {
		assertEquals(5,divide.calculate(50, 10), 0.02);
	}
}
