package array2d;

public class Demo3 {

	public static void main(String[] args) {
		int[][] scores = {
				{80,70,90},
				{65,88,95},
				{78,62,55},
				{98,98,98}
		};
		String[] names = {"kim","lee","choi","park"};
		String[] subjects = {"kor","eng","math"};
		
		
		int[] totals = {0,0,0,0};
		double[] avgs = {0.0,0.0,0.0,0.0};
		String[] maxSubjecs = {"","","",""};
		
		for (int humanRow = 0; humanRow < scores.length; humanRow++) {			
			//¡¡per row
			int max = 0;
			for (int subcol = 0; subcol < scores[humanRow].length; subcol++) {
				if(max < scores[humanRow][subcol]) {
					max = scores[humanRow][subcol];
					maxSubjecs[humanRow] = subjects[subcol];
				}
				totals[humanRow] += scores[humanRow][subcol];
			}
			totals[humanRow] = totals[humanRow];
			avgs[humanRow] = totals[humanRow] / scores[humanRow].length;			
		}
		
		/*
		 kim total:240  avg:80 maxsubject:math
		 ..		 		 
		 */
		for (int i = 0; i < 4; i++) {
			String str = String.format("%s %d %f %s", names[i],totals[i],avgs[i],maxSubjecs[i] );
			System.out.println(str);
		}
		

	}

}
