
public class Demo7 {

	public static void main(String[] args) {
		int number = 2;
		while(number < 10) 
		{
			String str = String.format("%d %d %d %d %d %d %d %d %d", 
					number*1,number*2,number*3,number*4,
					number*5,number*6,number*7,number*8,number*9);
			System.out.println(str);
			number++;
		}

	}

}
