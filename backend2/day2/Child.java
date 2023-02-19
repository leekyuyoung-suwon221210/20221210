package day2;

public class Child extends Person{
	private static final double DISCOUNT = 0.85;
	@Override
	public int getPrice() {
		return (int)(this.price*(1-DISCOUNT));
	}

}
