package com.info;

class Parent2
{
    String name;
   
    public void details()
    {
      name = "Parent";
        System.out.println(name);
    }
}
public class Super_Example2 extends Parent2 {
    String name;
    
    public void details()
    {
        super.details();	//calling Parent class details() method
        name = "Child";
        System.out.println(name);
    }
    public static void main(String[] args)
    {
    	Super_Example2 cobj = new Super_Example2();
        cobj.details();
    }
}
