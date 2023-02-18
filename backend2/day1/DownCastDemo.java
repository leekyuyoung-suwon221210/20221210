package day1;
// 상속관계에서만 허용  -- 클래스들간의 형변환
// upcast  타입을 상위타입으로 변경한다  형변환(type casting)
// 상속관계에서 자식이 부모타입으로 변경하는걸
// 오토캐스팅
public class DownCastDemo {

	public static void main(String[] args) {
		Person p = null;
		Student s = new Student();
		
//		p = (Person)s;
		p = s;
		p.whoami();		

	}

}
