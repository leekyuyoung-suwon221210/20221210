package day1_2;

public class Demo {

	// 다형성..... 다양한 형태로 존재한다.  실객체의 메소드를 호출 누굴통해서.... 부모를 통해서
	// 조건 상속관계고 부모의 함수가 자식에서 재정의 되었을때
	public static void main(String[] args) {
		Animal[] ani = {new Eagle(), new Eagle(), new Fish(),new Tiger(),new Fish()	  };
		for (Animal a : ani) {
			a.move();			
		}
		
	}

}
