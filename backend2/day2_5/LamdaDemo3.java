package day2_5;

interface Mathmatical{
	double calculate(double b);
}

interface Pickable{
	char pick(String s, int i);
}
interface Computable{
	int compute(int x, int y);
}
class Utils{
	int add(int a, int b) {
		return a+b;
	}
}

public class LamdaDemo3 {
	public static double myfunc(double b) {
		return Math.abs(b);
	}
	
	public static void main(String[] args) {
		Mathmatical m;
		Pickable p;
		Computable c;
		
		m  = (double b)->{ return (b>0)? b : -b;  };
		m = b-> (b>0)? b : -b ;
		
		// 람다식 기능을 구현(기존 Math.abs를 이용한)
		m = b-> Math.abs(b) ;
		m.calculate(-50.2);
		
		// 기존 Math 클래스의 abs 함수를 m으로 참조
		m = Math::abs;
		m.calculate(-52.3);
		
		
		p = (String s, int i)-> { return s.charAt(i);};
		p = (String s, int i)-> s.charAt(i);
		p = (s, i)-> s.charAt(i);
		p = String::charAt;
		p.pick("abc", 0);
		
		c = Math::addExact;
		c.compute(10, 20);
		
		Utils u = new Utils();
		c = (a,b) -> u.add(a, b);
		c = u::add;

	}

}
