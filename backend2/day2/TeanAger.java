package day2;

public class TeanAger extends Adult{

	private static final double DISCOUNT = 0.35;
	@Override
	public int getPrice() {		
		return (int)(this.price * (1-DISCOUNT));
	}

}
