package statement;

import java.util.Scanner;

public class Sample7 {

	public static void main(String[] args) {
		System.out.println("���ڿ�  3���� ������ �������� �Է�");
		Scanner sc = new Scanner(System.in);
		String strNum1 =  sc.next();  // ȭ������ ���� ���ڿ��� �Է�
		String strNum2 =  sc.next();  // ȭ������ ���� ���ڿ��� �Է�
		String strNum3 =  sc.next();  // ȭ������ ���� ���ڿ��� �Է�
		
		int score = 0;
		
		if(strNum2.equals(strNum3))
			score += 2;
		else
			score += 1;
		
		
		if(strNum1.equals(strNum2)) 
			score += 2;
		else
			score += 1;					
		
		
		System.out.println(score);
		

	}

}
