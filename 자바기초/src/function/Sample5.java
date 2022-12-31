package function;

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


public class Sample5 {

	public static void showMe() {
		System.out.println("hello");
		System.out.println("world");
	}
	
//	1. 코드의 재 사용
	public static void main(String[] args) {
		
		int number = 10;		
		
		if (number > 10) {
			showMe();
		}else if(number > 5) {
			showMe();			
		}else if(number > 1) {
			showMe();
		}else {
			showMe();
		}
		
		
	}

}
