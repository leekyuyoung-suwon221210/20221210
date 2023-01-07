package array;

import java.util.Random;

public class Demo7 {

	public static void main(String[] args) {
		Random rd = new Random();
		// 난수생성 방법 2 case
		int num1 = rd.nextInt(101);  // case 1		
		int num2 =(int)(Math.random()*101);  // case 2
		
		// 0~ 100 사이의 정수 30개를 가지는 배열을 만들어서  
		// 60점과 100점 사이의 점수가 몇개 인지 카운트		
		// 평균, 최고점수와 최저점수
		
		// 초기화
		int[] nums = new int[30];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rd.nextInt(101);
		}
		
		// search
		int count = 0;
		double avg = 0.0;
		
		int min = 100;
		int max = 0;
		
		for (int n : nums) {
			if(n>=60 && n<=100) {
				count++;
				avg += n;
				if (max < n) max = n;
				if (min > n) min = n;						
			}
		}
		avg /= count;
		String output = String.format("60~100사이의 숫자들은 : %d, 이때 평균 : %f, 최소값은 : %d, 최대값은 %d", 
				count,avg,min,max);
		System.out.println(output);

	}

}
