package �������;

import java.util.Scanner;
/**
 *  ���� ���� : 10
 *  �ο��� : x
 *  total : 10 * x
 *  ���� : �ο����� 20���̻��̸� 20% ���� �ؼ� �ѱݾ׿� ���αݾ� ���
 */
public class Demo1 {

	public static void main(String[] args) {
		final int TICKET_PRICE = 10;		// ���������
						
		// �Է�
		Scanner sc = new Scanner(System.in);
		System.out.println("���尴��(����) : ");
		int numPeople = sc.nextInt();
		
		long amt = numPeople * TICKET_PRICE; 
		System.out.println("�հ� : " + amt);
		
		if(numPeople>=20) {
			int discountAmt = (int)Math.round(amt*0.2);
			System.out.println(discountAmt);
			long finalAmt = amt - (long)discountAmt;
			System.out.println(finalAmt);
		}
	}

}
