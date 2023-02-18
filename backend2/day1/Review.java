package day1;

/*
 * 함수의 매개변수 전달 방법 - 무조건 값을 copy
 * 일반변수 VS 객체(배열)
 * 클래스(첫글자가 대문자) 변수 ---> 객체
 * 클래스외 변수 --> 일반변수
 */

public class Review {
	public static void method(int x, String y, int[] z) {
		x = 100;		
		y = "hong gil dong";
		z[0] = 10000;
	}
	
	public static void main(String[] args) {
		int a = 0;
		String name = "jams";
		int[] b = {0};
		
		method(a, name, b);
		System.out.println(a);  // 0
		System.out.println(name); // jams
		System.out.println(b[0]); // 10000

	}

}
