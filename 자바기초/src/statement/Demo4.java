package statement;
/*
 * ���ǹ� - ������ ������ ����
 */
import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		int enterPrice = 15000;
		// ���̸� �Է¹޾Ƽ� 18�� �̻��̸� ������ �� �ް�
		// �׷��� ������ 20% �����ؼ� 
		// �� ���� �ݾ��� ���  if ~ else
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ���");
		int age = sc.nextInt();
		
		if( !(age >= 18) ) {
			int price = (int)(enterPrice * 0.8);
			System.out.println(price);
		}else {
			System.out.println(enterPrice);
		}
		

	}

}
