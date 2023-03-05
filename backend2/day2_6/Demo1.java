package day2_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
		List<String> temp = List.of("333","222","111","444");
		
		List<String> lists = new ArrayList<String>(temp);
		Set<String> sets = new HashSet<String>(temp);
//		Collections.sort(lists,(a,b) -> -1);
		Collections.sort(lists,Collections.reverseOrder());
		System.out.println(lists);		
		
		String[] strarray = {"333","222","111","444"};
		List<String> lists2 =  Arrays.asList(strarray);
		Collections.sort(lists2);
		System.out.println(lists2);
		int index = Collections.binarySearch(lists2, "222");
		System.out.println(index);
		

	}

}
