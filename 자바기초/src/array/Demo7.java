package array;

import java.util.Random;

public class Demo7 {

	public static void main(String[] args) {
		Random rd = new Random();
		// �������� ��� 2 case
		int num1 = rd.nextInt(101);  // case 1		
		int num2 =(int)(Math.random()*101);  // case 2
		
		// 0~ 100 ������ ���� 30���� ������ �迭�� ����  
		// 60���� 100�� ������ ������ � ���� ī��Ʈ		
		// ���, �ְ������� ��������
		
		// �ʱ�ȭ
		int[] nums = new int[30];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rd.nextInt(101);
		}
		
		// search
		int count = 0;
		double avg = 0.0;
		
		int min = 100;
		int max = 0;
		
		for (int n : nums) {
			if(n>=60 && n<=100) {
				count++;
				avg += n;
				if (max < n) max = n;
				if (min > n) min = n;						
			}
		}
		avg /= count;
		String output = String.format("60~100������ ���ڵ��� : %d, �̶� ��� : %f, �ּҰ��� : %d, �ִ밪�� %d", 
				count,avg,min,max);
		System.out.println(output);

	}

}
