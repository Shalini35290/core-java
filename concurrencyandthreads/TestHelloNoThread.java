package com.rays.concurrencyandthreads;

public class TestHelloNoThread {
	public static void main(String[] args) {
		HelloNoThread t1= new HelloNoThread("Shalini");
		HelloNoThread t2= new HelloNoThread("Sonali");
		t1.run();
		t2.run();
		
	}

}
