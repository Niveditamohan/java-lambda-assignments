package com.training.uppercase;

import java.util.List;
import java.util.function.UnaryOperator;

/**
 * Class to convert each word in an input string into upper case
 * 
 * @author mnivedi1
 *
 */
public class UpperCaseConverter {

	public List<String> upperCase(List<String> words) {
		UnaryOperator<String> upperCase = word -> word.toUpperCase();
		words.replaceAll(upperCase);
		return words;
	}
}
