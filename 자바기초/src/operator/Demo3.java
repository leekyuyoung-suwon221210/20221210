package operator;
/*
 * 논리 연산자
 * 진리표  true 1 / false 0
 * AND 연산자  x
 * 0 AND 0  0
 * 1 AND 0  0
 * 0 AND 1  0 
 * 1 AND 1  1
 * ~이고 ~이다
 * &&
 * 
 * OR 연산자  +   0을 제외한 모든 수는 true
 * 0 OR 0  0
 * 1 OR 0  1
 * 0 OR 1  1 
 * 1 OR 1  2
 * ~이거나 ~ 이다
 * ~ 또는 ~ 이다
 * ||
 */
public class Demo3 {
	public static void main(String[] args) {
		int num = 150;
		boolean temp =  num > 10;
		System.out.println(temp);
		
		temp = !(num>10) || (num < 100);
		System.out.println(temp);
		
	}
}
