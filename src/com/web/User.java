package com.web;

import java.util.Date;


public class User
{
	private String name;
	private String pass;
	private int age;
	private Date birth;

	public void setName(String name) 
	{
		this.name = name; 
	}

	public void setPass(String pass)
	{
		this.pass = pass; 
	}

	public void setAge(int age)
	{
		this.age = age; 
	}

	public void setBirth(Date birth) 
	{
		this.birth = birth; 
	}

	public String getName()
	{
		return (this.name); 
	}

	public String getPass() 
	{
		return (this.pass); 
	}

	public int getAge() {
		return (this.age); 
	}

	public Date getBirth()
	{
		return (this.birth); 
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", pass=" + pass + ", age=" + age
				+ ", birth=" + birth + "]";
	}
	

}