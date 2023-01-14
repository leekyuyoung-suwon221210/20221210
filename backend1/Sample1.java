package backend1;

public class Sample1 {

	public static void main(String[] args) {
		// 입력한값 을 가지고 순환문
		int number = 6;
		String primstr = "소수";
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				primstr = "소수가 아님";
				break;
			}
		}
		String result = String.format("입력한 %d는 %s 입니다.", number,primstr );		
		System.out.println(result);
		

	}
}


