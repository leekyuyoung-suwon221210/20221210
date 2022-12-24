package statement;

import java.util.Scanner;

public class Sample8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1차시 두개의 점수를 입력(공백을 넣어서)");
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A < 60 || B < 40)
			return;		
		
		System.out.println("2차시 두개의 점수를 입력(공백을 넣어서)");
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A < 70 || B < 50)
			return;
		

	}

}
