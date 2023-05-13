package com.rays.exception;
//checked exception propagation
public class MistakeException extends Exception {
	public MistakeException() {
		super("I made mistake");
	}

}
