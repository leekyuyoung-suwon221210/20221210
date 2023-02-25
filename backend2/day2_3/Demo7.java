package day2_3;

import java.util.Scanner;

public class Demo7 {

	public static void Test(){
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println("input number");
			String number =  sc.next();
			int num =  Integer.valueOf(number);
			System.out.println(10 / num);
		}		
		catch (Exception e) {
			e.printStackTrace();
			
		}
		finally {
			if(sc != null) sc.close();			
		}
		
	}	
	public static void main(String[] args) {
		Test();
		
		System.out.println("-----------The End---------");
	}

}
