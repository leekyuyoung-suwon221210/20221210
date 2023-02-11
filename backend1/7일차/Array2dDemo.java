package java_7day;

public class Array2dDemo {
	public static double round(double x, int index) {
		return Math.round((x)*(index *10))/(index *10);
	}
	
	public static void main(String[] args) {
		// 2차원 배열을 만들고 초기화
		double[][] interest = {
				{3.2, 3.1, 3.2, 3.0}, // 1차 년도의 이자
				{2.9, 2.8, 2.7, 2.6}, // 2차 년도의 이자
				{2.7, 2.6, 2.5, 2.7} //  3차 년도의 이자
		};
		
		double total = 0.0;
		for (int i = 0; i < interest.length; i++) {
			double[] temp =  interest[i];
			double sum = 0.0;
			for (int j = 0; j < temp.length; j++) {
				sum += temp[j];
			}
			double avg = sum / temp.length;
			total += avg;
			System.out.printf("%d차년도 평균 이자율 = %.2f\n",i+1, avg);
		}
		System.out.println("3년간 평균 이자율 = " + round(total, 2));
		System.out.println(total);

	}

}
