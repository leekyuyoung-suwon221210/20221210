package review;

public class Review1 {
	private int number;
	
	
	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public static void main(String[] args) {
		// �ּ��� ������ ���� �ʴ� ��ɾ�..
		// �ּ��� ���� : ���α׷� ���� �Ǵ� ���� ����
		
		// ������ Ÿ���� ������ "Ÿ�� ������ = ������"
		// int �� �������� ����Ű�� Ÿ���̴�.
		
		
//		int number = 0;
//		int score = 0;
//		int kore = 0;
//		int eng = 0;
//		int math = 0;
		int number = 0, score = 0, kore = 80, eng = 95, math = 100 ;		
		double mean = 0.0;
		double avg;  // ���� ���� �ϰ� �ʱ�ȭ�� ������.. �̶� avg �������� � ���� ������?  
		// ��������� �ִ� ���� �������� ���� �ݳ��� �ǹ̾��� ������ �Ǵ� �����ͷ� ǥ���ϱ� �Ұ����� ��� ��
		// ������ �ʱ�ȭ�� �ȵȻ��¿����� ��� �Ұ�		
		avg = 0.0;		
		double total = avg + mean;
		
		
		// 1. ��������� ���ÿ� �ʱ�ȭ
		// 2. ������ �����ϰ� ���߿� �ʱ�ȭ
		// �ʱ�ȭ : ���ʷ� ���� ����
		
		// Ÿ���� �Ӽ�... ũ�Ⱑ �ִ�... double > int
		
		// �������� �Ӽ�.... �ǿ����� Ÿ���� �����ϰ� ����
		// + - * /
		// ���Կ����� : ���� Ÿ�Կ� ���� ������ Ÿ���� ����
		
		// ���� Ÿ�Կ��� ->ū Ÿ������ ��ȯ  : �������� ������ ����  �����Ϸ��� �ڵ����� type casting
		double total2 = number;
		//  double total2 = (double)number;
		
		// ū Ÿ�Կ��� ->���� Ÿ������ ��ȯ  : �������� ������ ����   �����ڱ� ���� �������� type casting
		int number2 = (int)total;   // Ÿ�Ժ�ȯ��  (���ϴ�Ÿ��)����
		
		// �Ϲ����� ��Ģ������ ūŸ�� �������� ����
		System.out.println( number + total );
		
		// ���� / ���� �� ����� ����
		
		mean = (kore + eng + math)*1.0 / 3 ;  // 91.6 .....
		System.out.println("��� : " + mean);
		
		
		 

		
		
		
		
		
		
		
		

	}

}
