package backend1_�⺻�����;


/*
 * Ŭ������ ����
 * ����� ���� ������ Ÿ��
 * ��ü�� ����� ��ü ��ü�� ����ó�� ���
 */
public class Sample2_class {
	// ������ �⺻���� ����
	// ����� ���� ������
	public Sample2_class() {
		System.out.println("�⺻������ ȣ��");
	}
	public Sample2_class(String name) {
		System.out.println("�Ű����� ������ ȣ��");
		System.out.println("�Ű����� : " + name);
	}
	
	private int age;

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// ��ü�� ����ó�� ����Ϸ��� ��ü ��ü�� ����� �� �Լ�
	@Override
	public String toString() {		
		return String.format("age : %d", age);
	}
}
