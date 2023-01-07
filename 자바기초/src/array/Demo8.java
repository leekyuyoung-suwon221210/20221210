package array;

import java.util.Random;

public class Demo8 {
	
	public static int[] makeShuffleArray(int size) {
		// �ʱ� �迭 ����
		int[] nums = new int[size];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i;			
		}
		
		// shuffle
		for (int i = 0; i < 1000; i++) {
			int randomNum =(int)(Math.random()*size); // ������ ����(�迭��������)
			int temp = nums[0];
			nums[0] = nums[randomNum];
			nums[randomNum] = temp;	
		}
		
		return nums;
	}

	public static void main(String[] args) {
		// 0 ~ 100 ������ 30���� 
		// �ߺ����� ����  ����.. 		
		// ��ȭ Ÿ¥..... ����  ��Ŀ..
		int[] shuffledArray =  makeShuffleArray(46);
		for (int i = 0; i < 6; i++) {
			System.out.print(shuffledArray[i]+" ");			
		}		
		
		
	}

}
