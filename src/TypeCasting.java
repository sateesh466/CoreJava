
public class TypeCasting {

	public static void main(String[] args) {

		int i = 100;
		long l = i; // no explicit type casting required
		float f = l; // no explicit type casting required
		System.out.println("Int value " + i);
		System.out.println("Long value " + l);
		System.out.println("Float value " + f);

		/*
		 * double d = 100.04; long l = (long)d; //explicit type casting required int i =
		 * (int)l; //explicit type casting required
		 * 
		 * System.out.println("Double value "+d); System.out.println("Long value "+l);
		 * System.out.println("Int value "+i);
		 */
	}

}
