package function;

/* �Լ��� ���� : ��ɾ���� ����
 * 
 * �Լ� ����� ��� �Ǵ� ���
 * 1 �Է�x ���x
 * 2 �Է�o ���o
 * 3 �Է�x ���o
 * 4 �Է�o ���x
 * 
 * �Լ��� ����ϴ� ����
 * 1. �ڵ��� �� ���
 * 2. ������ �ڵ带 �����ϰ� ��� - �ϰ��� ������ �Լ��� ���� �� �Լ����� �����ϰ� ���̹��ؼ� �ش� ����� �߻������� ���� ����
 * 
 * ���� ���α׷�
 * �������� �����ڵ� - �Լ� ( å�� ����)
 */
public class Sample1 {
	// 1
	public static void funA() 
	{
		System.out.println("funA ȣ��");
	}
	
	public static void main(String[] args) {
		System.out.println("�Լ� ȣ�� ��");
		funA();  // �Լ� ȣ��
		System.out.println("�Լ� ȣ�� ��");
		
		
		
	}

}
