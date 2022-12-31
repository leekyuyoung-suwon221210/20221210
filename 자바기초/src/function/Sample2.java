package function;

/* 함수의 정의 : 명령어들의 집합
 * 
 * 함수 만드는 방법 또는 모양
 * 1 입력x - void   출력x
 * 2 입력o 출력o
 * 3 입력x - void 출력o
 * 4 입력o 출력x
 * 
 * 함수를 사용하는 이유
 * 1. 코드의 재 사용
 * 2. 복잡한 코드를 간결하게 사용 - 일관된 로직을 함수로 만들어서 즉 함수명을 적절하게 네이밍해서 해당 기능을 추상적으로 설명 가능
 * 
 * 좋은 프로그램
 * 가독성이 높은코드 - 함수 ( 책의 목차)
 */
public class Sample2 {

	public static int addnum(int a, int b) // 지역변수
	{
		return a+b;
	}
	
	public static void main(String[] args) {
		System.out.println("함수 호출 전");
		int a = 10, b = 20;
//		addnum(10 , 20);
		int c = addnum(a,b);
		System.out.println("함수 호출 후");
		
		
		
		
	}

}
