package loop;
/*
 * -1에서 -5까지 합을 구하세요 순환문 이용
 */
public class Sample2 {

	public static void main(String[] args) {
		int count = -1;
		int sum = 0;

		while (count >= -5) {
			sum += count;
			count--;
		}
		System.out.println(sum);

	}

}
