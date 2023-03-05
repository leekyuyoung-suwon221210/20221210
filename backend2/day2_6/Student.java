package day2_6;

public class Student {
	private String name;

	public String getName() {
		return name;
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			return this.name.equals(((Student)obj).name);
		}
		return false;
	}
	

	@Override
	public int hashCode() {		
		return name.hashCode();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
}
