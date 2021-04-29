package com.info;

class A1{
    int a = 10;
    void show() {
        System.out.println("a = "+a);
    }
}

class B1 extends A1{
    int b = 10;
    void showB() {
        System.out.println("b = "+b);
    }
}

public class HybridInheritance extends A1{
	
	public void showC() {
		System.out.println("inside c");
	}
    
    public static void main(String[] args) {
      
    	HybridInheritance c = new HybridInheritance();
        c.show();
       
        B1 b = new B1();
        b.show();
        
       // b.showC();
    }
}
