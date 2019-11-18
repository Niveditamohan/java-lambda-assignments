package com.training.orders;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.training.orders.Order;
import com.training.orders.OrderImplementation;

/**
 * Test class to test orders
 * @author mnivedi1
 *
 */
public class TestOrders {

	List<Order> orders;
	List<Order> resultList;
	OrderImplementation impl;
	
	/**
	 * Executes before every test case
	 */
	@Before
	public void setup() {
		impl = new OrderImplementation();
		orders = new ArrayList<>();
		
		Order o1 = new Order(15000, "Confirmed");
		Order o2 = new Order(9000, "Confirmed");
		Order o3 = new Order(10000, "Pending");
		Order o4 = new Order(15000, "Pending");
		Order o5 = new Order(25000, "Confirmed");
		orders.add(o1);
		orders.add(o2);
		orders.add(o3);
		orders.add(o4);
		orders.add(o5);
		
		resultList = new ArrayList<>();
		resultList.add(o1);
		resultList.add(o5);
		
	}
	
	/**
	 * Method to test whether the result of the lambda expression 
	 * in OrderImplementation class is correct
	 */
	@Test
	public void testOrders() {
		Assert.assertEquals(resultList, impl.check(orders));
	}
}
