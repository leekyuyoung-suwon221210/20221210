package loop;
/*
 * �Ʒ��ڵ�� 1 2 3 4 5 ������Ǵµ�... �̰� 2 4 6 8 10 �� ��µǵ��� ����
 */
public class Sample1 {

	public static void main(String[] args) {
		int count = 2;
		while (count <= 10 ) {
			System.out.println(count);
			count += 2;
		}
		
//		==============  ���� ����� ���ٷ� ����ϵ��� ����   10 8 6 4 2
		System.out.println();
		
		count = 10;
		while (count > 0 ) {
			System.out.println(count);
			count -= 2;
		}

	}

}
