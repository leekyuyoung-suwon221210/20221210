package java_6day;

/*
 * 클래스의 95% 이상은 맴버변수를 만들때 캡슐화 한다...  private 
 */
public class Person {
	private int age;
	// height, weight, name
	private int height, weight;
	private String name;

	// 생략되어 있다. 생성자..매개변수가 없는 -- > 기본생성자 -> 객체를 만들어준다.. -> 흐름상.. 생성자호출뒤에
	// 시스템에서 알아서 객체를 생성해 준다.
	// 생성자는 리턴타입을 기술하지 않는다.
	// why - special
	
	public Person() 
	{
		this(1, 1, 1, null);
		int a;
		// 생성자 위임
	}

	// 매개변수 생성자
	public Person(int age, int height, int weight, String name) {
//		super();
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.name = name;
	}

}
