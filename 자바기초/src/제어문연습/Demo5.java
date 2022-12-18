package 제어문연습;

import java.util.Random;
import java.util.Scanner;

/*
 * 가위 :1  바위:2  보:3 
 */
public class Demo5 {

	public static void main(String[] args) {
//		Math.random();   // 0~1 사이의 실수
//		Math.random()*10; // 0~10 사이의 실수
//		int com = (int)((Math.random()*10)%3) ; // 0 1 2
		int com = (int)((Math.random()*10) % 3 + 1) ; // 1 2 3
		Scanner sc = new Scanner(System.in);
		System.out.println("가위(1) 바위(2) 보(3) : ");
		int human =  sc.nextInt();
		
		// 내가 이긴다 진다.
//		if(
//				(com == 1 && human ==2) 
//				|| ( com == 2 && human == 3) 
//				|| ( com == 3 && human == 1) 
//		) 
//		{
//			System.out.println("you win");
//		}else if
//		(
//				(com == 1 && human ==3) 
//				|| ( com == 2 && human == 1) 
//				|| ( com == 3 && human == 2)
//		)
//		{
//			System.out.println("you loss");
//		}
		if(com == human) {
			System.out.println("save");
		}else if(com == (human % 3 + 1) ) 
		{
			System.out.println("you loss");
		}
		else if(com != (human % 3 + 1))
		{
			System.out.println("you win");
		}
		

	}

}
