package variableType;

public class Demo4 {

	public static void main(String[] args) {
		// ==  !=  >  <  >=   <= 
		String str1 = "a";
		String str2 = "b";
		System.out.println(str1.compareTo(str2));  // -1   a < b
		
		String str3 = "b";
		String str4 = "a";
		System.out.println(str3.compareTo(str4)); // 1
		
		String str5 = "a";
		String str6 = "a";
		System.out.println(str5.compareTo(str6)); // 0
		
		// a >= b    °á°ú°¡ 0
		

	}

}
