package day2_3;

import java.util.Scanner;

public class Demo9 {
	private static void square(String s) throws NumberFormatException {
		int n = Integer.parseInt(s);
		System.out.println(n * n);
	}

	public static void main(String[] args) {		
		try(Scanner in = new Scanner(System.in);) 
		{
			square(in.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("정수가 아닙니다.");
		}

	}

}
