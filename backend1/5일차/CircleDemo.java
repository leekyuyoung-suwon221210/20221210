package java_5day;

public class CircleDemo {

	public static void main(String[] args) {
		// Circle 클래스의 객체  생성하기
		Circle c = new Circle();
		c.radius = 2.5;
		double result =  c.findArea();

		// c.메소드 호출하면 아래와 형태로 출력되도록 새로운 메소드를 Circle 클래스에 정의하고 사용
		// 반지름은 2.5 이고 넓이는 19.625 입니다.
		c.show();
	}

}
