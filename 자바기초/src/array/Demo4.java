package array;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		String[] uniqueNums = {"20A11","22F37","21G02","22E09","20C29"};
		// uniqueNums ���� ��ȣ
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
			
			// �ε��� ����� �ƴϱ⶧���� �б�����.. �ش� ��ġ���� ���� ���� ����
			// ���� : ������ �����͸� �о���϶�... �ε����� �Ѿ ���� ����
			// ���� : ���� ���� �Ұ�, �ε��������� ��� �ε��� ��ġ�� ��
			String result = "Do not exist";
			for (String str : uniqueNums)  // java 1.4����.... 1.8���� ����ȭ..  1.9  10 11 12  18 19
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
