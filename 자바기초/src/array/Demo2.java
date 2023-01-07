package array;

public class Demo2 {

	public static void main(String[] args) {
		String[] names = {"kim","lee","park","choi","jung"};
		/**
		  1. kim
		  2. lee
		  3. park
		  4. choi
		  5. jung
		 */
		for (int i = 0; i < names.length; i++) {
//			System.out.println(i+1 + ". "+names[i]);	
			String output = String.format("%d. %s", i+1, names[i]);
			System.out.println(output);
		}		

	}

}
