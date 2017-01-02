package com.web;

import java.io.Serializable;
import java.sql.Date;

public class Product  implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private String no;
	private double price;
	private Date birth;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", no=" + no + ", price=" + price
				+ ", birth=" + birth + "]";
	}
	
	
}
