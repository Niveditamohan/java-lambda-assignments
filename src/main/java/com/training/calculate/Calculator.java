package com.training.calculate;

/** 
 * Functional Interface Calculator with one abstract method calculate()
 * @author mnivedi1
 *
 */
@FunctionalInterface
public interface Calculator {
	
	float calculate(int x, int y);
	
}
