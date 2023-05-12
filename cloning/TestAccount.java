package com.rays.cloning;

public class TestAccount {
	public static void main(String[] args) throws CloneNotSupportedException {
		Account a1= new Account(10);
		Account a2= (Account)a1.clone();
		//Account a2= (Account)a1.clone();
		a2.balance =20;
		a1.getBalance();
		a2.getBalance();
		
		
	}

}
