package backend1_기본입출력;

public class Sample1 {

	public static void main(String[] args) {
		// 문자열 + 모든 타입 --> 모든 타입을 문자열로 변경하고  문자열을 합친다
		int number = 12;
		System.out.println("오늘 온도 :  ");
		System.out.println("오늘 온도 :  " + number);
		System.out.println( number + 100);
		System.out.println(""+ number + 100);
		
		// 일정한 패턴을 가지는 문자열중에서 수치 형이나 기타 몇가지만 바뀔때
		// 복잡한 형식의 문자열을 만들때
		
		// 고지서, 합격증, 졸업장
		
		String aptName = "삼성";
		String dong = "101";
		String ho = "105";
		int money = 12000;
		String year = "2023";
		String month = "01";
		String day = "01";
		// 000아파트 000동00호 의 관리비는 0000원 입니다.  0000년 00월 00일까지 납부해주세요
		
//		System.out.println(aptName+"아파트"+" "+dong+"동");
		System.out.printf("%s아파트 %s동%s호 의 관리비는 %d원 입니다.  %s년 %s월 %s일까지 납부해주세요",
				aptName,dong,ho,money,year,month,day);
		
	}
}
