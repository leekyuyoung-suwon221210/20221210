package day2_4.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Map<String, String>> lists = new ArrayList<Map<String,String>>();
		Map<String, String> maps = new HashMap<String, String>();
		lists.add(maps);
		maps.put("name", "a");
		maps.put("age", "29");
		maps.put("id", "b");	
		
		maps = new HashMap<String, String>();
		lists.add(maps);
		maps.put("name", "f");
		maps.put("age", "39");
		maps.put("id", "g");
		
		System.out.println(lists);
	}

}
