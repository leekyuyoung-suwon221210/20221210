package java_6day;

public class StudentDemo {
	
	public static void main(String[] args) {
		StudentMng sm = new StudentMng();

		Student s = new Student();
		s.inputData();
		s.getMean();
		s.calcGrade();
		s.studentInfo();
		
		sm.makeClass(s);
		
		Student s1 = new Student();
		s1.inputData();
		s1.getMean();
		s1.calcGrade();
		s1.studentInfo();
		
		sm.makeClass(s1);

	}

}
