package loop;
/*
 * Iteration, Enumeration
 * While * 
 * 
 */
public class Demo1 {

	public static void main(String[] args) {
		boolean condition = true;
		
		int count = 0;
		// ���ѷ������ : �����ȿ��� Ż�����ǿ� �ش�ɶ� break ���� ���� Ż��
		while (condition) {
			count++;
			System.out.println(count);
			
			if(count == 5) {
				break;
			}
		}
	}

}
