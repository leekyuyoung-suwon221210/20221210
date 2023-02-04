package java_5day;
/*
 * 정수형 변수 두개 를 받아서 최대값을 출력하는 함수
 * 실수형 변수 두개 를 받아서 최대값을 리턴하는 함수
 * 메소드 overloading
 */
public class Demo3 {

	public static void main(String[] args) {
		int a = 10, b = 20;
		max(a,b);
		double d1 = 12.89, d2 = 9.98;
		System.out.println( max(d1,d2));

	}
	
	public static void max(int a, int b) {
		System.out.println( (a > b)? a : b );
	}
	
	public static double max(double a, double b) {
		return (a > b)? a : b;
	}

}
