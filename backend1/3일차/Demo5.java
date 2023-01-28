/**
 * 순환문 : 반복 
 *
 */
public class Demo5 {

	public static void main(String[] args) {
		int sum = 0;
		// 10씩 10번 더한결과.
		int count = 0;
		
		// 0+1+2+3+9
		while (count < 10) // 무한루프
		{
			sum += count;
			count++;	
		}		
		
		System.out.println("sum = " + sum);

	}

}
