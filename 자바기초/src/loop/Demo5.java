package loop;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {		
		
		// 1 ~ 10���� ���� ���Ͻÿ�
		for (int count = 0; count < 10; count++) 
		{
			System.out.println(count + " : hello");
		}
		
		
		// ��ǻ�Ͱ� 1 ~100 ���� �����߿��� ���Ƿ� �Ѱ��� ����
		// ����� ���ߴ� ����
		// ���� ������ ���� ��ǻ�ͺ��� ũ�� ũ�� ���
		// ���� ������ ���� ��ǻ�ͺ��� ������ �۴�
		boolean isMatch = false;
		int comnum = (int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		while (!isMatch) 
		{
			System.out.println("���ڸ� �Է��ϼ���");
			int humanNum = sc.nextInt();
			if(humanNum > comnum)
				System.out.println("�Է��� ���� Ů�ϴ�.");
			else if(humanNum < comnum)
				System.out.println("�Է��� ���� �۽��ϴ�.");
			else {
				isMatch = true;
				System.out.println("�����Դϴ�.");				
			}
		}
		

	}

}
