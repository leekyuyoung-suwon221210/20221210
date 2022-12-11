package statement;
/*
 * 조건문 - 조건이 맞으면 실행
 */
import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		int enterPrice = 15000;
		// 나이를 입력받아서 18세 이상이면 정가를 다 받고
		// 그렇지 않으면 20% 할인해서 
		// 총 결제 금액을 출력  if ~ else
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요");
		int age = sc.nextInt();
		
		if( !(age >= 18) ) {
			int price = (int)(enterPrice * 0.8);
			System.out.println(price);
		}else {
			System.out.println(enterPrice);
		}
		

	}

}
