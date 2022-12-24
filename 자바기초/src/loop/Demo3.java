package loop;

public class Demo3 {

	public static void main(String[] args) {
		int count = 0;
		boolean isContinue = false;

		do {
			System.out.println(count);
			count++;
		} while (isContinue);
		
		
		
		while (isContinue) {
			System.out.println(count);
			count++;
		}

	}

}
