package statement;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int number =  sc.nextInt();		
		System.out.println("입력한 값: " + number);
		
		// 입력한 값이 양수 인지 음수인지	
		
		if (number > 0) {
			System.out.println("양수");	
		} else {
			System.out.println("음수");
		}
		
		System.out.println("정수를 입력하세요");
		number =  sc.nextInt();		
		System.out.println("입력한 값: " + number);
		// 입력한 값이 짝수 인지 홀수인지
		number =  sc.nextInt();
		if(number % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		// 3개를입력을 받아서 최대 와 최소 값을 출력
		System.out.println("정수 3개를 공백을 이용해서 입력하세요 (예 10 20 30)");
		int number1 =  sc.nextInt();		
		int number2 =  sc.nextInt();
		int number3 =  sc.nextInt();
		
		int maxnumber = 0;
		// number1, number2 두 변수중에 가장 큰 값을 찾아서 maxnumber 에 넣어준다
		if(number1 >= number2) {
			maxnumber = number1;		
		}else {
			maxnumber = number2;
		}
		
		maxnumber = (number1 >= number2)? number1 : number2;
		
		maxnumber = (maxnumber >= number3) ? maxnumber : number3;
		
		System.out.println("가장 큰 값은 : " + maxnumber);
				
		// 키보드로 부터 숫자를 입력받아서 변수에 저장(1 ~ 7)
		System.out.println("1~7사이의 임이의 정수를 입력하세요");
		int number4 = sc.nextInt();
		// 저장된 변수가 1~7까지 switch 문을 통해 1이면 월요일 2이면 화요일.... 일요일까지 출력
		
		switch (number4) {
		case 1:
			System.out.println("월");
			break;
		case 2:
			System.out.println("화");
			break;
		case 3:
			System.out.println("수");
			break;
		case 4:
			System.out.println("목");
			break;
		case 5:
			System.out.println("금");
			break;
		case 6:
			System.out.println("토");
			break;
		case 7:
			System.out.println("일");
			break;

		default:
			break;
		}

	}

}
