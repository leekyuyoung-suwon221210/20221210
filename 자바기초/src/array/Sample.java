package array;
/*
 * 1���� 2���� 3����... n ����
 * 1���� 2����
 * index ����  0���ͽ���
 * �ݺ����ϰ� ����
 * �˰��� �����ϰų� �����ϱ� ����(search sort)
 */
public class Sample {

	public static void main(String[] args) {
		// 10 ��
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
