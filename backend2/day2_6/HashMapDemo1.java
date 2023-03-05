package day2_6;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class HashMapDemo1 {

	public static void main(String[] args) {
		Map<String, Integer> maps = Map.of("lee",95,"kim",100);
		Map<String, Integer> peoples = new HashMap<String, Integer>(maps);
		
		Map<Student, Integer> stMap = new HashMap<Student, Integer>();
		stMap.put(new Student("kim"), 10);
		stMap.put(new Student("lee"), 20);
		stMap.put(new Student("kim"), 5);
		System.out.println(stMap);		
		BiConsumer<String, String> bic = (a,b)-> System.out.println(a+b);
		bic.accept("aaa", "bbb");
		
		stMap.forEach( (k,v)-> System.out.println("key:"+k.getName()+" value:"+v) );
		
		
		

	}

}
