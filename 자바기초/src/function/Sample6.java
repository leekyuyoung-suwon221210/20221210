package function;

import java.util.Scanner;

/* �Լ��� ���� : ��ɾ���� ����
 * 
 * �Լ� ����� ��� �Ǵ� ���
 * 1 �Է�x    ���x  - void
 * 2 �Է�o ���o
 * 3 �Է�x  ���o
 * 4 �Է�o ���x - void
 * 
 * �Լ��� ����ϴ� ����
 * 1. �ڵ��� �� ��� - ������ �� ���
 * 2. ������ �ڵ带 �����ϰ� ��� - �ϰ��� ������ �Լ��� ���� �� �Լ����� �����ϰ� ���̹��ؼ� �ش� ����� �߻������� ���� ����* 
 * 
 * 
 * ���� ���α׷�
 * �������� �����ڵ� - �Լ� ( å�� ����)
 * �Լ��� �� ��ɿ� ����ؾ� �Ѵ�. - ���� �Լ� ����� ���
 * �ʹ� ���� ����� ���� ����... ����� ������ �������� �Լ��� �����Ѵ�. -- �����
 */


//	1. �ڵ��� �� ���
public class Sample6 {	
	
	public static void gugudanDan(int dan) {
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d\n",dan, i, dan*i );			
		}
	}
	
	public static int inputGuGuDanDan() {
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		return dan;
	}
	
	public static void main(String[] args) {
		// �ܼ��� �Է¹޾Ƽ� �ش� �� ���		
//		System.out.println("������ �ܼ��� �Է��ϼ��� : ");
//		
//		int dan = inputGuGuDanDan(); // �Է�
		
		for (int i = 2; i < 10; i++) {
			gugudanDan(i);  // ó��			
		}
		
//		System.out.println("2 x 1 = 2");
//		System.out.println("2 x 2 = 4");
//		System.out.println("2 x 3 = 6");
//		System.out.println("2 x 4 = 8");
//		System.out.println("2 x 5 = 10");
//		System.out.println("2 x 6 = 12");
//		System.out.println("2 x 7 = 14");
//		System.out.println("2 x 8 = 16");
//		System.out.println("2 x 9 = 18");
		
		
	}

}
