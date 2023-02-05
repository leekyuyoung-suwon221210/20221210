package java_6day;

import java.util.Scanner;

/*
 * 학생클래스
        변수 : 이름-name, 배열(국 영 수) scores, 성적 - grade(A B C D F)
        메소드 : 평균 - getMean, 성적(학점) - calcGrade , 학생정보 출력 - studentInfo
              : 국영수 각각 점수 입력 setScores
 */
public class Student {
	String name;
	int[] scores = new int[3];
//	int[] scores = {0,0,0};
	private String grad;
	private double avg;
	double getMean() {
		int total = 0;
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		avg = (double)total / scores.length;
		return avg;		
	}
	String calcGrade() {
		// 1 평균을 구한다.
		// 2 평균을 가지고 각 학점에 해당하는 구간인지 파악하고 학점을 grad 변수에 입력한다.
		double avg = getMean();
		if(avg > 90) {grad = "A"; }
		else if(avg > 80) { grad = "B"; }
		else if(avg > 70) { grad = "C"; }
		else if(avg > 60) { grad = "D"; }
		else { grad = "F"; }		
		return grad; 		
	}
	void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("국어:");
		scores[0] = sc.nextInt();
		System.out.print("영어:");
		scores[1] = sc.nextInt();
		System.out.print("수학:");
		scores[2] = sc.nextInt();
		getMean();
		calcGrade();
	}
	void studentInfo() {
		System.out.printf("%s\t%d\t%d\t%d\t%.2f\t%s\n",
				name,scores[0],scores[1],scores[2],avg,grad);
	}

}














