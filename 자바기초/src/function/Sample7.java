package function;

import java.util.Scanner;

public class Sample7 {
	
	
	public static void fruit() {
		System.out.println("1.Apple 1200");
		System.out.println("2.Banana 500");
		System.out.println("3.Orange 700");
		System.out.println("4.End");
	}
	
	public static void main(String[] args) {
		// 10000원을 가지고 물건을 구매
		int totalMoney = 10000;
		int appleCount=0,bananaCount=0,orangeCount =0; 
		Scanner sc = new Scanner(System.in);
		int choiceMenu = 4;
		do {
			fruit();
			System.out.println("choice menu : ");
			choiceMenu = sc.nextInt();	
			
			switch (choiceMenu) {
			case 1:				
				if (totalMoney > 1200) {
					appleCount++;
					totalMoney -= 1200;
				}
				break;
			case 2:			
				if(totalMoney >500) {
					bananaCount++;
					totalMoney -= 500;
				}
				break;
			case 3:
				if(totalMoney > 700) {
					orangeCount++;
					totalMoney -= 700;
				}
				break;			
			default:
				break;
			}
			
		} while (choiceMenu != 4);
		
		
		
		// 영수증
		// 사과 2 2400
		// banan 1 20
		// 1000  잔돈
	}

}
