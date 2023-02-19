package day2;

public class TeanAger extends Person{

	private static final double DISCOUNT = 0.35;
	private static int count = 0;	
	TeanAger(){count++; }
	
	
	public static int getCount() {
		return count;
	}


	@Override
	public int getPrice() {		
		return (int)(this.price * (1-DISCOUNT));
	}

}
