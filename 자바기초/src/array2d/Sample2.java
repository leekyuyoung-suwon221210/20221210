package array2d;

public class Sample2 {

	public static void main(String[] args) {
		int[][] nums2d = {
				{1,2},
				{4,5,6,7},
				{7,8,9,10,11,12}
		};
		
		
		int[] num1d_0 = nums2d[0];
		int[] num1d_1 = nums2d[1];
		int[] num1d_2 = nums2d[2];
		
		 
		System.out.println(nums2d[2][3]);
		
		num1d_2[3] = 100;
		
		System.out.println(nums2d[2][3]);
		

	}

}
