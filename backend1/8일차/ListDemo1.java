package java_8day;

import java.util.Scanner;

public class ListDemo1 {

	public static void main(String[] args) {
		// Scanner 객체를 생성
		Scanner sc = new Scanner(System.in);
		
		// 0이상의 숫자만 계속 해서 입력한 데이터를 저장, 만약 음수를 입력하면 중지
		// 입력한 데이터를 모두 저장하고 평균과 합을 구해서 출력
		int[] ary = new int[10];
		int sum = 0;
		double avg = 0.0;
		for (int i = 0; i < ary.length; i++) {
			System.out.print("input data : ");
			int data =  sc.nextInt(); // 정수를 사용자로부터 입력 받는다
			if(data < 0)
				break;
			ary[i] = data;
			sum += data;
		}
		avg = (double)sum / ary.length;
		System.out.println("-".repeat(20));
		
	}

}
