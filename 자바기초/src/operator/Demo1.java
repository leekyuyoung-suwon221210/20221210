package operator;

public class Demo1 {

	public static void main(String[] args) {
		// 정수형 변수 만들고 10으로 초기화
		int num = 10;
		System.out.println(num);
//		int num2 = ++num;
		int num2 = num++;
		System.out.println(num2);
		System.out.println(num);
	}

}
