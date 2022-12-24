package statement;

import java.util.Scanner;

public class Sample7 {

	public static void main(String[] args) {
		System.out.println("문자열  3개를 공백을 기준으로 입력");
		Scanner sc = new Scanner(System.in);
		String strNum1 =  sc.next();  // 화면으로 부터 문자열을 입력
		String strNum2 =  sc.next();  // 화면으로 부터 문자열을 입력
		String strNum3 =  sc.next();  // 화면으로 부터 문자열을 입력
		
		int score = 0;
		
		if(strNum2.equals(strNum3))
			score += 2;
		else
			score += 1;
		
		
		if(strNum1.equals(strNum2)) 
			score += 2;
		else
			score += 1;					
		
		
		System.out.println(score);
		

	}

}
