/**
 * 
 * 상속 * 
 * 모든 자식 생성자는 부모의 기본생성자를 기본으로호출하게 되어 있다.(숨겨져 있음)
 * 자식 생성자에서 부모의 특정 생성자를 지정해서 호출할수 있다 - 이때 super(......)사용
 */

class Person{
	protected int age,weight,height;
	public Person() {}
	public Person(int age, int weight, int height) {
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
} 
class Korean extends Person{

	public Korean(int age, int weight, int height,String lang) {
		super(age, weight, height);		
		this.lang = lang;
	}
	
	public Korean() {
		super(0, 0, 0);
		this.lang = "kor";
	}	
	private String lang;
}

public class Demo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
