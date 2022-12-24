package loop;

/*
 * 1 ~ 100까지의 수 중에서 5의 배수(5으로 나눠서 나머지가 0인 수)의 합계
 * do ~ while문 사용
 */
public class Sample5 {

	public static void main(String[] args) {		
		
		int sum = 0;
		int i = 1;
		
		do {
			if(i % 5 == 0)
				sum += i;
			i++;
			
		} while (i < 101);
		
		
		System.out.println("count = "+sum);

	}

}
