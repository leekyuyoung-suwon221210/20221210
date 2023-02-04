package java_5day;

public class PhoneDemo {

	public static void main(String[] args) {
		// phone 객체 2개를 만들어서 각각의 변수를 적당히 셋팅하고 show 함수 호출
		Phone p1 = new Phone();
		p1.model = "갤럭시";
		p1.price = 1000000;
		p1.print();
		
		Phone p2 = new Phone();
		p2.model = "아이폰";
		p2.price = 1200000;
		p2.print();
		
		p1 = p2;   // p1, p2는 같은 주소를 가지는 객체  즉.. 같은 객체
		p1.print();
		p1.price = 0;
		
		p2.print();
		
		

	}

}
