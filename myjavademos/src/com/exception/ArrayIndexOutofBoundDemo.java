package com.exception;

//handle by java
public class ArrayIndexOutOfboundDemo {

	public static void main(String ar[]) {

		int array[] = { 1, 2, 3, 4 };

		try {

			System.out.println(array[6]);
		}

		catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Got some techical problem..come back soon" + e);
		}

	}

}
