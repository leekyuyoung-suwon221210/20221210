package loop;

import java.util.Scanner;

/*
 * prim �Ҽ�..�� �Ǵ��ϴ� ���α׷� (1�� �ڽ����θ� �������� ��)
 * 
 */
public class Demo6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���(3����~~");

		int inputNum = sc.nextInt();
		boolean isPrime = true;		
		for (int i = 2; i < inputNum; i++) {
			if(inputNum % i == 0) {				
				isPrime = false;
				break;
			}
		}		
		System.out.println( isPrime? "�Ҽ�" : "�Ҽ��� �ƴ�"  );
		
		String name = "ABCDEFG";
		
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.substring(i,i+1));
			
		}
//		for���� substring�� �̿��ؼ�
//		A
//		B
//		C
//		D
//		E
//		F
//		G
		
	}

}
