
public class This_Example2 {
	
	String name ;
	int  age;
	
	This_Example2(){
		
		this.name = "google";
		this.age = 25;
		
	}

	public static void main(String[] args) {

		This_Example2 obj = new This_Example2();

		obj.methodTwo();
	}

	void methodOne() {
		System.out.println("Inside Method ONE" );
	}

	void methodTwo() {
		
		System.out.println(name);
		System.out.println(age);
		
		methodOne();  // same as calling methodOne()
	}

}
