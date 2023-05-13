package com.rays.exception;

public class Account {
	private int balance= 0;
	
	public int getBalance() {
		return balance;
		
	}
	public void setBalance(int balance) {
		this.balance= balance;
	}
	
	public void deposite(int amount) {
		int total = getBalance()+amount;
		setBalance(total);
		System.out.println(getBalance());
		
		}
	
	public void withdrawl(int amount) {
		int total = getBalance()- amount;
		if(total>=2000) {
			setBalance(total);
			System.out.println(getBalance());
		} else {
			System.out.println("Insufficient Balance...!!!!!");
		}
		
	}
	
	

}
