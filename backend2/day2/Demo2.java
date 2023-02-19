package day2;

public class Demo2 {
	private static String makeComma(long number) {
		String num =  String.valueOf(number);
		int count = 1;
		String str = "";
		for (int i = num.length()-1; i > -1; i--) {			
			str += num.charAt(i);			
			if(count % 3 == 0 && i != 0) {
				str += ",";
			}
			count++;
		}		
		// 문자열 뒤집기
		String str2 = "";
		for (int i = str.length()-1; i > -1; i--) {
			str2 += str.charAt(i);
		}		
		return str2;
	}
	
	
	public static void main(String[] args) {
		System.out.println(makeComma(123456789));
		
		
	}

}
