/**
 * 
 * break : 순환문을 탈출
 * continue : 순환문을 처음으로 이동..(continue 밑에 명령문들을 skip 하고 한바퀴 돎)
 *
 */
public class Demo15 {
// 0 ~ 9 숫자 중에서 짝수만 출력 continue를 이용해서
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(i % 2 == 1) {
				continue;
			}
			System.out.println(i);			
		}		
	}
}
