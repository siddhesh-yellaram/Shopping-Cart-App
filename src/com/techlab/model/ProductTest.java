package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductTest {

	@Test
	void testProduct() {
		int expectedPId = 101;
		String expectedPName = "PS5";
		int expectedPCost = 35000;
		Product p1 = new Product(expectedPId, expectedPName, expectedPCost);
		int actualPId = p1.getPid();
		String actualPName = p1.getPname();
		int actualPCost = p1.getPcost();
		assertEquals(expectedPId, actualPId);
		assertEquals(expectedPName, actualPName);
		assertEquals(expectedPCost, actualPCost);
	}

}
