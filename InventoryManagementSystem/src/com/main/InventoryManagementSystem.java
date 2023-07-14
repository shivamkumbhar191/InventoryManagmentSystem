package com.main;

import java.util.Scanner;
import com.controler.ProductControler;

public class InventoryManagementSystem {

	public static void main(String[] args) {
		
		ProductControler pc=new ProductControler();
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to Inventory Management System App");
		char ch;
		do {
			System.out.println("enter the choice");
			System.out.println("1.Add product\n2.Remove Product\n3.Update Product\n4.Display Inventory\n5.Display Total Value\n6.Serach product By product name\n7.Search Product by Category");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:pc.productOperations(choice);
			break;
			case 2:pc.productOperations(choice);
			break;
			case 3:pc.productOperations(choice);
			break;
			case 4:pc.productOperations(choice);
			break;
			case 5:pc.productOperations(choice);
			break;
			case 6:pc.productOperations(choice);
			break;
			case 7:pc.productOperations(choice);
			break;
			default:System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue");
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
		sc.close();
	}

}


