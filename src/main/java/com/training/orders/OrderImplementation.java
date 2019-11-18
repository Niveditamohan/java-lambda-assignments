package com.training.orders;

import java.util.ArrayList;
import java.util.List;
/**
 * Class that implements OrderFunctionalInterface
 * and overrides the check() method
 * 
 * @author mnivedi1
 *
 */
public class OrderImplementation implements OrderFunctionalInterface{

	/**
	 * Default constructor
	 */
	public OrderImplementation() {
	}
	
	@Override
	public List<Order> check(List<Order> orders) {
		List<Order> result = new ArrayList<>();
		orders.forEach(order -> {if(order.getOrderPrice()>10000 && order.getOrderStatus().equals("Confirmed")) result.add(order);});
		return result;
	}

}
