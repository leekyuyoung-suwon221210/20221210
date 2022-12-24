package loop;
/*
 * 아래코드는 1 2 3 4 5 가실행되는데... 이걸 2 4 6 8 10 이 출력되도록 수정
 */
public class Sample1 {

	public static void main(String[] args) {
		int count = 2;
		while (count <= 10 ) {
			System.out.println(count);
			count += 2;
		}
		
//		==============  위의 결과를 꺼꾸로 출력하도록 수정   10 8 6 4 2
		System.out.println();
		
		count = 10;
		while (count > 0 ) {
			System.out.println(count);
			count -= 2;
		}

	}

}
