package java_5day;

public class Circle {
	double radius;
	double findArea() {
		return 3.14*radius*radius;
	}
	
	void show() {
		System.out.printf("반지름 %f이고 넓이는 %f 입니다\n",radius,findArea() );
	}
}
