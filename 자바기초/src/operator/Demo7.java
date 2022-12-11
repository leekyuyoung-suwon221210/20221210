package operator;

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		System.out.println( (num > 0) && (num <-10) );  // 논리적 모순(절대로 true가 될수 없음)
		System.out.println( (num > 0) || (num <-10) );
	}

}
