package function;

/* �Լ��� ���� : ��ɾ���� ����
 * 
 * �Լ� ����� ��� �Ǵ� ���
 * 1 �Է�x - void   ���x
 * 2 �Է�o ���o
 * 3 �Է�x - void ���o
 * 4 �Է�o ���x
 * 
 * �Լ��� ����ϴ� ����
 * 1. �ڵ��� �� ���
 * 2. ������ �ڵ带 �����ϰ� ��� - �ϰ��� ������ �Լ��� ���� �� �Լ����� �����ϰ� ���̹��ؼ� �ش� ����� �߻������� ���� ����
 * 
 * ���� ���α׷�
 * �������� �����ڵ� - �Լ� ( å�� ����)
 */
public class Sample2 {

	public static int addnum(int a, int b) // ��������
	{
		return a+b;
	}
	
	public static void main(String[] args) {
		System.out.println("�Լ� ȣ�� ��");
		int a = 10, b = 20;
//		addnum(10 , 20);
		int c = addnum(a,b);
		System.out.println("�Լ� ȣ�� ��");
		
		
		
		
	}

}
