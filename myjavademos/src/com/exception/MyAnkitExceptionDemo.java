package com.exception;

//custom exception
class MyAnkitException extends Exception {

	public MyAnkitException(String message) {

		super(message); // call this class Exception(String message): Constructs a new exception with
						// the specified detail message.

	}

}

public class MyAnkitExceptionDemo {

	public static void main(String ar[]) {

		try {

			throw new MyAnkitException(" my own Exception");
		}

		catch (MyAnkitException e) {

			System.out.println(" catch....");

		}

	}

}
