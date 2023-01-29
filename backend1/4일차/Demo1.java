package java_4day;

public class Demo1 {

	public static void main(String[] args) {
		// 순환문을 이용해서 1 ~ 10 까지의 합
		
		
		int sum = 0;
		for (int i = 1; i < 11; i++) {
//			sum = sum + i;
			sum += i;
		}
		System.out.println("sum = "+ sum);
		
		
		
		
		
		// 순환문을 이용해서 10 ~ 100 까지의 합
		sum = 0;
		for (int i = 10; i < 101; i++) {
//			sum = sum + i;
			sum += i;
		}
		System.out.println("sum = "+ sum);
		
		// 순환문을 이용해서 100 ~ 1000 까지의 합
		sum = 0;
		for (int i = 100; i < 1001; i++) {
//			sum = sum + i;
			sum += i;
		}
		System.out.println("sum = "+ sum);
	}

}
