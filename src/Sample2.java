
public class Sample2 {

	int rollno;
	String name;
	float fee;

	Sample2(int rollno, String name, float fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
		
		//System.out.println("Inside constructor :"+r);
	}

	void display() {
		System.out.println(rollno );
		System.out.println(name );
		System.out.println(fee );
	}
}
