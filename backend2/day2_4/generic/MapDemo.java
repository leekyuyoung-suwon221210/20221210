package day2_4.generic;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// key value 한쌍... key에 들어가는 값은 unique하다
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("123", 123);
		System.out.println(map.get("123"));
		
		map.put("123", 100); // key값이 같으므로 update
		System.out.println(map.get("123"));
		
		map.put("1234", 100);
		map.remove("1235");
		
		System.out.println(map.size());

	}

}
