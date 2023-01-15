package review;

public class Review1 {
	private int number;
	
	
	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public static void main(String[] args) {
		// 주석은 컴파일 되지 않는 명령어..
		// 주석의 목적 : 프로그램 설명 또는 각종 정보
		
		// 변수는 타입을 가지고 "타입 변수명 = 데이터"
		// int 는 정수형을 가리키는 타입이다.
		
		
//		int number = 0;
//		int score = 0;
//		int kore = 0;
//		int eng = 0;
//		int math = 0;
		int number = 0, score = 0, kore = 80, eng = 95, math = 100 ;		
		double mean = 0.0;
		double avg;  // 변수 선언만 하고 초기화를 안했음.. 이때 avg 변수에는 어떤 값이 있을까?  
		// 변수에들어 있는 값은 누군가가 쓰고 반납한 의미없는 데이터 또는 데이터로 표현하기 불가능한 어떠한 값
		// 변수는 초기화가 안된상태에서는 사용 불가		
		avg = 0.0;		
		double total = avg + mean;
		
		
		// 1. 변수선언과 동시에 초기화
		// 2. 변수를 선언하고 나중에 초기화
		// 초기화 : 최초로 값을 셋팅
		
		// 타입의 속성... 크기가 있다... double > int
		
		// 연산자의 속성.... 피연자의 타입을 통일하고 연산
		// + - * /
		// 대입연산자 : 왼쪽 타입에 따라서 오른쪽 타입이 변경
		
		// 작은 타입에서 ->큰 타입으로 변환  : 논리적으로 문제가 없죠  컴파일러가 자동으로 type casting
		double total2 = number;
		//  double total2 = (double)number;
		
		// 큰 타입에서 ->작은 타입으로 변환  : 논리적으로 문제가 있죠   개발자기 직접 수동으로 type casting
		int number2 = (int)total;   // 타입변환은  (원하는타입)변수
		
		// 일반적인 사칙연산은 큰타입 기준으로 맞춰
		System.out.println( number + total );
		
		// 정수 / 정수 는 결과를 정수
		
		mean = (kore + eng + math)*1.0 / 3 ;  // 91.6 .....
		System.out.println("평균 : " + mean);
		
		
		 

		
		
		
		
		
		
		
		

	}

}
