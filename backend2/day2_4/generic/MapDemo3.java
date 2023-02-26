package day2_4.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo3 {

	public static void main(String[] args) {
		// 정수형 데이터를 랜덤하게 만든다... 10
//		System.out.println( (int)(Math.random()*15) );		
		Map<Integer, Integer> maps = new HashMap<Integer, Integer>();		
		List<Integer> lists = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			lists.add( (int)(Math.random()*5)+1 );
		}		
		System.out.println(lists);
		
		/* hint   vote시스템
		 * 1:3, 2:1, ,4:1, 5:5  -> map형태로 출력
		 */
		for (Integer data : lists) {
			if(!maps.containsKey(data))
				maps.put(data, 1);
			else {
				int a = maps.get(data);
				a++;
				maps.put(data, a);
			}	
		}
		System.out.println(maps);
		
	}

}
