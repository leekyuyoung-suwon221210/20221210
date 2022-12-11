package statement;
/*
 * 조건문 - 조건이 맞으면 실행
 */
import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		String rank = "F";
		if(score >=90) {
			rank = "A";
		}else if(score >=80) {
			rank = "B";
		}else if(score >=70) {
			rank = "C";
		}else if(score >=60) {
			rank = "D";
		}
		System.out.println(rank);

	}

}
