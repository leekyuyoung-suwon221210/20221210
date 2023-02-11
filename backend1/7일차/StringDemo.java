package java_7day;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "Hi java!";
		String s2 = "Hi java!";
		
		s2 = "abc";		
		System.out.println(s1);
		
		
		String s3 = new String("Hi java!");
		String s4 = new String("Hi java!");
		// s1 ~ s4 객체를 출력
		System.out.println("s1 == s2 : " + (s1==s2));
		System.out.println("s1 == s3 : " + (s1==s3));
		System.out.println("s3 == s3 : " + (s3==s4));
		
		s1 = s3;
		System.out.println("s1 == s3 : " + (s1==s3));
		
		System.out.println("#".repeat(20));

		String str = 
		"a"+
		"b"+
		"c";
		System.out.println(str);
		
		String str2 = """
				abc
				def
				""";
		System.out.println(str2);
	}

}
