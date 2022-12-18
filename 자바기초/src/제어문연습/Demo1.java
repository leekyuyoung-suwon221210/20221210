package 제어문연습;

import java.util.Scanner;
/**
 *  단위 가격 : 10
 *  인원수 : x
 *  total : 10 * x
 *  조건 : 인원수가 20명이상이면 20% 할인 해서 총금액와 할인금액 출력
 */
public class Demo1 {

	public static void main(String[] args) {
		final int TICKET_PRICE = 10;		// 상수형변수
						
		// 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("입장객수(정수) : ");
		int numPeople = sc.nextInt();
		
		long amt = numPeople * TICKET_PRICE; 
		System.out.println("합계 : " + amt);
		
		if(numPeople>=20) {
			int discountAmt = (int)Math.round(amt*0.2);
			System.out.println(discountAmt);
			long finalAmt = amt - (long)discountAmt;
			System.out.println(finalAmt);
		}
	}

}
