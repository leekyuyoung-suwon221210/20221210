package array;

public class Demo6 {

	public static void main(String[] args) {
		String[] candidate = {"ȫ�浿","ö��","�̾�"};
		int[] votes =   {1,2,1,2,3,2,1,2,3,1,2,3,2,1,2,3,2,1,2,3,2,1,1,1};  // 1 ~ 3
		
		int[] score = {0,0,0};
		
		for (int i = 0; i < votes.length; i++) {
			score[ votes[i]-1 ]++;
		}
		
		for (int i = 0; i < score.length; i++) {
			System.out.println(candidate[i]+" : " + score[i]);			
		}
		
		// �ʿ��� ������ �迭�� �߰��� �����ϰ� ����ص� ����
		/*		  
		 ȫ�浿 : 5
		 ö�� : 10
		 �̾� : 13 
		 */
		
			

	}

}
