import java.util.Scanner;

/** * 
 * 다중 if문
 * 90 이상 A
 * 80 ~ 89 B
 * 70 ~ 79 C
 * 60 ~ 69 D
 * ~ 59    F 
 */
public class Demo3 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요:");
		Scanner sc = new Scanner(System.in);
//		sc.nextInt();  사용자가 입력한 값을 정수로 변환해서 돌려준다.
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("A");
		}
		
		if(score>=80 && score<=89) {
			System.out.println("B");
		}
		
		if(score>=70 && score<=79) {
			System.out.println("C");
		}
		
		if(score>=60 && score<=69) {
			System.out.println("D");
		}
		
		if(score<=59) {
			System.out.println("F");
		}
		
		

	}

}
