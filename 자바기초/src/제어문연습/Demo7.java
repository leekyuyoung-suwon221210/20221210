package 제어문연습;

import java.util.Scanner;

/*
 * 자동차 보험료.. 나이에따라서  할증
 * 18-20  +100%
 * 21-25  +50%
 * 26-30  +25% 
 * 31-70 0
 * 71-80 +10%
 * 81 -  +20%
 */
public class Demo7 {

	public static void main(String[] args) {
		//  나이를 입력받으면... 최종 보험료 ?
		// 기본 보험료  200만원
		final int BASICINSUARANCE = 200;
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 : ");
		int age = sc.nextInt();
		int money = BASICINSUARANCE;
		if(age>=81)
			money += BASICINSUARANCE*0.2;
		else if(age>=71)
			money += BASICINSUARANCE*0.1;
		else if(age>=31)
			money = BASICINSUARANCE;
		else if(age>=26)
			money += BASICINSUARANCE*0.25;
		else if(age>=21)
			money += BASICINSUARANCE*0.5;
		else if(age>=18)
			money += BASICINSUARANCE*1;
		
		System.out.println(money);
	}

}





