package �������;
/*
 * ������ �������� ���� 3���� �޴µ�.. �ΰ��� ���� �������Ѱ��� + - * /
 * ex)  10 + 5 
 * 15
 * 
 * ex)  10 / 5
 * 2
 */
import java.util.Scanner;
public class Demo6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �������� 1 + 2 �� ���� �Է�:");
		int num1 = sc.nextInt();
		String op = sc.next();
		int num2 = sc.nextInt();
		switch (op) {
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":			
			System.out.println(num1-num2);
			break;
		case "*":			
			System.out.println(num1*num2);
			break;
		case "/":		
			if(num2 == 0) {
				System.out.println("0���� ������ �����ϴ�.");
			}else {
				System.out.println(num1/num2);
			}
			break;
		default:
			break;
		}
	}

}
