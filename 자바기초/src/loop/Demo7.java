package loop;

/*
 * prim �Ҽ�..�� �Ǵ��ϴ� ���α׷� (1�� �ڽ����θ� �������� ��)
 * 
 */
public class Demo7 {

	public static void main(String[] args) {
		String str = "54321";
//		��� : 54 43 32 21
		for (int i = 0; i < str.length()-1; i++) {
			System.out.print(str.substring(i,i+2)+" ");
		}
		
	}

}
