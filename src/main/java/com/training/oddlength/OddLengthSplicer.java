package com.training.oddlength;

import java.util.ArrayList;
import java.util.List;

/**
 * Class with one method splice
 * @return Returns List of Strings
 * 
 * @author mnivedi1
 *
 */
public class OddLengthSplicer {
	
	public List<String> splice(List<String> list){
		List<String> result = new ArrayList<>();
		list.forEach(word -> {if(word.length()%2 == 0) result.add(word);});
		return result;
	}
}
