
public class CallByValue_Example {

	public void callByValue(int x) {
		x = 100;
	}

	public static void main(String[] args) {
		int x = 50;
		
		CallByValue_Example t = new CallByValue_Example();
		
		t.callByValue(x); 
		System.out.println(x);
	}

}
