package loop;

/*
 * 1 ~ 100까지의 수 중에서 3의 배수(3으로 나눠서 나머지가 0인 수)가 몇개인지 카운트 해서 출력
 */
public class Sample4 {

	public static void main(String[] args) {		
		int count = 0;
		int i = 1;
		
		while(i < 101) {
			if(i % 3 == 0)
				count++;
			i++;
		}
		System.out.println("count = "+count);

	}

}
