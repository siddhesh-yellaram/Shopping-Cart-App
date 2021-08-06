package com.techlab.model;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Order {
	private int oid;
	private Date date;
	List<LineItem> l1;
	
	public Order(int oid, Date date, List<LineItem> l1) {
		this.oid = oid;
		this.date = date;
		this.l1 = l1;
	}
	
	public int getOid() {
		return this.oid;
	}
	
	public Date getDate() {
		return this.date;
	}
	
	public void getLineItems() {
		Iterator<LineItem> itr = this.l1.iterator();
		while(itr.hasNext()) {
			LineItem currentLineItem = itr.next();
			System.out.println(currentLineItem.getLid()+" "+currentLineItem.getLqty()+" "+currentLineItem.getProduct()+" ");
		}
	}
}
