import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// 임이의 정소를 입력받아서  짝수인지 홀수인지 구분해서
		// 짝수면 "짝수입니다" 그렇지 않으면 "홀수 입니다"
		
		System.out.println("정수를 입력하세요:");
		Scanner sc = new Scanner(System.in);
//		sc.nextInt();  사용자가 입력한 값을 정수로 변환해서 돌려준다.
		int number = sc.nextInt();
		
		if(number % 2 == 0) 
		{
			System.out.println("입력한 값은 짝수입니다.");			
		}else {
			System.out.println("입력한 값은 홀수입니다.");			
		}
		

	}

}
