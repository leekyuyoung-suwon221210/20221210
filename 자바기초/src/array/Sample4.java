package array;

public class Sample4 {

	public static void main(String[] args) {
		boolean[] checks = {false,false,false};
		System.out.println(checks.length);
		int index = 0;
		checks[index] = true;
		checks[index+1] = true;
		checks[index+2] = true;
		System.out.println(index);
		System.out.println(checks[checks.length-1]);

	}

}
