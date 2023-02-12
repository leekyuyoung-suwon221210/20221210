package java_8day;

import java.util.ArrayList;

public class ListDemo3 {

	public static void main(String[] args) {
		// 어레이 리스트를 만들고
		// 임의의 값을 넣어주고(갯수는 맘대로) - 랜덤하게 넣어주세요.
		// foreach 라는 순환문으로 순환
		
		ArrayList<Integer> ary = new ArrayList<Integer>();
		for (int i = 0; i < 20; i++) {
			ary.add( (int)(Math.random()*20) );
		}
		
		System.out.println(ary);
		System.out.println("-".repeat(100));
		
		// 10보다 큰 수만 출력
		for (Integer data : ary) {
			if(data > 10)
				System.out.print(data+" ");
		}

	}

}
