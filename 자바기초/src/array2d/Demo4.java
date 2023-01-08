package array2d;

import java.util.Random;

public class Demo4 {

	public static void main(String[] args) {
		// 후보
		String[] candidate = {"홍길동","철이","미애"};
		// 투표에 참여한 그룹
		String[] people = {"player","staff"};
		Random rd = new Random();
		int[][] voteData = new int[10][2];
		
		for (int i = 0; i < voteData.length; i++) {
			for (int j = 0; j < voteData[i].length; j++) {
				if(j == 0)
					voteData[i][j] =rd.nextInt(2)+1;
				else
					voteData[i][j] =rd.nextInt(3)+1;				
			}			
			System.out.print("("+voteData[i][0] + "," +voteData[i][1] + "),  ");			
		}
		
		int[] result = {0,0};
		for (int i = 0; i < voteData.length; i++) {
			if(voteData[i][0] == 1)
				result[0]++;
			else
				result[1]++;
		}
		
		System.out.println("player : "+result[0]+"  staff : "+result[1]);
		
		// (1,2),  (1,3),  (2,3),  (1,3),  (2,1),  (2,3),  (1,1),  (2,1),  (1,2),  (1,3), 
		// (1,2)  player가 철이한테 투표
		// 투표수를 count
		// player : 
		// staff : 
		
		// 후보자이름 플레이어투표수 스태프투표수 합계
		// 홍길동 5 4 total 9
		// 플레이어가 선수들에게 투표한 수
		int[] voteScorePlayer = {0,0,0};
		int[] voteScoreStaff = {0,0,0};
		for (int i = 0; i < voteData.length; i++) {			
//			System.out.println(voteData[i][1]);				
			if(voteData[i][0] == 1) 
				voteScorePlayer[voteData[i][1]-1]++;				
			else
				voteScoreStaff[voteData[i][1]-1]++;					
			
		}
//		for (int i = 0; i < voteScorePlayer.length; i++) {
//			System.out.print(voteScorePlayer[i]+" ");
//		}
//		System.out.println();
//		for (int i = 0; i < voteScoreStaff.length; i++) {
//			System.out.print(voteScoreStaff[i]+" ");
//		}
		
		// 출력
		for (int i = 0; i < voteScoreStaff.length; i++) {
			String str = String.format("%s %d %d %d", candidate[i], voteScorePlayer[i],voteScoreStaff[i]
					, voteScorePlayer[i] + voteScoreStaff[i] );
			System.out.println(str);
		}
		

	}

}
