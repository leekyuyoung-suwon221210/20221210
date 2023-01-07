package array;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		String[] uniqueNums = {"20A11","22F37","21G02","22E09","20C29"};
		// uniqueNums 고유 번호
		/**
		 * Unique Number or 'q' : 21G02
		 * It exists
		 * 
		 * Unique Number or 'q' : 22A12
		 * Do not exist
		 * 
		 * Unique Number or 'q' : q
		 * End
		 */
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("Unique Number or \'q\' ");
			String input = sc.next();
			if(input.equals("q"))	break;
			
			// 인덱스 방식이 아니기때문에 읽기전용.. 해당 위치에서 값을 변경 못함
			// 장점 : 빠르게 데이터를 읽어들일때... 인덱스가 넘어갈 일이 없음
			// 단점 : 값을 변경 불가, 인덱스개념이 없어서 인덱스 위치를 모름
			String result = "Do not exist";
			for (String str : uniqueNums)  // java 1.4부터.... 1.8가장 보편화..  1.9  10 11 12  18 19
			{
				if(input.equals(str)) 
				{
					result = "It exists";
					break;
				}
			}
			
			System.out.println(result);
			
		}
		
		System.out.println("End");
		
		
		
		
		

	}

}
