package day2_4.generic;

import java.util.List;

import day2_4.Bear;
import day2_4.Boricha;

public class GenericDemo {

	public static void main(String[] args) {		
		Cup<Boricha> c = new Cup<Boricha>();
		c.setBeverage(new Boricha());
		Boricha boricha =  c.getBeverage();
		
		Cup<Bear> c2 = new Cup<Bear>();
		c2.setBeverage(new Bear());
		Bear bear =  c2.getBeverage();
		
		
//		Cup c = new Cup();
//		c.setBeverage(new Boricha());
//		Boricha boricha =  (Boricha)c.getBeverage();
//		
//		c.setBeverage(new Bear());
//		Bear bear = (Bear)c.getBeverage();

	}

}
