package 제어문연습;
/*
 * 공백을 기준으로 값을 3개를 받는데.. 두개는 정수 나머지한개는 + - * /
 * ex)  10 + 5 
 * 15
 * 
 * ex)  10 / 5
 * 2
 */
import java.util.Scanner;
public class Demo6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("공백을 기준으로 1 + 2 와 같이 입력:");
		int num1 = sc.nextInt();
		String op = sc.next();
		int num2 = sc.nextInt();
		switch (op) {
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":			
			System.out.println(num1-num2);
			break;
		case "*":			
			System.out.println(num1*num2);
			break;
		case "/":		
			if(num2 == 0) {
				System.out.println("0으로 나눌수 없습니다.");
			}else {
				System.out.println(num1/num2);
			}
			break;
		default:
			break;
		}
	}

}
