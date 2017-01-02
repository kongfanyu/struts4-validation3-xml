package com.web;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ProductAction4 extends ActionSupport {
	private Product product;
	private String name;
	private int  age;
	private double myprice;
	private String no;
	
	public String saveProduct() throws Exception {
		System.out.println("===saveProduct=======");
		System.out.println(product);
		//执行业务的save方法
		return SUCCESS;
	}
	
	public String deleteProduct(){
		System.out.println("=======deleteProduct=====");
		System.out.println("====删除的编号=product.getNo()===="+no);
		return SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMyprice() {
		return myprice;
	}

	public void setMyprice(double myprice) {
		this.myprice = myprice;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}
	
	
}
