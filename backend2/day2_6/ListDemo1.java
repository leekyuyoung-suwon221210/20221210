package day2_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		String[] animals1 = {"aa","bbbb","ccc"};
		List<String> animals2 = Arrays.asList(animals1);
		animals2.set(1,"tt");
//		animals2.add("tt");
//		animals2.forEach(x->System.out.println(x));
		
		List<String> animals3 = new ArrayList<String>(animals2);
		animals3.add(1,"t");
//		System.out.println("-------------------------------------");
//		animals3.forEach(x->System.out.println(x));
		// 정렬..... 문자열 길이 기준으로 animals3를 오름차순 또는 내림차순으로 정렬
		
		animals3.sort( (a,b) -> -1  );
		animals3.forEach(x->System.out.println(x));		
	}

}
