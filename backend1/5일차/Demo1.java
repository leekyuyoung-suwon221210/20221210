package java_5day;

// 용어 : method  function(함수)
// 함수 또는 메소드
// 함수 : 독립적으로 생성 해서 독립적으로 사용
// 메소드 : 클래스 내부에 해당 클래스의 맴버로서 생성 객체를 통해 사용
// 함수에 데이터를 전달하는 방식 
// 1. call by value
// 2. call by reference
// 1,2, 둘다.. 값이 복사되서 함수로 넘어간다... copy
public class Demo1 {

	public static void main(String[] args) {
		int a = 0;
		// 함수호출
		increment(a);
		System.out.println("함수호출한 후 전달한 a의 값 = "+ a);

	}
	
	public static void increment(int a) {
		System.out.println("전달받은 값 a = " + a);
		a++;
		System.out.println("함수에서 수정한 값 a = " + a);
	}

}
