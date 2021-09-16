package com.finaldemo;

public class BlankVariableDemo{  
	   //Blank final variable
	   final int MAX_VALUE;
		 
	   BlankVariableDemo(){
	      //It must be initialized in constructor
	      MAX_VALUE=100;
	   }
	   void myMethod(){  
	      System.out.println(MAX_VALUE);
	   }  
	   public static void main(String args[]){  
	      BlankVariableDemo obj=new  BlankVariableDemo();  
	      obj.myMethod();  
	   }  
	}