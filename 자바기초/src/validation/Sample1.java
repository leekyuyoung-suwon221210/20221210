package validation;

import java.util.Scanner;
/*
 * �Էµ������� ��ȿ�� �˻�
 * range check
 * length check
 * type check
 * format check
 * ...
 * �߸��� �Է��̸�.. �������� �Է��� ���ö����� ��� �Է��� �޴´�
 */
public class Sample1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  
		for (int i = 0; i < 10; i++) 
		{
			System.out.print("number of players : ");		
			// ����ڰ� �Է��� �����Ͱ� ������ �κ�		
			String numPlayers =  sc.next();
	//		System.out.println( numPlayers.compareTo("0") );
			int range = numPlayers.compareTo("0");
			// �Է��� �����Ͱ� �ǵ��� ��� ���Դ���. �׸��� �� ����Ǵ��� Ȯ��
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
