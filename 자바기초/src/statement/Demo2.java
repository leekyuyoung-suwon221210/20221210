package statement;
/*
 * ���ǹ� - ������ ������ ����
 */
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// ���̸� �Է¹޾Ƽ� �̼��������� �Ǵ��ϼ��� �̶� 18�� �̻��̸� ���� �׷��� ������ �̼�����
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ���");
		int age =  sc.nextInt();
//		boolean age1 = false;
//		age1 = (age >=18);
//		System.out.println( (age1)? "����" : "�̼�����"  );		
		
		
		System.out.println( (age >=18)? "����" : "�̼�����"  );

	}

}
