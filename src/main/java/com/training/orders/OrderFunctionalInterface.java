package com.training.orders;

import java.util.List;

/**
 * Functional interface with one abstract method print() 
 * @author mnivedi1
 *
 */
public interface OrderFunctionalInterface {
	
	List<Order> check(List<Order> order);
}
