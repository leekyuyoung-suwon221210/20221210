package loop;
/*
 * Iteration, Enumeration
 * While * 
 * 
 */
public class Demo1 {

	public static void main(String[] args) {
		boolean condition = true;
		
		int count = 0;
		// 무한루프방식 : 루프안에서 탈출조건에 해당될때 break 문을 통해 탈출
		while (condition) {
			count++;
			System.out.println(count);
			
			if(count == 5) {
				break;
			}
		}
	}

}
