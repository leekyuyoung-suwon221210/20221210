package array;

public class Demo6 {

	public static void main(String[] args) {
		String[] candidate = {"홍길동","철이","미애"};
		int[] votes =   {1,2,1,2,3,2,1,2,3,1,2,3,2,1,2,3,2,1,2,3,2,1,1,1};  // 1 ~ 3
		
		int[] score = {0,0,0};
		
		for (int i = 0; i < votes.length; i++) {
			score[ votes[i]-1 ]++;
		}
		
		for (int i = 0; i < score.length; i++) {
			System.out.println(candidate[i]+" : " + score[i]);			
		}
		
		// 필요한 변수나 배열을 추가로 선언하고 사용해되 무관
		/*		  
		 홍길동 : 5
		 철이 : 10
		 미애 : 13 
		 */
		
			

	}

}
