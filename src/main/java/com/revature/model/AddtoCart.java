package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name= "add_to_cart")
public class AddtoCart {
	
	@Id
	@Column(name = "addcart_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long addcart_id;;
	
//	
//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
//	@Column(name= "product_id")
//	String product_id;
	
	@Column(name= "product_id")
	long product_id;
	
	@Column(name= "qty")
	int qty;
	
	@Column(name= "price")
	double price;
	
	@Column(name= "added_date")
	String added_date;
	
	Long user_id;
	
	
	
	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public AddtoCart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public long getAddcart_id() {
		return addcart_id;
	}

	public void setAddcart_id(long addcart_id) {
		this.addcart_id = addcart_id;
	}

	public long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(long productId) {
		this.product_id = productId;
	}
	public int getQty() {
		return qty;
	}
//	public String getProduct_id() {
//		return product_id;
//	}
//
//	public void setProduct_id(String product_id) {
//		this.product_id = product_id;
//	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAdded_date() {
		return added_date;
	}
	public void setAdded_date(String added_date) {
		this.added_date = added_date;
	}
	
	

}
