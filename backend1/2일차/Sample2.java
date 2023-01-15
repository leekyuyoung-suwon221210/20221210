package backend1_기본입출력;

import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args) {
		// 키보드 입력을 받기위한 객체(변수) 를 생성
		Scanner in = new Scanner(System.in);

		// 기다린다... 사용자가 키보드로부터 값을 입력하기전가지 대기 문자열로 반환한다.
		System.out.println("값을 입력하세요");
		String input = in.next();
		
		System.out.printf("입력한 값은 %s 입니다.\n",input);
		
		System.out.println("프로그램종료");

	}

}
