package day1;
// 상속관계에서만 허용  -- 클래스들간의 형변환
// donwcast  타입을 자식타입으로 변경한다  형변환(type casting) 강제로 해야함
// 부모타입의 객체를 자식타입으로 전달하는 모습 이때 부모타입의 객체는 타입만 부모지 실제 자식객체일때
public class UpcastDemo {

	public static void main(String[] args) {
		Person p = new Student();  // 업캐스트 자동
		Student s = (Student) p; // 다운캐스트 수동
		
		// 객체 p는 자신의 타입의 객체가 있을수도 있고.. 자식들의 객체가 들어있을수 도 있다.
		
	}

}
