package array2d;

public class Sample3 {

	public static void main(String[] args) {
		int[][] nums2d = new int[3][3];
		// �ʱ�ȭ(���� �ʱ�ȭ ���� �˾Ƽ�) - loop
		// ����� ���ó��
		//   0 0 0
		//   0 0 0
		//   0 0 0
		int count = 0;
		for (int i = 0; i < nums2d.length; i++) {
			int[] js = nums2d[i];
			for (int j = 0; j < js.length; j++) {
				js[j] = count++;				
			}			
		}
		
		for (int i = 0; i < nums2d.length; i++) {
			for (int j = 0; j < nums2d[i].length; j++) {
				System.out.print(nums2d[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
