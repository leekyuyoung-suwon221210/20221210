package 제어문연습;

import java.util.Scanner;

/**
 *  야구 .. 코드게임 규정
 *  5회,6회  10점이상 차이가 나거나 7회/8회 7점이상 차이가 나면 콜드게임    차이는 scoreA- scoreB
 *  inning, scoreA, scoreB 를 각가 입력받아서 
 *  It's  colded game
 *  It's  not a colded game 
 */
public class Demo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("순수대로 공백을 넣어서 입력: 3 2 1");
		int inning = sc.nextInt();
		int scoreA = sc.nextInt();
		int scoreB = sc.nextInt();
		
//		int diff = ((scoreA - scoreB) > 0)? scoreA - scoreB : -(scoreA - scoreB) ;
		int diff = Math.abs(scoreA - scoreB);
		if (diff >=10 && inning == 5 || inning == 6) {
			System.out.println("It's  colded game");
		}else if(diff >=7 && inning == 7 || inning == 8) 
		{
			System.out.println("It's  colded game");
		}else {
			System.out.println("It's  not a colded game");
		}
				
//		System.out.println(inning+" " + scoreA + " "+ scoreB );
//		System.out.println("It's  colded game");
//		System.out.println("It's  not a colded game");
		
		
	}

}
