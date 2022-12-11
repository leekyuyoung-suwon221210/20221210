package statement;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// 나이를 입력받아서 미성년자인지 판단하세요 이때 18세 이상이면 성인 그렇지 않으면 미성년자
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요");
		int age =  sc.nextInt();
//		boolean age1 = false;
//		age1 = (age >=18);
//		System.out.println( (age1)? "성인" : "미성년자"  );		
		
		
		System.out.println( (age >=18)? "성인" : "미성년자"  );

	}

}
