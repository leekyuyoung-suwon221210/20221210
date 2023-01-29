package java_4day;

public class Demo9 {

	public static void main(String[] args) {
		// 1명의 국영수
		int[] score1 = {80,90,95,10}; // int[]
		// 여러명 의 국영수
		int[] score2 = {83,92,75,20};
		int[] score3 = {82,98,85,30};
		
		int[][] sclass = {score1,score2,score3};
		
		System.out.println(sclass[0][1]);
		
		for (int i = 0; i < sclass.length; i++) {
			for (int j = 0; j < sclass[i].length; j++) {
				System.out.print(sclass[i][j]+" ");
			}
			System.out.println();
		}

	}

}
