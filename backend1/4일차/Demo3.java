package java_4day;

public class Demo3 {

	public static void main(String[] args) {
		int number = 55;
		printScore(number);
		number = -20;
		printScore(number);

	}
	
	// 점수의 범위는 0 ~ 99 까지를 검증하는 함수
	public static void printScore(int score) {
		if(score <0 || score > 100) {
			System.out.println("잘못된 점수");
			return;
		}
		System.out.println("정상 점수");
	}

}
