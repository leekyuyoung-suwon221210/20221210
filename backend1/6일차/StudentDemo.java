package java_6day;

public class StudentDemo {
	
	public static void main(String[] args) {
		StudentMng sm = new StudentMng();	
		int maxClassNum = 3;
		
		for (int i = 0; i < maxClassNum; i++) {
			Student s = new Student();			
			s.inputData();			
			sm.makeClass(s);
		}		
		sm.showClass();
	}

}
