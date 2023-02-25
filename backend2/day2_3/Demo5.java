package day2_3;

import java.util.StringTokenizer;

public class Demo5 {

	// RuntimeException 계열... 검사를 하지 않고 실행시 exception이 발생
	public static void main(String[] args) {
		String s = "Time is money";
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) {
			System.out.println( st.nextToken() );
		}
//		System.out.println( st.nextToken() );
		
		int[] ary = {1,2,3};
		System.out.println(ary[3]);

	}

}
