package array2d;

public class Demo1 {

	public static void main(String[] args) {
		// 정방향 2차원 배열을 만들어서.. 각 대각선의 합을 구하시오
		// 3 X 3
		int[][] num2d = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		//num2d[0][0]
		//num2d[1][1]
		//num2d[2][2]
		int sum = 0; 
		for (int i = 0; i < num2d.length; i++) {
			sum += num2d[i][i];
		}
		System.out.println(sum);
		
		sum = 0;
		for (int i = 0; i < num2d.length; i++) {
			sum += num2d[i][num2d.length - (i+1)];			
		}
		System.out.println(sum);
		
		// 0  num2d.length - (i+1)
		// 1  num2d.length - (i+1) 
		// 2  num2d.length - (i+1)
		//num2d[0][2]
		//num2d[1][1]
		//num2d[2][0]

	}

}
