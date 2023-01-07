package array2d;

public class Sample1 {

	public static void main(String[] args) {
		// 1차원 배열
		int[] num1d = {1,2};		
		
		// 2차원 배열
		int[][] num2d = { {1,2},{3,4},{5,6} };
		
		// 3		
//		int[][][] num3d = { { {1,2},{3,4} },{ {1,2},{3,4} }    };
		
//		System.out.println(num2d.length);
//		for (int i = 0; i < num2d[2].length; i++) {
//			System.out.println(num2d[2][i]);			
//		}	
		
		/*
		 * 1 2
		 * 3 4
		 * 5 6
		 */
		for (int i = 0; i < num2d.length; i++) {
			for (int j = 0; j < num2d[i].length; j++) {				
				System.out.print(num2d[i][j]+" ");
			}		
			System.out.println();
		}
		

	}

}
