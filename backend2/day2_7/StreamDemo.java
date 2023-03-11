package day2_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class StreamDemo {

	public static void main(String[] args) {
		Random r = new Random();		
		// 정수형 리스트 객체를 생성
		List<Integer> lists = new ArrayList<Integer>();
		// 해당 리스트에 랜덤한 정수형 값을 저장  10개 r.nextInt(30);
		for (int i = 0; i < 10; i++) {
			lists.add(r.nextInt(30));
		}
		
//		//1, Collection 방식
//		// 정수형 리스트 객체를  생성
//		List<Integer> lists2 = new ArrayList<Integer>();
//		// 위에서 저장한 리스트중에서 값이 10이상인 데이터만 새로운 리스트에 저장
//		for (Integer data : lists) {
//			if(data >=10)
//				lists2.add(data);
//		}
//		// 정렬
//		Collections.sort(lists2);
//		// 출력		
//		System.out.println(lists2);
		
		//2.Streaming 방식
		lists.stream().filter(x-> x >=10).sorted().forEach(x-> System.out.print(x + " "));

	}

}
