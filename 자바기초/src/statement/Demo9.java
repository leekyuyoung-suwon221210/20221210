package statement;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���");
		int number =  sc.nextInt();		
		System.out.println("�Է��� ��: " + number);
		
		// �Է��� ���� ��� ���� ��������	
		
		if (number > 0) {
			System.out.println("���");	
		} else {
			System.out.println("����");
		}
		
		System.out.println("������ �Է��ϼ���");
		number =  sc.nextInt();		
		System.out.println("�Է��� ��: " + number);
		// �Է��� ���� ¦�� ���� Ȧ������
		number =  sc.nextInt();
		if(number % 2 == 0) {
			System.out.println("¦��");
		}else {
			System.out.println("Ȧ��");
		}
		
		// 3�����Է��� �޾Ƽ� �ִ� �� �ּ� ���� ���
		System.out.println("���� 3���� ������ �̿��ؼ� �Է��ϼ��� (�� 10 20 30)");
		int number1 =  sc.nextInt();		
		int number2 =  sc.nextInt();
		int number3 =  sc.nextInt();
		
		int maxnumber = 0;
		// number1, number2 �� �����߿� ���� ū ���� ã�Ƽ� maxnumber �� �־��ش�
		if(number1 >= number2) {
			maxnumber = number1;		
		}else {
			maxnumber = number2;
		}
		
		maxnumber = (number1 >= number2)? number1 : number2;
		
		maxnumber = (maxnumber >= number3) ? maxnumber : number3;
		
		System.out.println("���� ū ���� : " + maxnumber);
				
		// Ű����� ���� ���ڸ� �Է¹޾Ƽ� ������ ����(1 ~ 7)
		System.out.println("1~7������ ������ ������ �Է��ϼ���");
		int number4 = sc.nextInt();
		// ����� ������ 1~7���� switch ���� ���� 1�̸� ������ 2�̸� ȭ����.... �Ͽ��ϱ��� ���
		
		switch (number4) {
		case 1:
			System.out.println("��");
			break;
		case 2:
			System.out.println("ȭ");
			break;
		case 3:
			System.out.println("��");
			break;
		case 4:
			System.out.println("��");
			break;
		case 5:
			System.out.println("��");
			break;
		case 6:
			System.out.println("��");
			break;
		case 7:
			System.out.println("��");
			break;

		default:
			break;
		}

	}

}
