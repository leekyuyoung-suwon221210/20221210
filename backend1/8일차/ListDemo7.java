package java_8day;

public class ListDemo7 {
	// 가변 매개변수  : 매개변수의 갯수가 정해지지 않고.. 사용자가 입력하는데로 사용
	 
	// sum(12.52,1,2,3,4,5,6,7 )
	
	
	// 원인 : 
	// 분석 :   
	// 해결 :	
	
	public static int sum( int c, double b,int... a) {
		while(true) {
			System.out.println("abc");
			break;
		}
		
		return 0;
	}
	
	public static int sum(int... a) {
		int total = 0;
		for (int data : a) {
			total += data;
		}
		return total;
	}
	
	public static void main(String[] args) {
		sum(10);
		sum(10,20);
		sum(10,20,30);
		sum(10,20,30,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,10);
		
	}	

}
