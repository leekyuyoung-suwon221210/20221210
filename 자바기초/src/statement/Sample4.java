package statement;

import java.util.Scanner;

public class Sample4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Ű���� �Է��� ����
		System.out.println("���ڿ� �Է�(eng)"); // ȭ�� ���
		String str = sc.next();  // Ű����κ��� ���ڿ��� �Է¹ޱ�
		int len = str.length();  // ���ڿ��� ����
		
		if(len > 5) 
			System.out.println(str.substring(0,5));		
		else
			System.out.println(str);		
	}

}
