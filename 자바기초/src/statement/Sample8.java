package statement;

import java.util.Scanner;

public class Sample8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1���� �ΰ��� ������ �Է�(������ �־)");
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A < 60 || B < 40)
			return;		
		
		System.out.println("2���� �ΰ��� ������ �Է�(������ �־)");
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A < 70 || B < 50)
			return;
		

	}

}
