package com.techlab.model;

import java.util.Iterator;
import java.util.List;

public class Customer {
	private int cid;
	private String cname;
	List<Order> o1;
	
	public Customer(int cid, String cname, List<Order> o1) {
		this.cid = cid;
		this.cname = cname;
		this.o1 = o1;
	}
	
	public int getCid() {
		return this.cid;
	}
	
	public String getCname() {
		return this.cname;
	}
	
	public void getOrders() {
		Iterator<Order> itr = this.o1.iterator();
		while(itr.hasNext()) {
			Order currentOrder = itr.next();
			System.out.println(currentOrder.getOid()+" "+currentOrder.getDate()+" ");
			currentOrder.getLineItems();
		}
	}
}
