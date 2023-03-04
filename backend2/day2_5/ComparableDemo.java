package day2_5;

import java.util.Arrays;
import java.util.Comparator;

class Rectangle implements Comparable<Rectangle>{
	private int width,height;

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	public int findArea() {
		return width*height;	
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	@Override
	public int compareTo(Rectangle o) {
		// TODO Auto-generated method stub
		return this.findArea() - o.findArea();
	}
	
	
}

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle[] r = {
			new Rectangle(10, 5),	
			new Rectangle(2, 5),
			new Rectangle(4, 3),
		};
		for (Rectangle rectangle : r) {
			System.out.println(rectangle);
		}
		
		System.out.println("-------------------------------------");
//		// 클래스내부에 정렬 기능을 내장
//		Arrays.sort(r);
//		
//		
//		// 정렬을 수행하는 익명 클래스 객체를 바로 생성해서 사용
//		Arrays.sort(r, new Comparator<Rectangle>() {
//			@Override
//			public int compare(Rectangle o1, Rectangle o2) {				
//				return o1.findArea()-o2.findArea();
//			}
//		});
		
		Arrays.sort(r, (a, b) ->a.findArea() - b.findArea()  );
		
		for (Rectangle rectangle : r) {
			System.out.println(rectangle);
		}
	}

}
