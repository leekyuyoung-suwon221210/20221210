package java_4day;

import java.util.Scanner;

public class Demo6 {

	// 사용자로 부터 값을 입력을 받아서(2개)
	// 4칙연산을 하는 프로그램
	public static void main(String[] args) {
		int number1 = getDataFromConsole();
		int number2 = getDataFromConsole();
		
		calcProcess4(number1,number2);
		

	}
	// 데이터 입력받기 (정수형)
	public static int getDataFromConsole() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int number1 = sc.nextInt();
		return number1;
	}
	
	public static void calcProcess4(int n1, int n2) {
		System.out.println("+ : " + (n1 + n2) );
		System.out.println("- : " + (n1 - n2) );
		System.out.println("x : " + (n1 * n2) );
		if(n2 == 0) {
			System.out.println("0으로 나눌수 없습니다. ");
			return;
		}
		System.out.println("/ : " + (n1 / n2) );
	}

}
