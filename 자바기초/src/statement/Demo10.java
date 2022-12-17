package statement;

import java.util.Scanner;
// 권장사용법
//  if문장은 범위를 판단
// switch - case   case by case 
public class Demo10 {

	public static void main(String[] args) {
		// 사용자로부터 정수를 입력받아서 월~일  if statement
		Scanner sc = new Scanner(System.in);
		System.out.println("1-7사이에 정수를 입력");
		int number = sc.nextInt();
		if(number == 1) 
		{
			System.out.println("월");
		}
		else if(number == 2) 
		{
			System.out.println("화");
		}
	}

}
