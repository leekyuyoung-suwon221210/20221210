package statement;
/*
 * 조건문 - 조건이 맞으면 실행
 */
import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2자리 이상 정수를 입력하세요 : ");
		int number1 = sc.nextInt();
		// 2527 % 100  -> 27
		// 27 / 10  2
		// 27 % 10  7
		
		// 1. 정수를 입려받아서 10의 자리와 1의 자리를 출력 하고 두 자리가 같으면 같다 틀리다 
		// 1253
		
		int result1 = number1 % 100;
		int result_10 =  result1 / 10;
		int result_1 =  result1 % 10;
		if(result_10 == result_1) {
			System.out.println("10의 자리와 1의 자리가 같다");
		}else {
			System.out.println("10의 자리와 1의 자리가 같지 않다");
		}
		// 2. 물건값이 2800원이고 5000원을 지불하면 거름돈을 어떻게 줘야 하는지출력
		// 천원 : 2장  오백원 : 0개 백원 : 2 
		int price = 2800;
		int myPrice = 5500;  
		int diff = myPrice - price;  // 2200
		
		int won_1000 = diff / 1000;
		int won_500 = (diff % 1000) / 500;
		int won_100 = ((diff % 1000) % 500) / 100;
		System.out.println("천원 : " + won_1000);
		System.out.println("오백원 : " + won_500);
		System.out.println("백원 : " + won_100);

	}

}
