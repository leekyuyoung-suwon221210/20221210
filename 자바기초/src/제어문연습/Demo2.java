package �������;

import java.util.Scanner;
/**
 *  ���̱ⱸ Ű ���� 130cm ���� ������ �̿� �Ұ�
 *  �̿� ���� ���θ��˷��ִ� ���α׷�
 */
public class Demo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ű���Է��ϼ��� : ");
		int height =  sc.nextInt();
//		if(height < 130)
//			System.out.println("It's not available");
//		else
//			System.out.println("It's available");
		
		// 3�� �����ڷ� 
//		String str = (height < 130)? "It's not available" : "It's available";
//		System.out.println(str);
		
		// if�� �ϳ��� ���
		String str = "It's available";
		if(height < 130)
			str = "It's not available";
		System.out.println(str);
		
		
		
	}

}
