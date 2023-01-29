package java_4day;
/*
 * 배열 : 연속적인 데이터의 집합
 *       동일한 데이터 타입 - 묶는다
 *       동적 배열지원 안함 - 생성시 배열갯수를 지정
 *       타입[] 배열변수명;
 *       타입 배열변수명[];
 */
public class Demo7 {

	public static void main(String[] args) {
		// 정수형 데이터 5개를 저장 할 수 있는 배열만들기
		int[] temp;		
		int[] ary = {0,0,0,0,0}; // 생성과 동시에 초기화
		// 배열의 크기는 배열변수명.length
		System.out.println("ary length : " + ary.length);
		
		temp = new int[3];
		System.out.println("temp length : " + temp.length);
		
		int[] temp2 = new int[3];
		
		// 배열 만드는 방법 -  생성과 동시에 초기화
		int[] ary2 = {0,0,0,0,0}; // 생성과 동시에 특정 값으로 초기화 
		int[] temp3 = new int[3];
		
		// 배열 만드는 방법 -  선언먼저하고 데이터 나중에 초기화
		// 배열은 타입의 기본값으로 초기화가 자동으로 됨
		int[] temp4;
		temp4 = new int[3];		
		
		
		
		

	}

}
