package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "orders")
public class Order {
	
	@Id
	@Column(name = "order_id")
	//@Column(name = "order_id", updatable=false, insertable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long order_id;
	
	@Column(name= "prod_order_id")
	String prod_order_id;
	
	@Column(name= "product_id")
	long products_id;
	
	@Column(name= "qty")
	int qty;
	
	@Column(name= "price")
	double price;
	
	@Column(name= "order_on")
	String order_on;
	
	@Column(name= "status")
	int status;
	
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public long getOrder_id() {
		return order_id;
	}



	public void setOrder_id(long order_id) {
		this.order_id = order_id;
	}



	public String getProd_order_id() {
		return prod_order_id;
	}



	public void setProd_order_id(String prod_order_id) {
		this.prod_order_id = prod_order_id;
	}



	public long getProducts_id() {
		return products_id;
	}
	public void setProducts_id(long products_id) {
		this.products_id = products_id;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getOrder_on() {
		return order_on;
	}
	public void setOrder_on(String order_on) {
		this.order_on = order_on;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

}
