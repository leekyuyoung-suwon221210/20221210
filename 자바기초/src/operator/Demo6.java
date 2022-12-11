package operator;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		// 4자리수 년도를 입력받아서 해당 년도가 윤년인지 true false
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 4자리 정수로 입력하세요 : ");
		int year = sc.nextInt();
		//조건 식...
//		서력 기원 연수가 4로 나누어 떨어지는 해는 윤년으로 한다. 
//		(1988년, 1992년, 1996년, 2004년, 2008년, 2012년, 2016년, 2020년, 2024년, 2028년, 2032년, 2036년, 2040년, 2044년 ...)
//		서력 기원 연수가 4, 100으로 나누어 떨어지는 해는 평년으로 한다. 
//		(1700년, 1800년, 1900년, 2100년, 2200년, 2300년...)
//		서력 기원 연수가 4, 100, 400으로 나누어 떨어지는 해는 윤년으로 둔다. 
//		(1600년, 2000년, 2400년...)	
		
		boolean isYoon = false;
		isYoon = (year % 4 == 0) &&  (year%100 != 0)  || (year % 400 == 0);
		System.out.println("입력하신 년도 + " + year + "의 윤년여부는 (true/false) " + isYoon);		
//		 나누어 떨어진다..
//		100 % 2 == 0 --> true
		
		

	}

}
