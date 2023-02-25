package day2_3;

import java.util.ArrayList;
import java.util.List;

public class WeableDemo {

	public static void main(String[] args) {
		// Weable 을 담는 리스트를 만들어서
		// puton을 실행
		List<Weable> lists = new ArrayList<Weable>();
		lists.add(new WearableComputer());
		lists.add(new WearableComputer());
		lists.add(new HadePhone());
		
		for (Weable weable : lists) {
			weable.puton();
		}

	}

}
