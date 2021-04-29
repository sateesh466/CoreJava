package com.demo;

public class Demo {

	private int a = 10;

	
	private void show() {
		System.out.println(a);
	}
	
	  void callingShow() {
		
		System.out.println("Inside public method");
		 show();
	}

}
