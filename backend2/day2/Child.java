package day2;

public class Child extends Person{
	private static final double DISCOUNT = 0.85;
	private static int count = 0;	
	Child(){count++; }
	
	public static int getCount() {
		return count;
	}
	
	@Override
	public int getPrice() {
		return (int)(this.price*(1-DISCOUNT));
	}

}
