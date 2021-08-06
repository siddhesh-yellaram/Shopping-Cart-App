package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LineItemTest {

	@Test
	void test_Id() {
		int expectedLid = 1;
		Product p1 = new Product(1,"PS4", 27000);
		LineItem l1 = new LineItem(1,3,p1);
		assertEquals(expectedLid, l1.getLid());
	}
	
	@Test
	void test_Qty() {
		int expectedQty = 1;
		Product p2 = new Product(2,"PS5", 35000);
		LineItem l2 = new LineItem(2,1,p2);
		assertEquals(expectedQty, l2.getLqty());
	}
	
	@Test
	void test_Product() {
		Product expectedProduct = new Product(3,"PS3", 20000);
		Product p3 = expectedProduct;
		LineItem l3 = new LineItem(3,2,p3);
		assertEquals(expectedProduct, l3.getProduct());
	}
	
	@Test
	void test_Cost() {
		double expectedCost = 2*15000;
		Product p4 = new Product(4, "PSP", 15000);
		LineItem l4 = new LineItem(3,2,p4);
		assertEquals(expectedCost, l4.getCost());
	}
}
