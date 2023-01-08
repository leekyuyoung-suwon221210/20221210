package validation;

import java.util.Scanner;
/*
 * 입력데이터의 유효성 검사
 * range check
 * length check
 * type check
 * format check
 * ...
 * 잘못된 입력이면.. 범위내의 입력이 들어올때가지 계속 입력을 받는다
 */
public class Sample1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  
		for (int i = 0; i < 10; i++) 
		{
			System.out.print("number of players : ");		
			// 사용자가 입력한 데이터가 들어오는 부분		
			String numPlayers =  sc.next();
	//		System.out.println( numPlayers.compareTo("0") );
			int range = numPlayers.compareTo("0");
			// 입력한 데이터가 의도한 대로 들어왔는지. 그리고 잘 실행되는지 확인
			if(range >= 2 && range<=4) {
				System.out.println("range check: good");
				break;
			}
			else
				System.out.println("range check : not good");
		}
		
		sc.close();

	}

}
