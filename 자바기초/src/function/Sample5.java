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
 * 1. �ڵ��� �� ��� - ������ �� ���
 * 2. ������ �ڵ带 �����ϰ� ��� - �ϰ��� ������ �Լ��� ���� �� �Լ����� �����ϰ� ���̹��ؼ� �ش� ����� �߻������� ���� ����* 
 * 
 * 
 * ���� ���α׷�
 * �������� �����ڵ� - �Լ� ( å�� ����)
 * �Լ��� �� ��ɿ� ����ؾ� �Ѵ�. - ���� �Լ� ����� ���
 * �ʹ� ���� ����� ���� ����... ����� ������ �������� �Լ��� �����Ѵ�. -- �����
 */


public class Sample5 {

	public static void showMe() {
		System.out.println("hello");
		System.out.println("world");
	}
	
//	1. �ڵ��� �� ���
	public static void main(String[] args) {
		
		int number = 10;		
		
		if (number > 10) {
			showMe();
		}else if(number > 5) {
			showMe();			
		}else if(number > 1) {
			showMe();
		}else {
			showMe();
		}
		
		
	}

}
