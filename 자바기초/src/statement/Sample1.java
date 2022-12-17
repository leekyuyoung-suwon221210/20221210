package statement;

import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input 1-9 ");
//		int number =  sc.nextInt();
		//  타입전환 또는 타입캐스팅  기본 데이터타입사이에서는 가능
		// 그렇지 않은경우에는 불가능, 가능하게 하려면 기능을 구현(내가 or 시스템)
//		int number = (int)sc.next();
		int number = Integer.parseInt(sc.next()) ;
		
		number = number % 9 + 1;
		System.out.println(number);
		
		
	}

}
