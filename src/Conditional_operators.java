
public class Conditional_operators {

	public static void main(String[] args) {

		int a, b;
		a = 20;

		if (a == 50) {
			b = a;

		} else {
			b = 0;
		}

		b = (a == 50) ? a : 100;
		System.out.println("B is :" + b);

	}

}
