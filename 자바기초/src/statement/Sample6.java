package statement;
/*
 * 주사위 2개  
 * 던져서 포인트를 부여 
 * 두개의 주사위의 값이 다를때는 합을 구한다.
 * 같을때는 2개의 주사위의 값을 합친 값이 7보다 작으면 그  합의 10배를 포인트
 * 그렇지 않을때는 그 합의 8배를 포인트
 * 
 * 1~6사의의 랜덤한 값을 추출하는 명령어를 만들어서 
 * 
 */
public class Sample6 {

	public static void main(String[] args) {		
		int dice1 = (int)(Math.random()*6) + 1;
		int dice2 = (int)(Math.random()*6) + 1;
		int output = 0;
		if (dice1 == dice2) {		
			if(dice1 + dice2< 7) {
				output = (dice1 + dice2)*10;				
			}else {
				output = (dice1 + dice2)*8;	
			}
		}else 
		{
			output = dice1 + dice2;
		}
		
	}

}
