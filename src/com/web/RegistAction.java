package com.web;

import com.opensymphony.xwork2.ActionSupport;
public class RegistAction extends ActionSupport
{
	private User user;
	
	public void setUser(User user)
	{
		this.user = user; 
	}

	public User getUser() 
	{
		return (this.user); 
	}
}