package function;

import java.util.Scanner;

/* 함수의 정의 : 명령어들의 집합
 * 
 * 함수 만드는 방법 또는 모양
 * 1 입력x    출력x  - void
 * 2 입력o 출력o
 * 3 입력x  출력o
 * 4 입력o 출력x - void
 * 
 * 함수를 사용하는 이유
 * 1. 코드의 재 사용 - 패턴의 재 사용
 * 2. 복잡한 코드를 간결하게 사용 - 일관된 로직을 함수로 만들어서 즉 함수명을 적절하게 네이밍해서 해당 기능을 추상적으로 설명 가능* 
 * 
 * 
 * 좋은 프로그램
 * 가독성이 높은코드 - 함수 ( 책의 목차)
 * 함수는 그 기능에 충실해야 한다. - 좋은 함수 만드는 방법
 * 너무 많으 기능을 넣지 말것... 기능이 많으면 여러개의 함수로 분할한다. -- 레고블럭
 */


//	1. 코드의 재 사용
public class Sample6 {	
	
	public static void gugudanDan(int dan) {
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d\n",dan, i, dan*i );			
		}
	}
	
	public static int inputGuGuDanDan() {
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		return dan;
	}
	
	public static void main(String[] args) {
		// 단수를 입력받아서 해당 단 출력		
//		System.out.println("구구단 단수를 입력하세요 : ");
//		
//		int dan = inputGuGuDanDan(); // 입력
		
		for (int i = 2; i < 10; i++) {
			gugudanDan(i);  // 처리			
		}
		
//		System.out.println("2 x 1 = 2");
//		System.out.println("2 x 2 = 4");
//		System.out.println("2 x 3 = 6");
//		System.out.println("2 x 4 = 8");
//		System.out.println("2 x 5 = 10");
//		System.out.println("2 x 6 = 12");
//		System.out.println("2 x 7 = 14");
//		System.out.println("2 x 8 = 16");
//		System.out.println("2 x 9 = 18");
		
		
	}

}
