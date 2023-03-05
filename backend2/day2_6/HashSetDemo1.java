package day2_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.IntFunction;

public class HashSetDemo1 {

	public static void main(String[] args) {
		String[] fruits = {"apple","banana","pineapple","grap"};
		Set<String> sets = new HashSet<String>();		
		
		for (String s : fruits) {
			sets.add(s);
		}	
		
		// 과일바구니에 바나나가 들어 있는지 확인
		System.out.println(sets.contains("banana"));
		
		// array <-> collection
		// Arrays
		List<String> lists = Arrays.asList(fruits);
		Object[] listsArray =  lists.toArray();
		for (Object object : listsArray) {
			System.out.println(object.toString());
		}
	}

}
