package com.training.stringgenerator;

import java.util.List;

/**
 * Class that has one method i.e. generate() which uses StringBuilder to create
 * a string and then returns it
 * 
 * @author mnivedi1
 *
 */
public class StringGenerator {

	public String generate(List<String> words) {
		StringBuilder sb = new StringBuilder();
		words.forEach(word -> sb.append(word.charAt(0)));
		return sb.toString();
	}
}
