package variableType;
/*
 * ���ڿ� �񱳴� equals��  ����Ѵ�. �����񱳴� �ٺ�....
 */
public class Demo3 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.println(str1 + " " + str2);
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		System.out.println("hashcode : " + System.identityHashCode(str1));
		System.out.println("hashcode : " + System.identityHashCode(str2));
		
		System.out.println("--------hashcode compare-------");
		String str3 = "abc";
		String str4 = "abc";
		System.out.println("hashcode : " + System.identityHashCode(str3));
		System.out.println("hashcode : " + System.identityHashCode(str4));
		

	}

}
