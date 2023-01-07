package array;
/*
 * 1차원 2차원 3차원... n 차원
 * 1차원 2차원
 * index 개념  0부터시작
 * 반복문하고 궁합
 * 알고리즘 구현하거나 이해하기 쉽다(search sort)
 */
public class Sample {

	public static void main(String[] args) {
		// 10 개
		String apple = "Apple";
		String banana = "Banana";
		String orange = "Orange";
		
		
		String fruit[] = new String[3];		
		System.out.println(fruit.length);
		fruit[0] = "Apple";
		fruit[1] = "Banana";
		fruit[2] = "Orange";
		
		for (int i = 0; i < fruit.length; i++) {
			System.out.println(fruit[i]);
		}
		
		int numbers[] = {10,5,8,4,2,0,1,2,5,1,4,11,4,1,4,7,1}; 
		int max = -1;
		for (int i = 0; i < numbers.length; i++) {
			if(max < numbers[i]) {
				max = numbers[i];
			}
			
		}
		
		
		
		
		
		
		
		

	}

}
