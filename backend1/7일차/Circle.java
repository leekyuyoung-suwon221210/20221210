package java_7day;

public class Circle {
	public static int circleMaxNum = 100;  // 정적 맴버 변수 
	
	public static final int MAXCIRCLENUM = 200;
	
	private double radius;		    // 인스턴스 맴버 변수

	public Circle() {} // 기본생성자
	
	public Circle(double radius) {  // 매개변수 생성자
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// 인스턴스 메소드안에서는 정적요소를 사용할수 있음
	public double getSize() {
		// 스테틱변수를  사용
		System.out.println(MAXCIRCLENUM);
		return radius*radius*3.14;
	}
	// 정적 메소드안에서는 인스턴스요소를 사용할 수 없다
	public static double show() {
		System.out.println(MAXCIRCLENUM);		
		return MAXCIRCLENUM;
	}	
	// static 은 끼리끼리 논다...  
	

}
