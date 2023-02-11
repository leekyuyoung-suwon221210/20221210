package java_7day;

public class StudentDemo {

	public static void main(String[] args) {
//		객체만들고 데이터 적절하게 셋팅하고 값 확인
		Student s = new Student(); // 시스템이 자동으로 생성자 호출
		s.setName("Mr Hong");
		System.out.println(s); // 객체자체를 출력하면 toString() 호출한다.--- 시스템이 자동으로

	}

}
