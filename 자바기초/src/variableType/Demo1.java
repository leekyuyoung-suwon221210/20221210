package variableType;

public class Demo1 {
	public static int global_variable = 0; // 전역변수 - 클래스내에서는 전부 사용 가능

	public static void main(String[] args) {
// TODO Auto-generated method stub
// 1. 정수형 변수 선언하고 적절할 데이터 로 초기화
// 2. 실수형 변수 선언하고 적절한 데이터 로 초기화
		global_variable = 20;
		int num = 0; // 해당함수내에서는 사용 가능
		int num2 = 0;
		int num3; // 변수는 할당하면 초기화 하지 않으면 가비지데이터가 들어있음
		int result = num + num2;

// 변수를 초기화 하지않으면 무슨일이 일어날까? 왜 연산이 안될까?
// 변수를 연산할때는 반드시 초기화를 한 이후에 사용

// local variable :  지역변수 
// global variable : 전역변수
		{
			int num4 = num;
			global_variable = 100;
		}
//		int num5 = num4;  // num4는 생성한 블럭을 벗어났기때문에 여기서는 존재하지 않는 변수		
		global_variable = 200;
		
		// 형변환(Type Casting)  타입이 다른 변수의 타입을 임시로 변경,  자바는 동일한 타입으로 연산
		int number = 10;
		double percent = 12.5;
		// 자바는 동일한 타입으로 (대입)연산을 한다
		percent = number;  // 묵시적 형변환(auto casting), 
		number = (int)percent; // 명시적 형변환(non-auto casting)
		
		// 숫자의 타입은 int가 기본  
		// 실수의 타입은 double 이 기본
		float pecent2 = (float)12.5; 
		
		float pecent3 = 12.5f;
		
//		long longnumber = 10;
//		long longnumber = (long)10;
//		long longnumber = 10L;
		long longnumber = 10l;
		
		
		
	}
}









