package day2_3;

public class WearableComputer implements Weable {

	@Override
	public void puton() {
		System.out.println("컴퓨터 착용");

	}

	@Override
	public void putoff() {
		System.out.println("컴퓨터 벗기");

	}
	public void reset() {
		System.out.println("리셋하기");
	}

}
