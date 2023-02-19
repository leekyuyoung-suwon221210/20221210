package day2;

public class Circle extends Shape{
	private int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	
	// 반드시... 없으면 에러
	@Override
	void draw() {
		System.out.println("원을 그린다");		
	}

	// 선택사항
	@Override
	public double findArea() {
		// TODO Auto-generated method stub
		return pi*radius*radius;
	}
	
	

}
