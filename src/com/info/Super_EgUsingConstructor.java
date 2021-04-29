package com.info;


class Parent3
{
    String name;

    public Parent3(String n)
    {
        name = n;
    }

}
public class Super_EgUsingConstructor extends Parent3 {
    
	String name;

    public Super_EgUsingConstructor(String n1, String n2)
    {
        super(n1);       //passing argument to parent class constructor
        this.name = n2;
    }
    
    public void details()
    {
        System.out.println(super.name+" and "+name);
    }
    
  public static void main(String[] args)
    {
    	 Super_EgUsingConstructor cobj = new Super_EgUsingConstructor("Parent","Child");
        
    	 cobj.details();
    }
}
