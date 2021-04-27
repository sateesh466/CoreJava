
public class Static_Example {

	static int num;
	static String mystr;
	
	static {
		num = 97;
		mystr = "Static keyword in Java";
		
		System.out.println(mystr);
	}

	// This is a static method
	static void myMethod() {
		System.out.println("myMethod");
	}
	
	void test(){
		System.out.println("Inside Test");
	}

	public static void main(String[] args) {
		/*
		 * You can see that we are calling this method without creating any object.
		 */
		Static_Example.myMethod();
		
		Static_Example obj = new Static_Example();
		
		obj.test();
	}

}
