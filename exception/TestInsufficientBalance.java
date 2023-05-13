package com.rays.exception;
//custom exception
public class TestInsufficientBalance {
	public static void main(String[] args) {
		try {
			int balance = 1000;
			if(balance<2000) {
				throw new InsufficientBalance();
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.getStackTrace();
		}
	}

}
