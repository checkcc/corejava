package com.finaldemo;

//Note: It is considered as a good practice to have constant names in UPPER CASE(CAPS).
public class FinalVaribleDemo {

	///final int MAX_VALUE = 99;
	int MAX_VALUE = 99;

	void myMethod() {
		MAX_VALUE = 99;
	}

	public static void main(String args[]){  
	      FinalVaribleDemo obj=new  FinalVaribleDemo();  
	      obj.myMethod();  
	   }
	
}