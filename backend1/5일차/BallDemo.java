package java_5day;

public class BallDemo {

	public static void main(String[] args) {
		//변수 만들듯이 Ball이라는 새로운 타입(클래스)를 이용해서 만든다.
		// 초기화 한다.
		
		int a;  // 1
//		System.out.println(a);
		a = 0;  // 2
		
		int a2 = 0;
		
		Ball b;
//		System.out.println(b.radius);
		b = new Ball();
		
		Ball c = new Ball();
		System.out.println(c.radius);
		System.out.println( c.getVolume() );

	}

}
