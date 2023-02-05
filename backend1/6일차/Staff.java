package java_6day;

public class Staff {
	// 변수 : name, age --> 캡슐화
	// 메소드 : sayHello  리턴타입 없고 내용 없는
	private String name,address;
	private int age, height,weight;	
	
	public String getAddress() {
		return address;
	}
	public Staff setAddress(String address) {
		this.address = address;
		return this;
		
	}
	public int getHeight() {
		return height;
	}
	public Staff setHeight(int height) {
		this.height = height;
		return this;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public Staff setName(String name) {
		this.name = name;
		return this;
	}
	public int getAge() {
		return age;
	}
	public Staff setAge(int age) {
		this.age = age;
		return this;
	}
	public void sayHello() {
		System.out.printf("hello %s i am old  %d years \n",name,age);
	}
	
}
