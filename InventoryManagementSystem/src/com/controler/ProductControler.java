package com.controler;

import com.service.EmptyInventoryException;
import com.service.NotFoundException;
import com.serviceimplementation.ProductImplementation;

public class ProductControler {
	ProductImplementation pml=new ProductImplementation();
	
	public void productOperations(int choice) {
		switch(choice) {
		case 1:pml.addProduct();
		break;
		case 2:
			try{
				pml.removeProduct();
			}catch(NotFoundException nf) {
				nf.getMessage();
			}catch(EmptyInventoryException e) {
				e.getMessage();
			}
		break;
		case 3:
			try{
				pml.updateInventory();
			}catch(NotFoundException nf) {
				nf.getMessage();
			}catch(EmptyInventoryException e) {
				e.getMessage();
			}
		break;
		case 4:
			try{
				pml.displayInventory();
			}catch(NotFoundException nf) {
				nf.getMessage();
			}catch(EmptyInventoryException e) {
				e.getMessage();
			}
		break;
		case 5:
			try{
				pml.disaplyTotalValue();
			}catch(NotFoundException nf) {
				nf.getMessage();
			}catch(EmptyInventoryException e) {
				e.getMessage();
			}
		break;
		case 6:
			try{
				pml.searchByName();
			}catch(NotFoundException nf) {
				nf.getMessage();
			}catch(EmptyInventoryException e) {
				e.getMessage();
			}
		break;
		case 7:
			try{
				pml.searchByCategory();
			}catch(NotFoundException nf) {
				nf.getMessage();
			}catch(EmptyInventoryException e) {
				e.getMessage();
			}
		break;
		default:System.out.println("Invalid choice");
		}
		
	}
}
