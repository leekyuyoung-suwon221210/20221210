package day2;

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
	
	private static void processChoicePerson() {
		int choice = 0;
		while (choice!=4) {
			showPerson();
			choice =  (new Scanner(System.in)).nextInt();				
		}
	}
	
	public static void main(String[] args) {	
		
		int choice = showMenu(); // 최초 메뉴 서택
		if(choice == 3) return; // 종료면 종료
		
		
		while (choice == 1) {  // 입장객 선택 메뉴면
			processChoicePerson(); // 입객장 선택 하는데. 만약 이전메뉴를 선택하면 종료
			choice = showMenu();   // 메인메뉴 호출 다시 입장객 선택이면 순환
			if(choice == 3) return; // 종료면 종료
		}
		
		// 2번 수입을 선택했을경우
		System.out.println("2번을 선택했습니다.");
		
		
		 
		
		
		
		
		
//		}
//		else if(choice == 2){
//			
//		}
//		else 
//			return;
	}

}





