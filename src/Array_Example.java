
public class Array_Example {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		arr[0] = 10;
		arr[4] = 20;
		
		for (int x : arr) {
			//System.out.println(x);
		}
		
		int [] arrObj = {10,20,30,40,50};
		
		for (int k : arrObj) {
			System.out.println(k);
			
			System.out.println(arrObj.length);
		}
		
		/*
		 * for(Datatype variableName: collectionObject) {
		 * 
		 * }
		 */
		
	}

}
