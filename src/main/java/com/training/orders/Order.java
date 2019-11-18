package com.training.orders;

public class Order {

	/**
	 * Fields/ attributes of Order object
	 */
	private double orderPrice;
	private String orderStatus;
	
	/**
	 * Default constructor
	 */
	public Order() {
	}

	/**
	 * Parameterized constructor
	 * @param orderPrice
	 * @param orderStatus
	 */
	public Order(double orderPrice, String orderStatus) {
		super();
		this.orderPrice = orderPrice;
		this.orderStatus = orderStatus;
	}

	/**
	 * Getters and setters for all attributes of order object
	 */
	public double getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	/**
	 * Overridden toString() method
	 */
	@Override
	public String toString() {
		return "Order Price: " + orderPrice + ", Order Status: " + orderStatus;
	}
	
}
