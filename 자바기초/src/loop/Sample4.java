package loop;

/*
 * 1 ~ 100������ �� �߿��� 3�� ���(3���� ������ �������� 0�� ��)�� ����� ī��Ʈ �ؼ� ���
 */
public class Sample4 {

	public static void main(String[] args) {		
		int count = 0;
		int i = 1;
		
		while(i < 101) {
			if(i % 3 == 0)
				count++;
			i++;
		}
		System.out.println("count = "+count);

	}

}
