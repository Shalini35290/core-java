package com.rays.cloning;

public class Account implements Cloneable {
	public int balance= 0;
	
	public Account() {
		
	}
	
	public Account(int balance) {
		this.balance= balance;
	}
	public int getBalance() {
		System.out.println(balance);
		return balance;
		
	}
	
@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}	
	
	

}
