package com.rays.cloning;

public class Customer implements Cloneable {
	public String name= null;
	public Account account= null;
	
	public Customer(String name) {
	this.name = name;
	account= new Account(10);
	}
	
	public String getName() {
		System.out.println(name);
		return name;
		
	}
	public Account getAccount() {
		System.out.println(account);
		return account;
		
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer c = (Customer)super.clone();
		c.account = (Account)account.clone();
		return c ;
		}
	
	
		
	
	
	

}
