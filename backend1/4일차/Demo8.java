package java_4day;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		// 국 영 수 과목을 배열로 표현
		int[] score = new int[3];
		for (int i = 0; i < score.length; i++) {
			score[i] = getDataFromConsole();
		}
		// -- 여기까지... 배열에 각 요소에 데이터가 들어 있음
		int total = 0;
		double avge = 0.0;
		
		for (int i = 0; i < score.length; i++) {
			total += score[i];
		}
		System.out.println("total = " + total);
		
		avge = (double)total / score.length;
		System.out.println("avge = " + avge);
		
		

	}

	// 데이터 입력받기 (정수형)
	public static int getDataFromConsole() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int number1 = sc.nextInt();
		return number1;
	}
}
