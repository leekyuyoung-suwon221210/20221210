package day2_7;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo2 {

	public static void main(String[] args) {
		Stream<String> ss;
		List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");
        List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);
        List<Gender> genders 
        = List.of(Gender.MALE, Gender.FEMALE, 
        		Gender.MALE, Gender.MALE, Gender.MALE, Gender.FEMALE);
        
        System.out.println(ages.stream().reduce(0, (a,b)->a+b));
        System.out.println(ages.stream().max(Integer::compare).get());
        System.out.println(ages.stream().min(Integer::compare).get());
        
        IntStream is =  ages.stream().mapToInt(x->x.intValue());
        System.out.println(is.average().getAsDouble());

	}
}
enum Gender{
	MALE,FEMALE
}
