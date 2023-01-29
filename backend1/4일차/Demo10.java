package java_4day;

public class Demo10 {

	public static void main(String[] args) {
		// one class
		// student number : 5
		// subject per student : 3
		String[] studentNames = {"김가","이가","최가","박가","홍가"};
		int[][] subjects = {
				{80,90,70},{90,80,70},{80,70,90},{100,100,100},{99,99,99}	
		};
		double[] avgs = {0.0,0.0,0.0,0.0,0.0};
		
		// 2차원 배열일 subjects를 순환하면서 각 1차원 배열의 평균을 구해서 해당 순서에 맞게 avgs에 대입한다.
		for (int i = 0; i < subjects.length; i++) { // 2차원을 구성하는 1차원 갯수
			int total = 0;
			for (int j = 0; j < subjects[i].length; j++) { // 1차원을 구성하는 데이터의 갯수
				total += subjects[i][j];
			}
			avgs[i] =  (double)total / subjects[i].length;
		}
		
		// 종합적으로 출력
		// 이름       국    영    수    평균
		System.out.println("이름\t국\t영\t수\t평균\t");		
//		System.out.println("이가\t100\t90\t90\t98.5\t");
		
		for (int i = 0; i < 5; i++) {
			String name = studentNames[i];
			String subject = "\t";
			for (int j = 0; j < 3; j++) {
				subject += subjects[i][j]+"\t";
			}
			String avg = avgs[i]+"";
			System.out.println(name+subject+avg);
		}
		

	}

}
