package statement;

import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input 1-9 ");
//		int number =  sc.nextInt();
		//  Ÿ����ȯ �Ǵ� Ÿ��ĳ����  �⺻ ������Ÿ�Ի��̿����� ����
		// �׷��� ������쿡�� �Ұ���, �����ϰ� �Ϸ��� ����� ����(���� or �ý���)
//		int number = (int)sc.next();
		int number = Integer.parseInt(sc.next()) ;
		
		number = number % 9 + 1;
		System.out.println(number);
		
		
	}

}
