package java_4day;

public class Demo5 {

	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) 
		{
			gugudan(i);
			System.out.println();
		}

	}
	
	public static void gugudan(int dan) {
		for (int i = 1; i < 10; i++) {
			System.out.print(dan*i+" ");			
		}
	}

}
