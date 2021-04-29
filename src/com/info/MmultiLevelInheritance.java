package com.info;

class A{
    int a = 10;
    void show() {
        System.out.println("a = "+a);
    }
}

class B extends A{
    int b = 10;
    void showB() {    	
        System.out.println("b = "+b);
    }
    
}

public class MmultiLevelInheritance extends B{
    
public static void main(String[] args) {
    
	MmultiLevelInheritance c = new MmultiLevelInheritance();
    c.show();
    c.showB();   
    
    A a= new A();
    
  
    
    }
}