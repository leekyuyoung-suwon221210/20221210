package statement;

import java.util.Scanner;

public class Sample4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 키보드 입력이 가능
		System.out.println("문자열 입력(eng)"); // 화면 출력
		String str = sc.next();  // 키보드로부터 문자열을 입력받기
		int len = str.length();  // 문자열의 길이
		
		if(len > 5) 
			System.out.println(str.substring(0,5));		
		else
			System.out.println(str);		
	}

}
