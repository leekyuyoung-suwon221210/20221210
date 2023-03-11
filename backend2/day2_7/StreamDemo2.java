package day2_7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamDemo2 {

	public static void main(String[] args) {
		// Stream   필터(조건)-출력
		
		// 로또번호 생성기 1 ~ 45  
		// 중복없이 랜덤하게 번호 생성
		int[] ary = IntStream.iterate(1, x->x+1).limit(45).toArray();
		// 배열을 list로 변환
		
		Arrays.stream(ary).forEach(x->System.out.print(x+" "));
		
				

	}

}
