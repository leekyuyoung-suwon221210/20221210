package array2d;

public class Sample3 {

	public static void main(String[] args) {
		int[][] nums2d = new int[3][3];
		// 초기화(각자 초기화 값은 알아서) - loop
		// 출력은 행렬처럼
		//   0 0 0
		//   0 0 0
		//   0 0 0
		int count = 0;
		for (int i = 0; i < nums2d.length; i++) {
			int[] js = nums2d[i];
			for (int j = 0; j < js.length; j++) {
				js[j] = count++;				
			}			
		}
		
		for (int i = 0; i < nums2d.length; i++) {
			for (int j = 0; j < nums2d[i].length; j++) {
				System.out.print(nums2d[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
