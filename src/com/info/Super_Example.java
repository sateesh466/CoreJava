package com.info;

class Parent1
{
    String name;

}
public class Super_Example extends Parent1 {
    
	String name;
   
    public void details()
    {
        super.name = "Parent";  //refers to parent class member
        name = "Child";
        System.out.println(super.name+" and "+name);
    }
    
    public static void main(String[] args)
    {
    	Super_Example cobj = new Super_Example();
        cobj.details();
    }
}
