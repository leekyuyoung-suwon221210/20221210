package day2_6;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class OperatorDemo2 {

	public static void main(String[] args) {
		
		Comparator<Integer> comparator = (a , b) -> a-b;
		// Integer apply(Integer t, Integer u)
		BinaryOperator<Integer> a = BinaryOperator.maxBy(comparator);
		System.out.println(a.apply(10, 20));
		
		a = BinaryOperator.minBy(comparator);
		System.out.println(a.apply(10, 20));
		
		
		
		
	}

}
