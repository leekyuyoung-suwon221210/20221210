package loop;

/*
 * 1 ~ 100������ �� �߿��� 5�� ���(5���� ������ �������� 0�� ��)�� �հ�
 * do ~ while�� ���
 */
public class Sample5 {

	public static void main(String[] args) {		
		
		int sum = 0;
		int i = 1;
		
		do {
			if(i % 5 == 0)
				sum += i;
			i++;
			
		} while (i < 101);
		
		
		System.out.println("count = "+sum);

	}

}
