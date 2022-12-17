package statement;

public class Sample2 {

	public static void main(String[] args) {
		// 난수를 1~100사이에 난수를 생성해서
		// 홀수면 1을 더하고 짝수면 그래로 둔다.
		// Math.random()  0 ~ 1 사이의 임이의 실수를 리턴 
		System.out.println(Math.random());
		System.out.println(Math.random()*100);		
		System.out.println( (int)(Math.random()*100) );// 0<= ~ < 100
		System.out.println( (int)(Math.random()*100) + 1); // 1<= ~ < 101
		
		int number = (int)(Math.random()*100) + 1;
		// 홀수면 1을 더해서 짝수로 만들어준다.
		if (number % 2 == 1)
			number++;		

	}

}
