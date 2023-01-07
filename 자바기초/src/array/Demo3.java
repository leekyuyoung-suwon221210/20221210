package array;

import java.util.Iterator;

public class Demo3 {

	public static void main(String[] args) {
		int[] nums = {11,12,13,14,15,16,17,18,19,20};				
		/**
		  11
		  13
		  15
		  17
		  19
		 */
		for (int i = 0; i < nums.length; i++) {
			if(i%2==0)
				System.out.println(nums[i]);			
		}
		
		for (int i = 0; i < nums.length/2; i++) {
			System.out.println(nums[i*2]);			
		}
		
		for (int i = 0; i < nums.length; i +=2) {
			System.out.println(nums[i]);
		}

	}

}
