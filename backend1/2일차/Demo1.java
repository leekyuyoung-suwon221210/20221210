package backend1_기본입출력;

import java.util.Scanner;

/*
 * What is your first name? kyuyoung
 * What is your last name? lee
 * Your name is kyuyoung lee
 */

public class Demo1 {

	public static void main(String[] args) {
		Scanner scInput = new Scanner(System.in);
		System.out.print("What is your first name?");
		String firstName = scInput.next();
		
		System.out.print("What is your last name?");
		String lastName = scInput.next();
		
		System.out.println("Your name is "+ lastName+" " + firstName);

	}

}
