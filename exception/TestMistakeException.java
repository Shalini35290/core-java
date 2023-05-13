package com.rays.exception;
//checked exception propagation
public class TestMistakeException {
	public static void main(String[] args) {
		dad();
	}
	public static void dad() {
		try {
			mom();
		}catch (MistakeException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void mom() 
		throws MistakeException {
		son();
	}
	public static void son()
	throws MistakeException{
		MistakeException e= new MistakeException(); 
		throw e;
	}
	
	

}
