package backend1_기본입출력;
/*
 * sysout  - System.out.println
 * main - public static void main(String[] args) {}
 * 자동완성 기능  ctrl + space
 * 줄 맞춤 : shift+ctrl+f
 */
public class PrintDemo {
	public static void main(String[] args) {
//		System.out.print("안녕하세요\n");  
//		System.out.print("반가워요");
		
		double average = 3.12815151212;		
		System.out.printf("average = %f\n",average);  // 기본이 6자리
		System.out.printf("average = %.6f\n",average);
		System.out.printf("average = %.2f",average);		
		
		
		
		
	}
}
