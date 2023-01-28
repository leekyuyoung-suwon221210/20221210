
public class Demo8 {

	public static void main(String[] args) {
		
		for (int number = 2; number < 10 ; number++) 
		{
			String str = String.format("%d %d %d %d %d %d %d %d %d", 
					number*1,number*2,number*3,number*4,
					number*5,number*6,number*7,number*8,number*9);
			System.out.println(str);			
		}

	}

}
