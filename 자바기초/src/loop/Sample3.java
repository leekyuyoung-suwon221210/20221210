package loop;

import java.util.Scanner;

/*
 * ���� �׸��� ���� �ڵ����� ǥ��
 */
public class Sample3 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("input number : ");
		String strNum =  sc.next();  // ���ڿ� ����   "123" 
		int X =  Integer.parseInt(strNum);
		while (X != -1) {
			int Y = 3*X+1;
			System.out.println(Y);
			
			System.out.println("input number : ");
			strNum =  sc.next();  // ���ڿ� ����   "123"
			X =  Integer.parseInt(strNum);
					
		}
		

	}

}
