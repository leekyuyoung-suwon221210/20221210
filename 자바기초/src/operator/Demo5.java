package operator;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		// 국영수 점수를 입력받아서 해당 학생이 합격 불합격을 true false로 표현
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		System.out.println(kor+" "+eng+" "+math);
		// 다음의 조건을만들어서 true false 를 출력
		// 각 과목당 40정 이상이고 평균이 60이상이면 true 
		boolean isPass = false;
		isPass = (kor >= 40) && (eng >= 40 ) && (math >=40 ) && ( (kor+eng+math)/3 >=60 );
		System.out.println(isPass);

	}

}
