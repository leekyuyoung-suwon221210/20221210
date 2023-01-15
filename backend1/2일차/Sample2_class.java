package backend1_기본입출력;


/*
 * 클래스를 생성
 * 사용자 정의 데이터 타입
 * 객체를 만들고 객체 자체를 변수처럼 출력
 */
public class Sample2_class {
	// 생성자 기본으로 존재
	// 사용자 정의 생성자
	public Sample2_class() {
		System.out.println("기본생성자 호출");
	}
	public Sample2_class(String name) {
		System.out.println("매개변수 생성자 호출");
		System.out.println("매개변수 : " + name);
	}
	
	private int age;

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// 객체를 변수처럼 사용하려고 객체 자체를 출력위 한 함수
	@Override
	public String toString() {		
		return String.format("age : %d", age);
	}
}
