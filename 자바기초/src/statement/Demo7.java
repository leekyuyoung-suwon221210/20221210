package statement;
/*
 * ���ǹ� - ������ ������ ����
 */
import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2�ڸ� �̻� ������ �Է��ϼ��� : ");
		int number1 = sc.nextInt();
		// 2527 % 100  -> 27
		// 27 / 10  2
		// 27 % 10  7
		
		// 1. ������ �Է��޾Ƽ� 10�� �ڸ��� 1�� �ڸ��� ��� �ϰ� �� �ڸ��� ������ ���� Ʋ���� 
		// 1253
		
		int result1 = number1 % 100;
		int result_10 =  result1 / 10;
		int result_1 =  result1 % 10;
		if(result_10 == result_1) {
			System.out.println("10�� �ڸ��� 1�� �ڸ��� ����");
		}else {
			System.out.println("10�� �ڸ��� 1�� �ڸ��� ���� �ʴ�");
		}
		// 2. ���ǰ��� 2800���̰� 5000���� �����ϸ� �Ÿ����� ��� ��� �ϴ������
		// õ�� : 2��  ����� : 0�� ��� : 2 
		int price = 2800;
		int myPrice = 5500;  
		int diff = myPrice - price;  // 2200
		
		int won_1000 = diff / 1000;
		int won_500 = (diff % 1000) / 500;
		int won_100 = ((diff % 1000) % 500) / 100;
		System.out.println("õ�� : " + won_1000);
		System.out.println("����� : " + won_500);
		System.out.println("��� : " + won_100);

	}

}
