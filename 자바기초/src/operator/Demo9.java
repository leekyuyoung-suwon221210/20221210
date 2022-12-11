package operator;

import java.util.Scanner;

/*
 * 복합 대입연산자
 */
public class Demo9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두개의 정수를 공백을 기준으로 입력(ex 10 20)");
		int num1 =  sc.nextInt();
		int num2 =  sc.nextInt();
		num1 += num2;
		System.out.println(num1);
		num1 -= num2;
		System.out.println(num1);
		num1 = num1 + num2; // num1 += num2;
		System.out.println(num1);
		num1 -= num2;
		System.out.println(num1);
		
		num1 *= num2;
		System.out.println(num1);
		num1 /= num2;
		System.out.println(num1);
				
		
	}

}
