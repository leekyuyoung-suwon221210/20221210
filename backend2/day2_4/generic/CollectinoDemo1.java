package day2_4.generic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectinoDemo1 {

	public static void main(String[] args) {
		String[] names = {"a","b","a","c","b","a"};
		
		List<String> lists =  Arrays.asList(names);
		System.out.println(lists);
		// Q  names 배열의 중복을 제거해라.
		Set<String> sets = new HashSet<String>(lists);
		System.out.println(sets);
		// 최종타입은 String[]로 변환 				

	}

}
