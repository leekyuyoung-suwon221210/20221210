package statement;

public class Sample2 {

	public static void main(String[] args) {
		// ������ 1~100���̿� ������ �����ؼ�
		// Ȧ���� 1�� ���ϰ� ¦���� �׷��� �д�.
		// Math.random()  0 ~ 1 ������ ������ �Ǽ��� ���� 
		System.out.println(Math.random());
		System.out.println(Math.random()*100);		
		System.out.println( (int)(Math.random()*100) );// 0<= ~ < 100
		System.out.println( (int)(Math.random()*100) + 1); // 1<= ~ < 101
		
		int number = (int)(Math.random()*100) + 1;
		// Ȧ���� 1�� ���ؼ� ¦���� ������ش�.
		if (number % 2 == 1)
			number++;		

	}

}
