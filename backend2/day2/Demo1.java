package day2;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo1 {
	private static int showMenu() {
		System.out.println("다음 메뉴를 선택하세요");
		System.out.println("1. 입장객 등록");
		System.out.println("2. 수입");
		System.out.println("3. 종료");
		return (new Scanner(System.in)).nextInt();
				
	}	
	private static  void showPerson() {
		System.out.println("1. 어른");
		System.out.println("2. 청소년");
		System.out.println("3. 어린이");
		System.out.println("4. 이전메뉴");
	}	
	
	private static void processChoicePerson(ArrayList<Person> lists ) {
		int choice = 0;
		while (choice!=4) {
			showPerson();
			choice =  (new Scanner(System.in)).nextInt();	
			if(choice == 1) lists.add(new Adult());
			else if(choice == 2) lists.add(new TeanAger());
			else if(choice == 3) lists.add(new Child());
		}
	}
	
	public static void main(String[] args) {	
		ArrayList<Person> lists = new ArrayList<Person>();		
		
		int choice = showMenu(); // 최초 메뉴 서택
		if(choice == 3) return; // 종료면 종료		
		
		while (choice == 1) {  // 입장객 선택 메뉴면
			processChoicePerson(lists); // 입객장 선택 하는데. 만약 이전메뉴를 선택하면 종료
			choice = showMenu();   // 메인메뉴 호출 다시 입장객 선택이면 순환
			if(choice == 3) return; // 종료면 종료
		}
		
		// 2번 수입을 선택했을경우
		System.out.println("2번을 선택했습니다. 총 수입을 산출합니다.");
		long totalPrice = 0;
		for (Person person : lists) {
			totalPrice +=person.getPrice();
		}
		
		System.out.println("입장인원\t어른\t청소년\t어린이\t총 수입");
		System.out.printf("%d\t%d\t%d\t%d\t%d\n",0,0,0,0,totalPrice);
	}

}





