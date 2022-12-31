package loop;

/*
 * prim 소수..를 판단하는 프로그램 (1과 자신으로만 나눠지는 수)
 * 
 */
public class Demo7 {

	public static void main(String[] args) {
		String str = "54321";
//		출력 : 54 43 32 21
		for (int i = 0; i < str.length()-1; i++) {
			System.out.print(str.substring(i,i+2)+" ");
		}
		
	}

}
