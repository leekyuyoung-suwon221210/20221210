package java_4day;

// 변수 만들기  :  변수타입 변수명
// 변수 사용하기  : 변수명

// 함수 만들기  : 00 00 00 함수명()
// 함수 사용하기 : 함수명()
public class Demo2 {	
	// 사용자 정의 함수
	public static int sum(int x1, int x2) {
		int sum = 0;
		for (int i = x1; i <= x2; i++) {
			sum += i;
		}
		return sum;
	}
	
	// 메인 함수
	public static void main(String[] args) {
		// 시스템 함수
		System.out.println("sum = " + sum(1,10));
		System.out.println("sum = " + sum(10,100));
		System.out.println("sum = " + sum(100,1000));
	}

}
