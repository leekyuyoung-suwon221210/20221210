package array;

import java.util.Random;

public class Demo8 {
	
	public static int[] makeShuffleArray(int size) {
		// 초기 배열 생성
		int[] nums = new int[size];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i;			
		}
		
		// shuffle
		for (int i = 0; i < 1000; i++) {
			int randomNum =(int)(Math.random()*size); // 임의의 숫자(배열범위내의)
			int temp = nums[0];
			nums[0] = nums[randomNum];
			nums[randomNum] = temp;	
		}
		
		return nums;
	}

	public static void main(String[] args) {
		// 0 ~ 100 사이의 30개를 
		// 중복되지 않은  수로.. 		
		// 영화 타짜..... 고스돕  포커..
		int[] shuffledArray =  makeShuffleArray(46);
		for (int i = 0; i < 6; i++) {
			System.out.print(shuffledArray[i]+" ");			
		}		
		
		
	}

}
