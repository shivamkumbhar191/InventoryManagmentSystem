package com.service;

public class EmptyInventoryException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public EmptyInventoryException() {
		System.out.println("Inventory is Empty");
	}
	public EmptyInventoryException(String message) {
		super(message);
	}

}
