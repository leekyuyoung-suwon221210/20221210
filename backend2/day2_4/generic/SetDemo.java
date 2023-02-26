package day2_4.generic;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> sets = new HashSet<String>();
		sets.add("a");
		sets.add("a");
		sets.add("a");
		sets.add("a");
		sets.add("a");
		sets.add("a");
		sets.add("a");
		System.out.println(sets);
		System.out.println(sets.size());

	}

}
