package loop;
/*
 * -1���� -5���� ���� ���ϼ��� ��ȯ�� �̿�
 */
public class Sample2 {

	public static void main(String[] args) {
		int count = -1;
		int sum = 0;

		while (count >= -5) {
			sum += count;
			count--;
		}
		System.out.println(sum);

	}

}
