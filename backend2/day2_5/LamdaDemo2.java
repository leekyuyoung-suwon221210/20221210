package day2_5;

interface Printable{
	void print();
}

public class LamdaDemo2 {

	public static void main(String[] args) {
		Printable p;
		p = ()->{ System.out.println("abc");};		
		p = ()-> System.out.println("abc");
		p.print();

	}

}
