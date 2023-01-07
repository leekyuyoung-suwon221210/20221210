package array;

public class Sample5 {
	// 오름차순  작은 값이 앞으로
	public static boolean ascendingSort(int[] nums) {
		boolean isDone = true;
		for (int i = 0; i < nums.length-1; i++) {			
			if(nums[i] > nums[i+1]) {
				int temp = nums[i];
				nums[i] = nums[i+1];
				nums[i+1] = temp;
				isDone = false;
			}
		}
		return isDone;
	}
	// 배열의 값들은 한줄로 출력
	public static void printArray(int[] nums) {
		for (int i : nums) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		// bubble sort 
		// 1. 두 변수의 값을 서로 exchange
		int a = 10;
		int b = 20;
		int temp = a;
		a = b;
		b = temp;	
		
		// 2. index를 넘어가지 않게 잘 control
		
		// 랜덤하게 초기화
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random()*100);			
		}		
		// 정렬전 확인
		System.out.println("정렬전............");
		printArray(nums);
		
		// 정렬 후
		System.out.println("\n정렬후............");
		// 정렬로직
		for (int i = 0; i < nums.length; i++) {
			System.out.print(i+" : ");
			if(ascendingSort(nums)) break;
			printArray(nums);
			System.out.println();
		}
	}

}
