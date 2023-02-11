package java_7day;

public class Student {
	// 변수
	private String name;  // 은닉화
	// 메소드

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	
}
