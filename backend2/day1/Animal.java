package day1;

class Eagle extends Animal{
	String wing;
	void fly() {}
}

class Tiget extends Animal{
	String leg;
	void run() {}
}

class GoldFish extends Animal{
	String fin;
	void swim() {}
}

public class Animal {
	String eye;
	String mouth;
	
	void eat() {}
	void sleep() {}

	public static void main(String[] args) {
		Eagle e = new Eagle();
		
	}

}
