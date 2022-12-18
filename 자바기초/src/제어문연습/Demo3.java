package 제어문연습;

import java.util.Scanner;

/**
 *  소포요금 3kg 미만은 3원
 *  1kg 초과할때마다 0.5원 씩 부과
 *  3<= weight < 4  3.5
 *  4<= weight < 5  4.0 
 */
public class Demo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("무게를 입력하세요 : ");
		int weight = sc.nextInt();
		double total = 3.0;
		if(weight < 3)
			System.out.println(3);
		else {
			 total = 3.0  +  ((weight - 3.0 + 1.0)+0.5);			
		}
		System.out.println(total);
	}

}
