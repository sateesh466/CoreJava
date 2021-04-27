
class A {
	void msg() {
		System.out.println("Hello");
	}
}

class B {
	void msg() {
		System.out.println("Welcome");
	}
}

public class Inheritance_Multiple extends A{//suppose if it were  

	public static void main(String args[]) {
		
		Inheritance_Multiple obj = new Inheritance_Multiple();
		obj.msg();// Now which msg() method would be invoked?
	}
}
