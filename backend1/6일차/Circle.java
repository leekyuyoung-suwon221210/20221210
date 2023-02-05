package java_6day;

public class Circle {
	private String color;
	private double radius;
	public String getColor() {
		return color;
	}
	public Circle setColor(String color) {
		this.color = color;
		return this;
	}
	public double getRadius() {
		return radius;
	}
	public Circle setRadius(double radius) {
		this.radius = radius;
		return this;
	}
	public void show() {
		System.out.printf("color is %s and radius is %.2f\n", color, radius);
	}
	
	
}
