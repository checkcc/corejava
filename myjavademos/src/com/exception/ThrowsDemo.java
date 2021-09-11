package com.exception;

public class ThrowsDemo {
//method level for throws
	static void validate(int age) throws ArithmeticException {

		if (age < 18) {
			throw  new ArithmeticException(" not valid"); //create an object using throw  rethrow
		}

	}

	public static void main(String ar[]) {

		try {
			validate(12);  //caller
		} catch (Exception e) {

			System.out.println("  handled  here and not validate");
		}
	}

}
