package �������;

import java.util.Scanner;

/**
 *  ������� 3kg �̸��� 3��
 *  1kg �ʰ��Ҷ����� 0.5�� �� �ΰ�
 *  3<= weight < 4  3.5
 *  4<= weight < 5  4.0 
 */
public class Demo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���Ը� �Է��ϼ��� : ");
		int weight = sc.nextInt();
		double total = 3.0;
		if(weight < 3)
			System.out.println(3);
		else {
			 total = 3.0  +  ((weight - 3.0 + 1.0)+0.5);			
		}
		System.out.println(total);
	}

}
