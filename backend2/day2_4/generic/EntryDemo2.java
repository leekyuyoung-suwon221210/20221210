package day2_4.generic;

import java.util.HashMap;
import java.util.Map;

public class EntryDemo2 {

	public static void main(String[] args) {
		Map<String, Map<String, Integer>> maps2 = new HashMap<String, Map<String,Integer>>();
		
		Map<String, Integer> maps = new HashMap<String, Integer>();		
		maps2.put("홍길동", maps);		
		maps.put("수학", 90);
		maps.put("영어", 98);
		maps.put("국어", 100);
		maps.put("수학", 98);
		//////////////////////////////////////////////////////////////////
		maps = new HashMap<String, Integer>();		
		maps2.put("철수", maps);		
		
		maps.put("수학", 80);
		maps.put("영어", 88);
		maps.put("국어", 100);
		maps.put("수학", 88);
		
		System.out.println(maps2);
		
		
		
		

	}

}
