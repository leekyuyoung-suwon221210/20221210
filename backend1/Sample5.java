package backend1;

public class Sample5 {

	public static void main(String[] args) {
		// 참 거짓을 만들때는 성공했니? 라는 뉘양스를 주도록 is0000  형태로 만든다.
		boolean isSuccess = true;
		System.out.println(isSuccess);
		System.out.println(!isSuccess);
		System.out.println( !(!isSuccess) );
		
		// 두 개의 정수형 변수를 만들고
		int num1 = 10, num2 = 3;
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		// 나머지  연산을 해서 결과를 출력 % 
	}

}
