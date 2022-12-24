package loop;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {		
		
		// 1 ~ 10까지 합을 구하시오
		for (int count = 0; count < 10; count++) 
		{
			System.out.println(count + " : hello");
		}
		
		
		// 컴퓨터가 1 ~100 사이 숫자중에서 임의로 한개를 선택
		// 사람이 맞추는 게임
		// 내가 제시한 숫작 컴퓨터보다 크면 크다 출력
		// 내가 제시한 숫작 컴퓨터보다 작으면 작다
		boolean isMatch = false;
		int comnum = (int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		while (!isMatch) 
		{
			System.out.println("숫자를 입력하세요");
			int humanNum = sc.nextInt();
			if(humanNum > comnum)
				System.out.println("입력한 값이 큽니다.");
			else if(humanNum < comnum)
				System.out.println("입력한 값이 작습니다.");
			else {
				isMatch = true;
				System.out.println("정답입니다.");				
			}
		}
		

	}

}
