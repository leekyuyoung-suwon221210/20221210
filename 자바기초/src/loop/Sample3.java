package loop;

import java.util.Scanner;

/*
 * 다음 그림을 보고 코딩으로 표현
 */
public class Sample3 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("input number : ");
		String strNum =  sc.next();  // 문자열 숫자   "123" 
		int X =  Integer.parseInt(strNum);
		while (X != -1) {
			int Y = 3*X+1;
			System.out.println(Y);
			
			System.out.println("input number : ");
			strNum =  sc.next();  // 문자열 숫자   "123"
			X =  Integer.parseInt(strNum);
					
		}
		

	}

}
