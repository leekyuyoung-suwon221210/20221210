package day2;

public class AbstractClassDemo implements MyInterFace{

	public static void main(String[] args) {
		// Circle 객체 만들고 적절히 사용해보세요
		
		Circle c = new Circle(3);
		c.draw();
		System.out.println( c.findArea() );
	}

}
