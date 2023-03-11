package day2_7;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Array2StreamDemo {

	public static void main(String[] args) {
		int[] array_int = {1,5,4,8,4,1,4};
		IntStream is =  Arrays.stream(array_int);
		IntStream is2 = IntStream.of(array_int);		
		System.out.println(is2.average().getAsDouble());
		
		String[] strs = {"aa","bb","aa","dd","bb"};
		Stream<String> ss = Stream.of(strs);
		ss.distinct().forEach(x->System.out.println(x + " "));
//		System.out.println(ss.count());
		IntStream is1 = IntStream.iterate(1, x->x+2).limit(10);		
		IntStream is3 = new Random().ints(0, 10).limit(10);
	}

}
