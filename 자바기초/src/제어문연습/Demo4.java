package �������;

import java.util.Scanner;

/**
 *  �߱� .. �ڵ���� ����
 *  5ȸ,6ȸ  10���̻� ���̰� ���ų� 7ȸ/8ȸ 7���̻� ���̰� ���� �ݵ����    ���̴� scoreA- scoreB
 *  inning, scoreA, scoreB �� ���� �Է¹޾Ƽ� 
 *  It's  colded game
 *  It's  not a colded game 
 */
public class Demo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������ �־ �Է�: 3 2 1");
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
