package statement;
/*
 * ���ǹ� - ������ ������ ����
 */
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		// ���̸� �Է¹޾Ƽ� �̼��������� �Ǵ��ϼ��� �̶� 18�� �̻��̸� ���� �׷��� ������ �̼�����
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ���");
		int age =  sc.nextInt();
		
		if(age >= 18) { 
			System.out.println("����");		
		}
		else { 
			System.out.println("�̼�����");
		}
			
		
//		System.out.println( (age >=18)? "����" : "�̼�����"  );

	}

}
