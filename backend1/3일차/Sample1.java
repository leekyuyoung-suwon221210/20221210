import java.util.Random;
import java.util.Scanner;

// 조건문 if
//  단일 조건, 다중조건( && || )
// 순환문  
// while  - 특정 조건 check
// for  - 횟수를 check
//

public class Sample1 {

	public static void main(String[] args) {
		Random rd = new Random();		
		int computerNumber = rd.nextInt(100); // 0 ~ 99		
		// 사용자 값을 받는
		Scanner sc = new Scanner(System.in);		
		int count = 0;
		while (true) {
			count++;
			System.out.println("숫자 입력");
			int humanNumber = sc.nextInt();
			if(humanNumber > computerNumber) {
				System.out.println("크다");
			}
			else if(humanNumber < computerNumber) {
				System.out.println("작다");
			}
			else
			{
				System.out.println("같다");
				break;
			}
			// 사용자값이 > 컴퓨터  .. 크다
			// 사용자값이 < 컴퓨터  .. 작다
			// 사용자값이 < 컴퓨터  .. 정답.. 프로그램 종료			
		}
		System.out.println("총 시도 횟수 : "+ count);
	}

}
