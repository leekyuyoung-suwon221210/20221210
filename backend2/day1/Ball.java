package day1;

public class Ball extends Circle {
	String color;
	Ball(String color,double radius){		
		this.color = color;	
		this.radius = radius;
	}
	void findColor() {
		System.out.println(color + " 공이다");
	}
	
	
//	void findArea() {
//		System.out.println("넓이는 " + (3.14*radius*radius) +" 이다");
//	}
	
	@Override
	void findArea() {
		System.out.println("넓이는 " + (3.14*radius*radius) +" 이다");		
	}
	
	void findVolume() {
		System.out.println("부피는 "+(4.0/3*(3.14*radius*radius))+" 이다");
	}
}
