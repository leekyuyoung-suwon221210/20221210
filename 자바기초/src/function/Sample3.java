package function;

/* �Լ��� ���� : ��ɾ���� ����
 * 
 * �Լ� ����� ��� �Ǵ� ���
 * 1 �Է�x    ���x  - void
 * 2 �Է�o ���o
 * 3 �Է�x  ���o
 * 4 �Է�o ���x - void
 * 
 * �Լ��� ����ϴ� ����
 * 1. �ڵ��� �� ���
 * 2. ������ �ڵ带 �����ϰ� ��� - �ϰ��� ������ �Լ��� ���� �� �Լ����� �����ϰ� ���̹��ؼ� �ش� ����� �߻������� ���� ����
 * 
 * ���� ���α׷�
 * �������� �����ڵ� - �Լ� ( å�� ����)
 */
public class Sample3 {

	public static String intro() // ��������
	{
		return "hello world";
	}
	
	public static void main(String[] args) {
		System.out.println("�Լ� ȣ�� ��");
		
		String str = intro();
		System.out.println(str);
		
//		System.out.println( intro()  );
		System.out.println("�Լ� ȣ�� ��");
		
		
		
		
	}

}
