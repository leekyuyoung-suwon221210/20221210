package statement;
/*
 * �ֻ��� 2��  
 * ������ ����Ʈ�� �ο� 
 * �ΰ��� �ֻ����� ���� �ٸ����� ���� ���Ѵ�.
 * �������� 2���� �ֻ����� ���� ��ģ ���� 7���� ������ ��  ���� 10�踦 ����Ʈ
 * �׷��� �������� �� ���� 8�踦 ����Ʈ
 * 
 * 1~6������ ������ ���� �����ϴ� ��ɾ ���� 
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
