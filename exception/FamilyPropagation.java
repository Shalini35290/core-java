package com.rays.exception;
//unchecked exception
public class FamilyPropagation {
	public static void main(String[] args) {
		dad();
	}
	public static void dad() {
		try {
			mom();
		}catch(RuntimeException e) {
			System.out.println("caught by Dad,raised by son");
		}
	}
	public static void mom() {
		son();
		
	}
	public static void son() {
		RuntimeException e = new RuntimeException("I made a mistake");
		throw e;
	}


}
