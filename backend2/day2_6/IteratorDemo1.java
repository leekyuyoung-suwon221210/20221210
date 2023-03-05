package day2_6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo1 {

	public static void main(String[] args) {
		Collection<String> list = Arrays.asList("a","b","c");
//		for (String string : list) {
//			System.out.println(string);
//		}
//		list.forEach(x->System.out.println(x));
		
		Iterator<String> it = list.iterator();		
		while (it.hasNext()) {			
			System.out.println(it.next());
		}		
		it = list.iterator();		
		while (it.hasNext()) {			
			System.out.println(it.next());
		}

	}

}
