package java_8day;

class Circle{
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.14*radius*radius;	
	}
}

public class ListDemo8 {

	public static void main(String[] args) {

		Circle[] ary = {new Circle(1.0), new Circle(2.0), 
				new Circle(3.0),new Circle(4.0),new Circle(5.0) };
		
		for (Circle c : ary) {
			System.out.printf("원의 넓이(반지름 : %.2f) = %.2f\n",c.getRadius(),c.getArea());
		}
		
		

	}

}
