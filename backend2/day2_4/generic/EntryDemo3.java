package day2_4.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EntryDemo3 {

	public static void main(String[] args) {
		List<Map<String, Integer>> lists = new ArrayList<Map<String,Integer>>();
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> maps = new HashMap<String, Integer>();
		for (int i = 0; i < 2; i++) {
			System.out.println("name:");
			String name = sc.next();
			System.out.println("score:");
			int jumsu = sc.nextInt();
			
			maps.put(name,jumsu);
			System.out.println(maps);
			lists.add(maps);	
		}
		System.out.println(lists);
		
		
	}

}
