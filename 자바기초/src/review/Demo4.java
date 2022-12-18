package review;
/*
 * switch ~ case 
 */
public class Demo4 {
	public static void main(String[] args) {
		int key = 0;
		switch (key) {
		case 0:
			System.out.println("영");
			break;
		case 1:			
			System.out.println("일");
			break;
		case 2:			
			System.out.println("이");
			break;
		default:
			System.out.println("영 일 이 가 아닌 정수");			
			break;
		}
	}
}
