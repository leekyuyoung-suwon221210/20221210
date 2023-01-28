import java.util.Scanner;

/**
 * 
 * 사용자로부터 계속 반복적으로 숫자를 입력받아서
 * 그 숫자들의 합이 100을 넘어가면 멈춰라. *
 */
public class Demo13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;		
		while (true) 
		{
			if(sum > 100) {
				break;
			}
			System.out.println("정수를 입력하세요");
			sum += sc.nextInt();
		}
		System.out.println("프로그램 종료 : " + sum);
	}

}
