package java_7day;

public class CircleDemo {

	public static void main(String[] args) {		
		// static 맴버 호출 : 클래스명으로 호출
		System.out.println(Circle.circleMaxNum);
		
		// 인스턴스 맴버 호출 : 객체를통해서(즉 객체생성)
		Circle c = new Circle();
		c.setRadius(2.36);
		
//		c.MAXCIRCLENUM = 20;  // error
		int temp = c.MAXCIRCLENUM;
		System.out.println(Circle.MAXCIRCLENUM);
		
		Circle c2 = new Circle();
		System.out.println(Circle.MAXCIRCLENUM);
		
		//////////////////////////////////////////////////
		
		
	}

}
