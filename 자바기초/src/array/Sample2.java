package array;

import java.util.Random;

public class Sample2 {

	public static void main(String[] args) {
		// ������ ������ �迭 6���� ���弼��.
		Random random = new Random();
		// ��� ��
//		System.out.println(random.nextInt(100));
		// 6��¥�� �� �迭
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
