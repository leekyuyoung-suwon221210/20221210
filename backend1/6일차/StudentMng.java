package java_6day;
/*
 * 학생관리 클래스
 * 
 */
public class StudentMng {
	// student 클래스의 배열 변수
	int maxClass = 15;
	Student[] students = new Student[maxClass];  // 객체는 초기화로 null
	int currentPos = 0;
	void makeClass(Student s) 
	{
		// 배열의 크기를 넘어가지 않기 위해서.
		if(currentPos+1 > maxClass) {
			System.out.println("클래스의 정원을 넘어섰습니다(15명)");
			return;
		}
		students[currentPos++] = s;		
	}
	void showClass() {
		System.out.println("이름\t국어\t영어\t수학\t평균\t학점\n");
		for (int i = 0; i < students.length; i++) {
			if(i > currentPos-1) {
				return;
			}
			students[i].studentInfo();
		}
	}
	
}
