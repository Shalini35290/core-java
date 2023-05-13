package com.rays.exception;

public class Excep1 {
	public static void main(String[] args) {
		try {
			
			String name = null;
			name = "Java";
			System.out.println("before");
			System.out.println(name.charAt(5));
			System.out.println("after");
			
			
			} catch(Exception e) {
			System.out.println("Exception");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Finally Block");
			
		}
		
		
	}

}
