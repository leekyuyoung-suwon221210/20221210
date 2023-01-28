import java.util.Scanner;
// static 이란... 객체없이 클래스명으로 사용가능한 기능으로
// 굳이 객체가 될 이유가 없을때?
// 객체 : 독립적인 데이터를 갖는다... -- 데이터?? 내부에 정의된 변수
// 그런데.. getNumber는 내부 변수를 사용하지않고. 순수 기능만 제공
// 클래스는 클래스로더가 최초 한번 실행될때 static 이 붙은 메소드나 변수를 static 영역에
// 한번만생성해서 프로그램이 끝날때까지 공통적으로 사용한다.

public class Input {
	public static int getNumber() throws Exception {
		Scanner sc = new Scanner(System.in);
		int number = -1;
		try {
			number  = sc.nextInt();			
		} catch (Exception e) {
			throw new Exception("정수만 입력하세요.");
		}finally {
			sc.close();
		}		
		return number;		
	}
	
}
