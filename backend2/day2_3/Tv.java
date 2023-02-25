package day2_3;

public class Tv extends Repaire implements Controllerable {

	@Override
	public void turnOff() {		
		System.out.println("Tv 전원종료");
	}

	@Override
	public void turnOn() {		
		System.out.println("Tv 전원켜기");
	}

	@Override
	void repaire() {		
		System.out.println("Tv 수리하기");
	}
	
	
	
}
