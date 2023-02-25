package day2_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentDemo {
	public static void main(String[] args) {
		// 5명의 학생객체를 만들어서 리스트에 담아 보세요		
		List<Student> st = new ArrayList<Student>();
		st.add(new Student("b",80));
		st.add(new Student("a",70));
		st.add(new Student("f",50));
		st.add(new Student("c",90));
		st.add(new Student("e",100));
		System.out.println(st);	
		// 리스트에 들어있는 학생데이터를 점수가 높은 순으로 정렬 하고 출력
		st.sort(null);
		System.out.println(st);
		
		// ------ 이후 조금있다가
		// // 리스트에 들어있는 학생데이터를 이름순으로 출력
		st.sort(
				new Comparator<Student>() {

					@Override
					public int compare(Student o1, Student o2) {						
						return o1.name.compareTo(o2.name);
					}					
				}				
				);
		System.out.println(st);		
		
		
		
		

	}

}
