package array;

import java.util.Random;

public class Sample2 {

	public static void main(String[] args) {
		// 임의의 정수형 배열 6개를 만드세요.
		Random random = new Random();
		// 사용 예
//		System.out.println(random.nextInt(100));
		// 6개짜리 빈 배열
		int[] nums = new int[6];
		for (int i = 0; i < 6; i++) {
			nums[i] = random.nextInt(100);
		}
		
		System.out.print(nums[0]+" ");
		System.out.println(nums[5]);
		nums[0] = 99;
		nums[5] = 100;
		System.out.print(nums[0]+" ");
		System.out.println(nums[5]);
		System.out.println(nums.length);
		

	}

}
