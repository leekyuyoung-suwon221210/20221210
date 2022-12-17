package review;

public class Demo2 {
	public static void main(String[] args) {
		// 연산자  사칙연산자
		// 단항연산자  : 연산자와 피연산자가 각각  한개씩.
		//	++ , --
		int number = 0;  // 정수형 변수를 선언하고 초기값으로 0을 대입
		++number; // 기존에 number  가 가지고 있는 값에 1을 더해서 누적한다.
		number++; // 누적시점... 앞에있으면 그 즉시 반영  , 두에 있으면 해당명령어가 끝나고난뒤 
		
		number--; // 기존에 number  가 가지고 있는 값에 1을 째서 누적한다.
		// 이항연산자 : 연산자의 좌우에 피 연산자가 한개씩  1 + 2
		int number2 = number; 
		int result = number + number2;
		
		// 대입연산의 기호는    '='
		// 복합대입연산자  누적연산을 가능
		//	 number += 100;
		//	 number = 100;
		// 오른쪽에서 왼쪽으로 흐른다
		
		// 비교연산자  크가 작다 같다 같지않다. 결과는 true false 라는 0 1 해당하는 형태를 반환
	}
}
