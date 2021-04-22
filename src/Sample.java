
public class Sample {
	
	int a;
	int b;
	
	Sample (){
		
		System.out.println(a);
		System.out.println(b);
	}
	
	Sample (int c,int d){
		
		this.a=c;
		this.b=d;		
		
		System.out.println(a);
		System.out.println(b);
	}
	
	Sample (int c){
		
		this.a=c;
		this.b=0;		
		
		System.out.println(a);
		System.out.println(b);
	}
	
	
	public int add() {
		
		return a+b;
		
	}
	
	private void sub() {
		//System.out.println(a-b);
	}
	
	
}
