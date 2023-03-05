package day2_6;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// ArrayList 사용하고 이해하기
		// 객체생성
		List<Integer> lists = new ArrayList<Integer>();		
		// 요소저장
		lists.add(1);lists.add(10);lists.add(100);lists.add(1000);		
		// foreach 사용해서 출력하기
		//Consumer<T>   void accept(T t);		
		lists.forEach( x-> System.out.println(x) );
	}

}
