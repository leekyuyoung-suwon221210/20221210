package array;

public class Sample5 {
	// ��������  ���� ���� ������
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
	// �迭�� ������ ���ٷ� ���
	public static void printArray(int[] nums) {
		for (int i : nums) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		// bubble sort 
		// 1. �� ������ ���� ���� exchange
		int a = 10;
		int b = 20;
		int temp = a;
		a = b;
		b = temp;	
		
		// 2. index�� �Ѿ�� �ʰ� �� control
		
		// �����ϰ� �ʱ�ȭ
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random()*100);			
		}		
		// ������ Ȯ��
		System.out.println("������............");
		printArray(nums);
		
		// ���� ��
		System.out.println("\n������............");
		// ���ķ���
		for (int i = 0; i < nums.length; i++) {
			System.out.print(i+" : ");
			if(ascendingSort(nums)) break;
			printArray(nums);
			System.out.println();
		}
	}

}
