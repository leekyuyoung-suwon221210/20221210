package day2_4.generic.ex;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer(new General(), 5000000, "홍길동"));
		customers.add(new Customer(new TopClass(), 100000000, "김재벌"));
		customers.add(new Customer(new Vip(), 25000000, "박부자"));
		System.out.println(customers);
	}

}
