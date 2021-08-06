package com.techlab.model;

public class LineItem {
	private int lid;
	public int lqty;
	public double cost;
	Product p1;
	
	public LineItem(int lid, int lqty, Product p1) {
		this.lid = lid;
		this.lqty = lqty;
		this.p1 = p1;
		this.cost=p1.getPcost()*lqty;
	}

	public int getLid() {
		return lid;
	}

	public int getLqty() {
		return lqty;
	}

	public Product getProduct() {
		//return p1.getPid()+" "+p1.getPname()+" "+p1.getPcost();
		return this.p1;
	}
	
	public double getCost() {
		return this.cost;
	}
}
