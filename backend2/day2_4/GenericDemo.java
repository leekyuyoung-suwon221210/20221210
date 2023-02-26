package day2_4;

public class GenericDemo {

	public static void main(String[] args) {
		Cup c = new Cup();
		c.setBeverage(new Boricha());
		Boricha boricha =  (Boricha)c.getBeverage();
		
		c.setBeverage(new Bear());
		Bear bear = (Bear)c.getBeverage();

	}

}
