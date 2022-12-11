package operator;

public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "홍길동";
		// name이라는 변수가 null 이 아니고 길이가 0보다 커야한다.
		System.out.println( (name != null &&  name.length() > 0) );
		System.out.println( (name.length() > 0 && name != null ) );
		
		name = null;
		System.out.println(name != null);
//		System.out.println( name.length() > 0);  // 여기서 죽는다
		System.out.println( (name != null) &&  (name.length() > 0) );
//		System.out.println( (name.length() > 0) && (name != null) ); // 죽는다
		
		name = "";
		System.out.println( (name.length() > 0) && (name != null) );
	}

}
