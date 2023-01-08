package array2d;

import java.util.Random;

public class Demo2 {
	
	public static int checkBingo(int[][] num2d) {
		int bingoCount=0;
		
		for (int i = 0; i < num2d.length; i++) {
			// per row
			int[] js = num2d[i];
			int start = js[i];
			boolean check = true;
			for (int j = 0; j < js.length; j++) {
				if(js[j] != start) check=false; 
			}
			if(check) bingoCount++;
			
			// per column
			check = true;
			start = num2d[0][i];
			for (int j = 0; j < js.length; j++) {
				if(num2d[j][i] != start) check=false;
			}
			if(check) bingoCount++;
//			num2d[0][0] num2d[1][0] num2d[2][0]
//			num2d[0][1] num2d[1][1] num2d[2][1]		
//			num2d[0][2] num2d[1][2] num2d[2][2]
		}
		
		// 대각선은 따로.. 2번순환하는 걸로..
		
		return bingoCount;
		
	}
	
	public static void main(String[] args) {
		// 0 ~ 3
		// 3 by 3 matrix random
		// 빙고 몇개 나오는지 출력
		Random rd = new Random();
		
		int[][] num2d = new int[4][4];
		for (int i = 0; i < num2d.length; i++) {
			int[] js = num2d[i];
			for (int j = 0; j < js.length; j++) {
				js[j] = rd.nextInt(3);
				System.out.print(js[j]+" ");
			}			
			System.out.println();
		}
		
		int result = checkBingo(num2d);
		System.out.println(result);
		
	}

}
