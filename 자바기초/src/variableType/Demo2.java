package variableType;

public class Demo2 {

	public static void main(String[] args) {
		// ���ڿ�.. �⺻ ������Ÿ���� �ƴ� ������ �⺻ ������ Ÿ��ó�� ���
		int num1 = 10;
		int num2 = num1;
		System.out.println(num1 + " " + num2);
		System.out.println(num1 == num2);
		num1 = 20;
		System.out.println(num1 + " " + num2);
		
		System.out.println("-----------------------");
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1 + " " + str2);
		System.out.println(str1 == str2);
		str1 = "cba";
		System.out.println(str1 + " " + str2);
		
		
		
		
		

	}

}
