package day2_7;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		 Stream<String> ss;
	     List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");
	     
	     // 성이 김씨인 사람들 찾아서 출력
	     // 정렬
	     // 총 몇명인지 출력
	     
//	     names.stream().filter(x->x.charAt(0)=='김').forEach(x->System.out.println(x));
//	     names.stream().filter(x->x.substring(0,1).equals("이")).forEach(x->System.out.println(x));
	     
	     names.stream().sorted().forEach(x->System.out.print(x+" "));
	     System.out.println();
	     System.out.println(names.stream().count());
	     names.stream().sorted(Collections.reverseOrder()).forEach(x->System.out.print(x+" "));

	}

}
