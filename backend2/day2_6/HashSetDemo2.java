package day2_6;

import java.util.HashSet;
import java.util.Set;

class Fruit{
	String name;
	public Fruit(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}
	@Override
	public boolean equals(Object obj) {
		Fruit target = (Fruit)obj;
		return this.name.equals(target.name);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.name.hashCode();
	}	
}

public class HashSetDemo2 {	
	public static void main(String[] args) {
		Set<Fruit> fruits = new HashSet<Fruit>();
		fruits.add(new Fruit("apple"));
		fruits.add(new Fruit("apple"));		
		fruits.add(new Fruit("banana"));
		// set의 성질을 이해하면서
		// fruits 의 개수출력 
		System.out.println(fruits.size());
		// 모든 요소를 출력
		fruits.forEach(x->System.out.println(x));
		
		Fruit f1 = new Fruit("pineapple");
		Fruit f2 = new Fruit("pineapple");
		System.out.println(f1.equals(f2));
	}
}







