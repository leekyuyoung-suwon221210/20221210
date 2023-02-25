package day2_3;

public class Student implements Comparable<Student>{
	String name;
	int jumsu;
	public Student(String name,int jumsu) {
		this.name = name;
		this.jumsu = jumsu;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", jumsu=" + jumsu + "]";
	}
	@Override
	public int compareTo(Student o) {		
		return this.jumsu-o.jumsu;
	}
	
}
