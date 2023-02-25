package day2_3;

public class Demo3 {
	public static void fff(Controllerable a) {
		if(a instanceof NoteBook) {
			NoteBook ab = (NoteBook)a;			
		}
		else if(a instanceof Tv) {
			Tv ab = (Tv)a;
		}
		
	}
	
	public static void main(String[] args) {
		fff(new Tv() );
		
		// 인터페이스 타입 = 구현 객체    // up-Casting 자동
		Controllerable c = new Tv();	
		c = new NoteBook();		
		
		// 구현객체 타입 = (구현객체 타입)인터페이스 타입  // down-Casting  수동
		NoteBook n = (NoteBook)c;
		
		// 다형성 : 다양한형태로 존재, 부모타입으로 자식객체를 보관하는 기법
		//  사용 : 부모와 자식이 같은 메소드를 가질때(override) 부모타입으로 해당 메소드를 호출하면
		//        실객체의 메소드가 자동으로 호출된다.(따로 타입캐스팅으로 타입변환과정이 필요 없음)
		
		// 만약에... 실객체만 가지고 있는 메소드가 필요할때는 해당 타입으로 캐스팅해줘야 하는데..
		//         어떤 객체가 들어 있는지 모른다.
		
	}

}
