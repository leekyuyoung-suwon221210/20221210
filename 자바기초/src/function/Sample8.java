package function;

/*
* Àç±Í È£Ãâ ( Recursive call)
*/

public class Sample8 {

	public static int test(int n) {
		if (n == 1)
			return 1;
		return n + test(n-1);
	}
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		long sum = 0;
		for (int i = 10000; i > 0; i--) {
			sum+= i;
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(end -start);
		
		start = System.currentTimeMillis();		
		sum = test(10000);		
		end = System.currentTimeMillis();
		System.out.println(end -start);
		
		
		
		
		/*
		 * 	5 * test(4)
		 * 	5 * 4 * test(3)
		 *  5 * 4 * 3* test(2)
		 *  5 * 4 * 3* 2 * test(1)
		 *  5 * 4 * 3* 2 * 1
		 */ 
		

	}

}
