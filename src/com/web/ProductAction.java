package com.web;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ProductAction extends ActionSupport  implements ModelDriven<Product>{
	private Product product = new Product();
	public String saveProduct() throws Exception {
		System.out.println(product);
		
		//1. 在业务方法校验 可以对任何字段进行校验
		if( product.getPrice() <100 ){
			String info = "价格不能小于 100 元.";
			addFieldError("price", info);
			return INPUT;
		}
		
		
		//执行业务的save方法
		
		return SUCCESS;
	}
	@Override
	public Product getModel() {
		return product;
	}
	
}
