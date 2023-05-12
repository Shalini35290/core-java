package com.rays.cloning;

public class TestCustomer {
	public static void main(String[] args) throws CloneNotSupportedException {
		Customer c1= new Customer("Shanu");
		Customer c2= (Customer)c1.clone();
		c2.name  = "shalini";
		c2.account.balance = 20;
		c1.getName();
		c1.account.getBalance();
		c2.getName();
		c2.account.getBalance();
	}
	

}
