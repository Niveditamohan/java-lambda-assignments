package com.training.oddlength;

import java.util.List;

/**
 * Class with one method splice that uses removeIf() 
 * method of Collection interface
 * 
 * @return Returns List of Strings
 * 
 * @author mnivedi1
 *
 */
public class OddLengthSplicer {
	
	public List<String> splice(List<String> list){
		list.removeIf(word -> word.length()%2 != 0);
		return list;
	}
}
