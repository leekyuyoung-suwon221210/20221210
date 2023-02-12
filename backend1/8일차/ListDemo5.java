package java_8day;

public class ListDemo5 {
	public static void increase(int[] x) {
		x[0]++;
	}
	
	public static void main(String[] args) {
		int[] number = {10};
		
		System.out.println("before function call : "+ number[0]);
		increase(number);
		System.out.println("after function call : "+ number[0]);
	}

}
