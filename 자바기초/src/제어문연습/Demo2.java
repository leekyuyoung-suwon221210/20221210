package 제어문연습;

import java.util.Scanner;
/**
 *  놀이기구 키 제한 130cm 보다 작으면 이용 불가
 *  이용 가능 여부를알려주는 프로그램
 */
public class Demo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("키를입력하세요 : ");
		int height =  sc.nextInt();
//		if(height < 130)
//			System.out.println("It's not available");
//		else
//			System.out.println("It's available");
		
		// 3항 연산자로 
//		String str = (height < 130)? "It's not available" : "It's available";
//		System.out.println(str);
		
		// if문 하나만 사용
		String str = "It's available";
		if(height < 130)
			str = "It's not available";
		System.out.println(str);
		
		
		
	}

}
