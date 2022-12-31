package loop;

import java.util.Scanner;

/*
 * prim 소수..를 판단하는 프로그램 (1과 자신으로만 나눠지는 수)
 * 
 */
public class Demo6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요(3부터~~");

		int inputNum = sc.nextInt();
		boolean isPrime = true;		
		for (int i = 2; i < inputNum; i++) {
			if(inputNum % i == 0) {				
				isPrime = false;
				break;
			}
		}		
		System.out.println( isPrime? "소수" : "소수가 아님"  );
		
		String name = "ABCDEFG";
		
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.substring(i,i+1));
			
		}
//		for문과 substring을 이용해서
//		A
//		B
//		C
//		D
//		E
//		F
//		G
		
	}

}
