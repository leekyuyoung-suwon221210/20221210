package java_8day;

import java.util.ArrayList;

public class ListDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 10; i < 15; i++) {
			list.add(i);
		}
		
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		list.set(0, 100);
		
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
