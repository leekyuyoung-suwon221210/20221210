package backend1_�⺻�����;

public class Sample1 {

	public static void main(String[] args) {
		// ���ڿ� + ��� Ÿ�� --> ��� Ÿ���� ���ڿ��� �����ϰ�  ���ڿ��� ��ģ��
		int number = 12;
		System.out.println("���� �µ� :  ");
		System.out.println("���� �µ� :  " + number);
		System.out.println( number + 100);
		System.out.println(""+ number + 100);
		
		// ������ ������ ������ ���ڿ��߿��� ��ġ ���̳� ��Ÿ ����� �ٲ�
		// ������ ������ ���ڿ��� ���鶧
		
		// ������, �հ���, ������
		
		String aptName = "�Ｚ";
		String dong = "101";
		String ho = "105";
		int money = 12000;
		String year = "2023";
		String month = "01";
		String day = "01";
		// 000����Ʈ 000��00ȣ �� ������� 0000�� �Դϴ�.  0000�� 00�� 00�ϱ��� �������ּ���
		
//		System.out.println(aptName+"����Ʈ"+" "+dong+"��");
		System.out.printf("%s����Ʈ %s��%sȣ �� ������� %d�� �Դϴ�.  %s�� %s�� %s�ϱ��� �������ּ���",
				aptName,dong,ho,money,year,month,day);
		
	}
}
