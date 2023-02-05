package java_6day;
/*
 * 변수 : 클래스의 특징  
 * 메소드 : 동작
 */
public class Triangle {
	int x,y;
	double getArea() {
		return x * y / 2.0;  // @@@.0
	}
	// 삼각형의 가로는: 세로는 :  넓이는 :
	void show() {
		System.out.printf("삼각형의 가로는:%d  높이는:%d  넓이는 %.2f\n",x,y,getArea());
	}
}
