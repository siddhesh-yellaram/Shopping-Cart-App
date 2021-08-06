package com.techlab.test;
import java.util.*;
import com.techlab.model.*;

public class ShoppingAppTest {
	public static void main(String []args) {
		Product p1 = new Product(1,"PS4",25000);
		Product p2 = new Product(2,"PS5",35000);
		Product p3 = new Product(3,"Acer Laptop",45000);
		Product p4 = new Product(4,"PSP",10000);
		
		LineItem l1 = new LineItem(1,2,p1);
		LineItem l2 = new LineItem(2,3,p2);
		LineItem l3 = new LineItem(3,5,p3);
		LineItem l4 = new LineItem(4,6,p4);
		
		List<LineItem> order1 = new ArrayList<LineItem>();
		order1.add(l1);
		order1.add(l2);
		Order o1 = new Order(1,new Date(),order1);
		
		List<LineItem> order2 = new ArrayList<LineItem>();
		order2.add(l1);
		order2.add(l2);
		Order o2 = new Order(2,new Date(),order2);
		
		List<Order> custom1 = new ArrayList<Order>();
		itemExists(l1);
		custom1.add(o1);
		custom1.add(o2);
		
		Customer c1 =  new Customer(1,"Siddhesh", custom1);
		printInfo(c1);
	}
	 public static void printInfo(Customer c) {
		 System.out.println("Customer Id: "+c.getCid()+" Customer Name: "+c.getCname()+"\nCustomer Orders: ");
		 c.getOrders();
	 }
	 public static void itemExists(LineItem l) {
		 l.lqty += l.getLqty();
	 }
}

