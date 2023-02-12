package java_8day;

import java.util.ArrayList;
import java.util.Scanner;

public class ListDemo4 {
	// arraylist 형태로 변경
	public static void main(String[] args) {
		// Scanner 객체를 생성
		Scanner sc = new Scanner(System.in);
		
		// 0이상의 숫자만 계속 해서 입력한 데이터를 저장, 만약 음수를 입력하면 중지
		// 입력한 데이터를 모두 저장하고 평균과 합을 구해서 출력
		ArrayList<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		double avg = 0.0;
		int data = 0;
		System.out.print("input data : ");
		
		while ( (data = sc.nextInt()) > 0 ) {						
			list.add(data);
			sum += data;
			System.out.print("input data : ");
		}
		avg = (double)sum / list.size();
		System.out.println("-".repeat(20));
		
	}

}
