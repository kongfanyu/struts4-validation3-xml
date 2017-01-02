package com.web;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ProductAction2 extends ActionSupport  implements ModelDriven<Product>{
	private Product product = new Product();
	public String saveProduct() throws Exception {
		System.out.println("===22222222222222=======");
		System.out.println(product);
		//执行业务的save方法
		return SUCCESS;
	}
	
	public String deleteProduct(){
		System.out.println("=======deleteProduct=====");
		System.out.println("====删除的编号====="+product.getNo());
		return SUCCESS;
	}
	
	
	@Override
	public void validate() {
		System.out.println("===111111111111111=======");
		if( product.getName() == null){
			addFieldError("name", "产品名称不能为空");
		} else {
			if(product.getName().length() < 6 ){
				addFieldError("name", "产品名称长度不能小于6个字符.");
			}
		}
		
		if( product.getPrice() < 50 ){
			addFieldError("price", "产品价格不能小于 100元.");
		}
		
	}
	
	
	@Override
	public Product getModel() {
		return product;
	}
	
}
