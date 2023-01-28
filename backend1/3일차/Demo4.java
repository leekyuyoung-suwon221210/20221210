import java.util.Scanner;

/** * 
 * 다중 if문
 * 90 이상 A
 * 80 ~ 89 B
 * 70 ~ 79 C
 * 60 ~ 69 D
 * ~ 59    F 
 */
public class Demo4 {
	// 보기 좋다.-- >가독성 좋다..
	// 복잡하지 않으니... 버그감소
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요:");
		Scanner sc = new Scanner(System.in);
//		sc.nextInt();  사용자가 입력한 값을 정수로 변환해서 돌려준다.
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("A");			
		}else if(score>=80) {
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else if(score>=60) {
			System.out.println("D");
		}else {  // 59 58 57 56 ......
			System.out.println("F");			
		}
	}

}
