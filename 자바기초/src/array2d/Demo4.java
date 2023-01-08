package array2d;

import java.util.Random;

public class Demo4 {

	public static void main(String[] args) {
		// �ĺ�
		String[] candidate = {"ȫ�浿","ö��","�̾�"};
		// ��ǥ�� ������ �׷�
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
		// (1,2)  player�� ö������ ��ǥ
		// ��ǥ���� count
		// player : 
		// staff : 
		
		// �ĺ����̸� �÷��̾���ǥ�� ��������ǥ�� �հ�
		// ȫ�浿 5 4 total 9
		// �÷��̾ �����鿡�� ��ǥ�� ��
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
		
		// ���
		for (int i = 0; i < voteScoreStaff.length; i++) {
			String str = String.format("%s %d %d %d", candidate[i], voteScorePlayer[i],voteScoreStaff[i]
					, voteScorePlayer[i] + voteScoreStaff[i] );
			System.out.println(str);
		}
		

	}

}
